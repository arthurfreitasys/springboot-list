package com.lab.jpa.springbootlist.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O usuario é obrigatorio")
    @Size(min = 3,max = 20, message = "Usuario deve ter entre 3 e 20 caracteres")
    @Pattern(regexp = "^[a-zA-Z0-9_]+$",
            message = "O usuário só pode conter letras, números e _"
    )
    @Column(name = "username", nullable = false, length = 20, unique = true)
    private String username;

    @NotBlank(message = "A senha é obrigatória")
    @Column(name = "password", nullable = false)
    private String password;

    @NotBlank(message = "O papel é obrigatório")
    @Column(name = "role", nullable = false)
    private String role;

}
