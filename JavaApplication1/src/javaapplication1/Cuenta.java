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

    private String titular;
    private Double cantidad;
    
    
    public Cuenta(String getTitular) {
        this.titular = getTitular;
        this.cantidad = 0.00;
    }
    
    public Cuenta(String getTitular, Double getCant) {
        this.titular = getTitular;
        if(getCant < 0){
            this.cantidad = 0.00;
        }else{
            this.cantidad = getCant;
        }
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
        
        this.cantidad -= cant;
        
        if(this.cantidad < 0){
            this.cantidad = 0.00;
        }
    }

}
