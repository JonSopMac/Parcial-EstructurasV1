
package com.mycompany.parcialestructurasv1;

//@ Autor Jonathan Cabrera

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class ParcialEstructurasV1 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        int opcion = 0, valor=0, valorCliente=0;
        String producto = null;
        
        try{
           do{
               opcion = Integer.parseInt(JOptionPane.showInputDialog("\t\t*** Mac Center Colombia***"
                                         + "\n1. Registro Datos"
                                         + "\n2. Mostrar Datos"
                                         + "\n3. Salir"));
         switch(opcion){
             case 1 -> {producto = JOptionPane.showInputDialog("Digite el nombre del producto: ");
                        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del producto: "));
                        valorCliente = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de dinero entregada por el cliente: "));
                }
                 
             case 2 -> {if(valor<valorCliente){
                           JOptionPane.showMessageDialog(null,"producto:        "+ producto +""
                                           + "\nValor del Producto:             "+ valor +"$"
                                           + "\nValor pado por el cliente:      "+ valorCliente +"$"
                                           + "\nSus vueltas son:                "+ (valorCliente-valor)+"$");
                       }
                       else{
                           JOptionPane.showMessageDialog(null,"producto:        "+ producto +""
                                           + "\nValor del Producto:             "+ valor +"$"
                                           + "\nValor pagado por el Cliente:    "+ valorCliente +"$"
                                           + "\nEl cliente esta deviendo:       "+ (valor-valorCliente)+"$");
                       }
                      if(valorCliente==valor){
                           JOptionPane.showMessageDialog(null,"producto:        "+ producto +""
                                           + "\nValor del Producto:             "+ valor +"$"
                                           + "\nValor pagado por el Cliente:    "+ valorCliente +"$"
                                           + "\n Producto pagado totalmente");
                      }
                } 
                 
             case 3 -> JOptionPane.showMessageDialog(null,"Gracias...");
         } 
              
        } while (opcion != 3);
       }catch(HeadlessException | NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Error");
         }     
    }
}
