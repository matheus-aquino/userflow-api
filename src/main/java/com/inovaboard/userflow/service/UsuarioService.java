package com.inovaboard.userflow.service;

import com.inovaboard.userflow.entity.Usuario;
import com.inovaboard.userflow.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired // com essa anotação, eu não preciso instanciar o objeto (UsuarioRepository repo = new UsuarioRepository();), pois ela já faz isso pra mim 
    private UsuarioRepository usuarioRepository;

    public Usuario salvarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }
}
