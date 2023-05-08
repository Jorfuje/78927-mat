package mx.uv.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import mx.uv.demo.models.UsuarioModel;
import mx.uv.demo.services.UsuarioServices;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioServices usuarioServices;

    @GetMapping
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioServices.obtenerUsuarios();
    }

    @PostMapping
    public UsuarioModel guardaUsuarioModel(@RequestBody UsuarioModel usuario){
        return this.usuarioServices.guardarUsuario(usuario);
    }

    @GetMapping ( path = "/{uid}")
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("uid") Long uid){
        return this.usuarioServices.obtenerPorId(uid);
    }

    @GetMapping ( "/query")
    public ArrayList<UsuarioModel> obtenerUsuaruioPorEdad(@RequestParam ("edad") Integer edad){
        return this.usuarioServices.obtenerPorEdad(edad);
    }
    
    @DeleteMapping ( path = "/{uid}" )
    public String eliminarPorId(@PathVariable ("uid") Long uid){
        boolean ok = this.usuarioServices.eliminarUsuario(uid);
        if (ok){
            return "Se elimino el usuario con id " + uid;
        } else{
            return "No se pudo elominar el usuario con id " + uid;
        }
    }

    @RequestMapping ( value = "/saludarPost", method = RequestMethod.POST)
    public String saludarPost(@RequestBody UsuarioModel usuarioModel) {
        return "Hola: " + usuarioModel.getNombre() + " " + usuarioModel.getApodo();
    }
    
}
