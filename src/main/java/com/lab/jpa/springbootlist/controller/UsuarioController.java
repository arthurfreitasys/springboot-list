package com.lab.jpa.springbootlist.controller;

import com.lab.jpa.springbootlist.model.Usuario;
import com.lab.jpa.springbootlist.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioService service;

    public UsuarioController(UsuarioService service){
        this.service = service;
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveUsuario(@RequestBody Usuario usuario){
        service.cadastrar(usuario);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Usuario criado com sucesso");
    }


}
