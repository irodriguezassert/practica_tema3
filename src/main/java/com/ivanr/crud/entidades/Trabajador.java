package com.ivanr.crud.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="trabajadores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trabajador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
}
