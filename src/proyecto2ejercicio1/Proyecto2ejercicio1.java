/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2ejercicio1;

import entidades.Persona;
import javax.swing.JOptionPane;

/**
 *
 * @author siviany
 */
public class Proyecto2ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "";
        String apellido = "";
        char sexo = ' ';
        int edad = 0;
        boolean volver = false;
        nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        apellido = JOptionPane.showInputDialog("Ingrese el apellido");
        do {
            volver = false;
            try {
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad "));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo numeros");
                volver = true;
            }
        } while (volver);
        sexo = JOptionPane.showInputDialog("Ingrese el sexo").toUpperCase().charAt(0);
        Persona persona = new Persona(nombre, apellido, sexo, edad);
        JOptionPane.showMessageDialog(null, persona.toString());
    }
}
