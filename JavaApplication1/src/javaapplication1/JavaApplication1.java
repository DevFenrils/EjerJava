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
public class JavaApplication1 {

    public Cuenta cuenta;
    
    public void main(String[] args) {
        // TODO code application logic here
        
        cuenta = new Cuenta("Jorge Lopez");
        
        cuenta.setCantidad(500.30);
                
        cuenta.ingresar(35.27);
        
        cuenta.retirar(314.00);
        
    }
    
}
