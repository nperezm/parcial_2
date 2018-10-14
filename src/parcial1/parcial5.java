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
public class parcial5 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Definimos nuestra matriz
         int [] [] matriz = new int [10] [10];
         
         //Llenamos nuestra matriz en forma de cuadrito y la llenamos con numeros aleatorios
        for(int i=0; i < matriz.length; i++){
            for ( int j=0; j<matriz[i].length; j++){
                matriz[i][j]= (int)(Math.random()*9)+1;
                System.out.print(matriz[i][j]);
                int a = matriz[i][i];
            }
            System.out.println();   
        }//Este println.solo nos va a servir como un espacio entre la matriz y la suma.
        System.out.println(" ");
        //Aca mostraremos la suma de esta ecuacion.
        for(int i=0;i< matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                if(i==j){
                    int sum = 0;
                    int a = matriz[i][i];
                    sum = sum + a;
                    System.out.println(sum);
                }
            }
        }
    }
}
