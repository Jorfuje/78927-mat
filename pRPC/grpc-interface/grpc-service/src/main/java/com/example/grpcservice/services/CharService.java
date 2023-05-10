package com.example.grpcservice.services;

import java.util.Random;

import org.lognet.springboot.grpc.GRpcService;

import com.faxterol.grpcdemo.interfaces.EnviarMensaje;
import com.faxterol.grpcdemo.interfaces.RecibirMensaje;
import com.faxterol.grpcdemo.interfaces.ChatServiceGrpc.ChatServiceImplBase;
import com.google.rpc.context.AttributeContext.Response;

import io.grpc.stub.StreamObserver;

//Servicio gRPC
@GRpcService
public class CharService extends ChatServiceImplBase {

    private Random random = new Random();

    @Override
    public void enviarMensaje(EnviarMensaje request, StreamObserver<RecibirMensaje> responseObserver) {
        System.out.println("MultiplesMensajesStream - Nuevo mensaje recibido: " + request);
        // Crea la respuesta
        RecibirMensaje response = RecibirMensaje.newBuilder()
                .setFrom(1)
                .setMessage("Hello back!")
                .build();

        // Envia el mensaje
        responseObserver.onNext(response);

        // Cierra la conexión
        responseObserver.onCompleted();
    }

    // Stream unidireccional de cliente a servidor
    @Override
    public StreamObserver<EnviarMensaje> enviarMultiplesMensajes(StreamObserver<RecibirMensaje> responseObserver) {
        return new StreamObserver<EnviarMensaje>() {

            @Override
            public void onNext(EnviarMensaje value) {
                System.out.println("MultiplesMensajesStream - Nuevo mensaje recibido: " + value);
            }

            @Override
            public void onError(Throwable t) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'onError'");
            }

            @Override
            public void onCompleted() {
                RecibirMensaje response = RecibirMensaje.newBuilder()
                        .setFrom(random.nextInt())
                        .setMessage("Hola mundo desde el servidor!")
                        .build();

                // Envia el mensaje
                responseObserver.onNext(response);

                // Cierra la conexión
                responseObserver.onCompleted();
            }

        };
    }

    // Stream bidireccional
    @Override
    public StreamObserver<EnviarMensaje> enviarRecibirMultiplesMensajes(
            StreamObserver<RecibirMensaje> responseObserver) {
        return new StreamObserver<EnviarMensaje>() {

            @Override
            public void onNext(EnviarMensaje value) {
                System.out.println("MutiplesMensajesSteam - Nuevo mensaje recibido: " + value);
                RecibirMensaje mensajeRespuesta = null;
                for (int i = 0; i < 10; i++) {
                    mensajeRespuesta = RecibirMensaje.newBuilder()
                            .setFrom(random.nextInt())
                            .setMessage("Hola bidireccion stream desde servidor " + random.nextDouble())
                            .build();
                    responseObserver.onNext(mensajeRespuesta);
                }

                // responseObserver.onCompleted();
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                RecibirMensaje mensajeRespuesta = null;
                for (int i = 0; i < 10; i++) {
                    mensajeRespuesta = RecibirMensaje.newBuilder()
                            .setFrom(random.nextInt())
                            .setMessage("Hola bidireccional desde servidor " + random.nextDouble())
                            .build();
                    responseObserver.onNext(mensajeRespuesta);
                }
                //responseObserver.onCompleted();
            }

        };
    }

    //Steam unidireccional servidor-cliente
    public void recibirMultiplesRespuestas(EnviarMensaje request, StreamObserver<RecibirMensaje> responseObserver ){
        RecibirMensaje response = null;
        for (int i = 0; i < 10; i++) {
            response = RecibirMensaje.newBuilder()
                    .setFrom(random.nextInt())
                    .setMessage("Hola steam desde servidor " + random.nextInt())
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }
}
