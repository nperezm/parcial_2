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
public class parcial2 {
    public static void main(String[] args) {
        // TODO code application logic here
        //COMENZAMOS DEFINIENDO LA VARIABLE.
        int num;
        int num4=0;
        String numerito;
        
        //Ingresamos el numero de pisos.
        numerito = JOptionPane.showInputDialog("Ingrese la cantidad de pisos que quiere");
        num = Integer.parseInt(numerito);
        //Comezamos a hacer los pisos verticales.
        for(int num2 = num; num2 > 0;num2--){
            for(int j = 0; j < num2; j++){
                System.out.print("+");
            }
            System.out.println(" ");
        }
 
    }
    
}


