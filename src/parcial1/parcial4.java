/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

/**
 *
 * @author nicho
 */
public class parcial4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creamos un vector de 10 campos.
        int[] vector = new int [10];
        
        //Ahora, llenamos cada uno de los campos del vector.
        for(int i = 0; i <= vector.length; i++){
            vector[i]= (int)(Math.random()*9)+1;
            
        }System.out.print(vector[5]);
    }
    
}
