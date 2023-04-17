package mx.uv.inventario;


import java.util.Optional;
import com.github.cliftonlabs.json_simple.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.t4is_uv_mx.inventario.RegistrarRequest;
import https.t4is_uv_mx.inventario.RegistrarResponse;

import https.t4is_uv_mx.inventario.MostrarRequest;
import https.t4is_uv_mx.inventario.MostrarResponse;

import https.t4is_uv_mx.inventario.EliminarRequest;
import https.t4is_uv_mx.inventario.EliminarResponse;

import https.t4is_uv_mx.inventario.ModificarRequest;
import https.t4is_uv_mx.inventario.ModificarResponse;

@Endpoint
public class EndPoint {

    @Autowired
    private IInventariador iInventariador;

    @PayloadRoot(localPart = "RegistrarRequest", namespace = "https://t4is.uv.mx/inventario")
    @ResponsePayload
    public RegistrarResponse Registrar(@RequestPayload RegistrarRequest peticion) {
        RegistrarResponse response = new RegistrarResponse();
        response.setRespuesta("Producto registrado: " + peticion.getNombre() + "!");

        // Persistencia a la bd
        Inventariador inventariador = new Inventariador();
        inventariador.setNombre(peticion.getNombre());
        inventariador.setCategoria(peticion.getCategoria());
        inventariador.setCantidad(peticion.getCantidad());
        iInventariador.save(inventariador);
        
        return response;
    }

    @PayloadRoot(localPart = "ModificarRequest", namespace="https://t4is.uv.mx/inventario")
    @ResponsePayload
    public ModificarResponse Modificar( @RequestPayload  ModificarRequest peticion) {
        ModificarResponse response= new ModificarResponse();

        //Saludador saludador = new Saludador();
        //saludador.setId(peticion.getId());
        //saludador.setNombre(peticion.getNombre());
        Optional<Inventariador> x = iInventariador.findById(peticion.getId());
        Inventariador y = x.get();
        String cadena = "[string]";
        /*if (peticion.getNombre().equals(cadena)){
            response.setRespuesta(y.getId() + ": "+ y.getNombre());
        } else {
            y.setNombre(peticion.getNombre());
            response.setRespuesta(y.getId() + ": "+ y.getNombre());
        }*/
        if(!peticion.getNombre().equals(cadena)){
            y.setNombre(peticion.getNombre());
            response.setRespuesta(y.getId() + ": "+ y.getNombre());
        } else {
            response.setRespuesta(y.getId() + ": "+ y.getNombre());
        }
        if(!peticion.getCategoria().equals(cadena)){
            y.setCategoria(peticion.getCategoria());
            response.setRespuesta(y.getId() + ": "+ y.getNombre());
        } else {
            response.setRespuesta(y.getId() + ": "+ y.getNombre());
        }
        if(peticion.getCantidad() != 0){
            y.setCantidad(peticion.getCantidad());
            response.setRespuesta(y.getId() + ": "+ y.getNombre());
        } else {
            response.setRespuesta(y.getId() + ": "+ y.getNombre());
        }
        iInventariador.save(y);
        
        return response;
    }

    public boolean validar(String cadena) {
		if (cadena.matches("[0-9]*")) {
			return true;
		} else {
			return false;
		}
	}
 

    @PayloadRoot(localPart = "MostrarRequest", namespace = "https://t4is.uv.mx/inventario")
    @ResponsePayload
    public MostrarResponse Mostrar(@RequestPayload MostrarRequest peticion) {
        MostrarResponse response = new MostrarResponse();
        //String listaString="";
        JsonObject datos = new JsonObject();
        Iterable<Inventariador> inventariadores = iInventariador.findAll();
        for (Inventariador x : inventariadores){
            JsonObject datosObject = new JsonObject();
            //listaString = listaString + "id: " + x.getId() + ", nombre: " + x.getNombre() + ", categoria: " + x.getCategoria() +", cantidad: " + x.getCantidad() +"\n";
            datosObject.put("nombre", x.getNombre());
            datosObject.put("categoria", x.getCategoria());
            datosObject.put("cantidad", x.getCantidad());
            datos.put(x.getId().toString(), datosObject);
        }
        response.setNombre(datos.toString());
        return response;
    }

    @PayloadRoot(localPart = "EliminarRequest", namespace="https://t4is.uv.mx/inventario")
    @ResponsePayload
    public EliminarResponse Eliminar( @RequestPayload  EliminarRequest peticion) {
        EliminarResponse response= new EliminarResponse();
        Optional<Inventariador> x = iInventariador.findById(peticion.getId());
        Inventariador y = x.get();
        iInventariador.deleteById(peticion.getId());
        response.setNombre("Eliminado: "+ y.getNombre());
        return response;
    }
    
}
