package mx.uv.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.uv.demo.models.UsuarioModel;
import mx.uv.demo.repositories.UsuarioRepository;

@Service
public class UsuarioServices {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<UsuarioModel> obtenerPorId(Long uid){
        return usuarioRepository.findById(uid);
    }

    public ArrayList<UsuarioModel> obtenerPorEdad(Integer edad){
        return usuarioRepository.findByEdad(edad);
    }

    public boolean eliminarUsuario(Long uid){
        try{
            usuarioRepository.deleteById(uid);
            return true;
        } catch(Exception err){
            return false;
        }
    }

}
