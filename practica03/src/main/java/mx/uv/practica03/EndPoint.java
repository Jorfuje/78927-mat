package mx.uv.practica03;

import java.util.ArrayList;

import javax.xml.ws.Response;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.t4is_uv_mx.saludos.BuscarRequest;
import https.t4is_uv_mx.saludos.BuscarResponse;
import https.t4is_uv_mx.saludos.EliminarRequest;
import https.t4is_uv_mx.saludos.EliminarResponse;
import https.t4is_uv_mx.saludos.MostrarResponse;
import https.t4is_uv_mx.saludos.SaludarRequest;
import https.t4is_uv_mx.saludos.SaludarResponse;

@Endpoint
public class EndPoint {
    
    public static ArrayList<String> saludos = new ArrayList<>();

    @PayloadRoot(localPart = "SaludarRequest", namespace="https://t4is.uv.mx/saludos")
    @ResponsePayload
    public SaludarResponse Saludar( @RequestPayload  SaludarRequest peticion) {
        SaludarResponse response= new SaludarResponse();
        response.setRespuesta("Hola "+peticion.getNombre());
        saludos.add(peticion.getNombre());
        return response;
    }


    @PayloadRoot(localPart = "BuscarRequest", namespace="https://t4is.uv.mx/saludos")
    @ResponsePayload
    public BuscarResponse Buscar( @RequestPayload  BuscarRequest peticion) {
        BuscarResponse response= new BuscarResponse();
        if(peticion.getId() > saludos.size())
            response.setNombre("El id ingresado es mas grande que la lista");
        else
            response.setNombre(saludos.get(peticion.getId()));
        return response;
    }
    
    
}


