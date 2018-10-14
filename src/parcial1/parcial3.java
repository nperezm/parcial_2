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
public class parcial3 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Definir las variables.
        String nombre;
        String color;
        String objeto;
        String edad;
        
        //Comenzamos definiendo el JOptionPane y preguntamos el nombre!.
        nombre = JOptionPane.showInputDialog("Inserte un nombre");
        
        //Pregutamos por el color.
        color = JOptionPane.showInputDialog("Inserte un color");
        
        //Preguntamos por la cosa.
        objeto = JOptionPane.showInputDialog("Inserte un cosa");
        
        System.out.print(nombre+ " Era la persona de la cual esta triste historia habla\n"
                + "pues mientras se encontraba caminando por el bosquecon su chaqueta color\n"
                + color +", cayo en un pozo, quedando asi con heridas de letal gravedad. \n"
                        + "mientras estaba en el pozo, solo le acompañaba su "+objeto+", que\n"
                                + "acompaña sus doloroso padecimiento. Hoy en dia, solo podemos ver\n"
                                + "el pozo donde "+nombre+" y su "+objeto+" murieron juntos.");
    }
    
}

