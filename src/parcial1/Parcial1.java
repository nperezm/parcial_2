/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import javax.swing.JOptionPane;

/**
 *
 * @author nicho
 */
public class Parcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Primero, definimos las variables de los numeros que vamos a sumar.
        int sum;
        int num2;
        int num;
        String cosita;
        
        //Pedimos el primer numero.
        cosita = JOptionPane.showInputDialog("Ingrese el primer numero: ");
        num = Integer.parseInt(cosita);
        
        //Pedimos el segundo numero.
        cosita = JOptionPane.showInputDialog("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(cosita);
        
        //Sumamos los numeros que nos han dado y los mostramos.
        sum = num + num2;
        
 
        
        System.out.println("La suma es: " +sum);

    }
    
}
