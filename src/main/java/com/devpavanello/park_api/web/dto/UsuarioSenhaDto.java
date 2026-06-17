package com.devpavanello.park_api.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioSenhaDto {

    @NotBlank
    @Size(min = 6, max = 6, message = "a senha deve ter exatamente 6 caracteres")
    private String senhaAtual;
    @NotBlank
    @Size(min = 6, max = 6, message = "a senha deve ter exatamente 6 caracteres")
    private String novaSenha;
    @NotBlank
    @Size(min = 6, max = 6, message = "a senha deve ter exatamente 6 caracteres")
    private String confirmaSenha;
}
