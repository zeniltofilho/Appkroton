package com.zenilto.cursoskroton.recursos;

import com.zenilto.cursoskroton.entidades.Usuario;
import com.zenilto.cursoskroton.repository.UsuarioRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api
@RequestMapping("/usuario")
public class UserResource {
    @Autowired
    UserRepository userRepository;

    @GetMapping
    ResponseEntity<?> cadastrarPerfil() {

        List<Usuario> usuario = userRepository.findAll();
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(usuario);
    }


}
