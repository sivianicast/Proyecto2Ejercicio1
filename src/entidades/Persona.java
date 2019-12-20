/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author siviany
 */
public class Persona {
    String nombre;
    String apellido;
    char sexo;
    int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, char sexo, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "El nombre es: " + this.nombre 
                +"\nEl apellido es: " + this.apellido
                +"\nEl sexo es: " + this.sexo
                +"\nLa edad es:" + this.edad;
    }
    
}
