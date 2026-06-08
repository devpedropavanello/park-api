package com.devpavanello.park_api.web.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioCreateDto {

    private String username;
    private String password;
}
