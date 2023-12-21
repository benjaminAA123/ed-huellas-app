package com.iesam.huellas.pets.domain;

public class Pet {

    private Integer idPets;
    public String nombre;
    public String descripcion;
    public String color;
    public String raza;
    public String fechaNacimiento;
    public String genero;
    public Boolean favorito;

    public Pet(Integer idPets, String nombre, String descripcion, String color, String raza, String fechaNacimiento, String genero, Boolean favorito) {
        this.idPets = idPets;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.color = color;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.favorito = favorito;
    }


    public Integer getIdPets() {
        return idPets;
    }

    public void setIdPets(Integer idPets) {
        this.idPets = idPets;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Boolean getFavorito() {
        return favorito;
    }

    public void setFavorito(Boolean favorito) {
        this.favorito = favorito;
    }
}
