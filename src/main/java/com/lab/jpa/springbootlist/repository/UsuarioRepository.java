package com.lab.jpa.springbootlist.repository;

import com.lab.jpa.springbootlist.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.ScopedValue;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findUsuarioByUsername(String username);
    Boolean existsUsuarioByUsername(String username);
}
