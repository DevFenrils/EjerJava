/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;

/**
 *
 * @author Jorge
 */
public class Persona {

    private String nombre;
    private Integer edad;
    private String dni;
    private char sexo;
    private Double peso;
    private Double altura;
    static final char[] LETTERS = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X','B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = "";
        this.sexo = 'M';
        this.peso = 0.00;
        this.altura = 0.00;
    }

    public Persona(String nombre, Integer edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = "";
        this.sexo = sexo;
        this.peso = 0.00;
        this.altura = 0.00;
    }

    public Persona(String nombre, Integer edad, String dni, char sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Integer calcularIMC(Double peso, Double altura) {
        Double total = peso / (altura * altura);
        if (total > 25) {
            return 1;
        } else if (total >= 20) {
            return 0;
        } else {
            return -1;
        }
    }

    public Boolean esMayorDeEdad(Integer edad) {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    private char comprobarSexo(char sexo) {
        if (sexo != 'M' || sexo != 'H') {
            return 'H';
        } else {
            return sexo;
        }
    }

    public String toString() {
        return "Nombre: el nombre de la persona"
                + "Edad: la edad de la persona"
                + "Dni: el número de identificación de la persona"
                + "Sexo: Hombre(H) o Mujer(M) , (por defecto Hombre)"
                + "peso: peso en kg"
                + "altura: estatura en metros";
    }

    public String generaDNI() {
        Integer numeros = randomNumber();
        String dni = addLetter(numeros);
        return dni;
    }

    public Integer randomNumber() {
        
        int r = (int) (Math.random() * (99999999 - 100000000)) + 100000000;
        return r;
        
    }
    
    public String addLetter(Integer numeros){
        int resto = numeros % 23;
        char letra = LETTERS[resto];
        String dni = Integer.toString(resto) + Character.toString(letra);
        return dni;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }

}
