package com.biblioteca.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Genera getter, setters, toString, equals, hashCode y un constructor con los campos requeridos
@Data
//Genera un constructor con todos los campos
@AllArgsConstructor
//Genera un constructor sin argumentos
@NoArgsConstructor
public class Libro {

    private int id;
    private String isbn;
    private  String titulo;
    private String editorial;
    private int fechaPublicacion;
    private String autor;
}
