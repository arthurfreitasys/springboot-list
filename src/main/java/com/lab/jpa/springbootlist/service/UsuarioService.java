package com.lab.jpa.springbootlist.service;

import com.lab.jpa.springbootlist.model.Usuario;
import com.lab.jpa.springbootlist.repository.UsuarioRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsuarioService {
    private final UsuarioRepository repository;
    private final PasswordEncoder passwordEncoder;

    public UsuarioService(UsuarioRepository repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    public void cadastrar(Usuario usuario) {
        if (repository.existsUsuarioByUsername(usuario.getUsername())) {
            throw new RuntimeException("Usuario já existe com esse nome");
        }

        String senhaCriptografada = passwordEncoder.encode(usuario.getPassword());
        usuario.setPassword(senhaCriptografada);

        repository.save(usuario);
    }
}
