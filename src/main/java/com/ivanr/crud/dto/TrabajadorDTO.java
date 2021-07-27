package com.ivanr.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrabajadorDTO {

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
}
