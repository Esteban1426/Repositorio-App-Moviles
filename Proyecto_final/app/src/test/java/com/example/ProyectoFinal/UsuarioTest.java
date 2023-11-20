package com.example.ProyectoFinal;

import org.junit.Test;
import static org.junit.Assert.*;

//Prueba de Unitaria para la verificacion de informacion por medio de los Gettters and Setters
public class UsuarioTest {

    @Test
    public void testSetAndGetNombre() {
        // Crear una instancia de Usuario
        Usuario usuario = new Usuario();

        // Establecer el nombre usando el método set
        usuario.setNombre("Juan");

        // Verificar que el nombre obtenido sea igual al valor establecido
        assertEquals("Juan", usuario.getNombre());
    }

    @Test
    public void testSetAndGetApellidos() {
        // Crear una instancia de Usuario
        Usuario usuario = new Usuario();

        // Establecer los apellidos usando el método set
        usuario.setApellidos("Pérez");

        // Verificar que los apellidos obtenidos sean iguales al valor establecido
        assertEquals("Pérez", usuario.getApellidos());
    }

    @Test
    public void testSetAndGetEdad() {
        // Crear una instancia de Usuario
        Usuario usuario = new Usuario();

        // Establecer la edad usando el método set
        usuario.setEdad("25");

        // Verificar que la edad obtenida sea igual al valor establecido
        assertEquals("25", usuario.getEdad());
    }

    @Test
    public void testSetAndGetEmail() {
        // Crear una instancia de Usuario
        Usuario usuario = new Usuario();

        // Establecer el email usando el método set y forzando un error para verificar su funcionamiento
        usuario.setEmail("juan@hotmail.com");

        // Verificar que el email obtenido sea igual al valor establecido
        assertEquals("juan@gmail.com", usuario.getEmail());
    }

    @Test
    public void testSetAndGetTelefono() {
        // Crear una instancia de Usuario
        Usuario usuario = new Usuario();

        // Establecer el teléfono usando el método set
        usuario.setTelefono("3115405887");

        // Verificar que el teléfono obtenido sea igual al valor establecido
        assertEquals("3115405887", usuario.getTelefono());
    }

    @Test
    public void testSetAndGetPais() {
        // Crear una instancia de Usuario
        Usuario usuario = new Usuario();

        // Establecer el país usando el método set
        usuario.setPais("España");

        // Verificar que el país obtenido sea igual al valor establecido
        assertEquals("España", usuario.getPais());
    }
}
