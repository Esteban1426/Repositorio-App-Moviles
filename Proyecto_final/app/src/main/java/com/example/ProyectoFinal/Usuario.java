package com.example.ProyectoFinal;

public class Usuario {
    // Atributos de la clase Usuario
    private String nombre;
    private String apellidos;
    private String edad;
    private String email;
    private String telefono;
    private String pais;

    // Constructor vacío que se requiere para la insercion de datos a la base de datos por Firebase Firestore
    public Usuario() {

    }

    // Constructor que contiene los parámetros para inicializar los atributos de la clase
    public Usuario(String nombre, String apellidos, String edad, String email, String telefono, String pais) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
        this.pais = pais;
    }

    // Métodos getters para obtener los valores de los atributos
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getPais() {
        return pais;
    }

    // Métodos setters para establecer los valores de los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
