/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Jorge
 */
public class Cuenta {

    public String titular;
    public Double cantidad;
    
    
    public Cuenta(String getTitular) {
        titular = getTitular;
        cantidad = 0.00;
    }
    
    public Cuenta(String getTitular, Double getCant) {
        titular = getTitular;
        cantidad = getCant;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String tit) {
        this.titular = tit;
    }
    
    public String toStringTitular() {
        return "Accede o setea el nombre del titular de la cuenta";
    }
    
    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cant) {
        this.cantidad = cant;
    }
    
    public String toStringCantidad() {
        return "Accede o setea la cantidad de dinero de la cuenta";
    }
    
    public void ingresar(Double cant) {
        if(cant > 0){
            this.cantidad += cant;
        }
    }
    
    public void retirar(Double cant) {
        
        if(cant > this.cantidad){
            this.cantidad = 0.00;
        }else{
            this.cantidad -= cant;
        }
    }

}
