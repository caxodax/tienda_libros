package com.example.tienda_libros.servicio;

import com.example.tienda_libros.modelo.Libro;

import java.util.List;

public interface ILibroServicio {

    public List<Libro> ListarLibros();

    public  Libro buscarLibroporId(Integer idlibro);
    public void guardarLibro(Libro libro);

    public void eliminarLibro(Libro libro);
}
