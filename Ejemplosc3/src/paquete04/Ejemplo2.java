/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        double[][] dato2 = new double [2][3];
        double[][] dato1 = {{1, 2, 3},{6, 8, 9}}; //
        double valor;
        /*
            1   4   3
            36  64  9
        */
        for (int n1 = 0; n1 < dato1.length; n1++) {
            for (int n2 = 0; n2 < dato1[n1].length; n2++) {
                valor = dato1[n1][n2] ;
                if(valor%2 ==0){
                    dato2[n1][n2] = Math.pow(valor, 2) ;                   
                }else
                     dato2[n1][n2] = valor;
            }
        }
        System.out.println("Presentación de valores:");
        for (int n1 = 0; n1 < dato2.length; n1++) {
            for (int n2 = 0; n2 < dato2[n1].length; n2++) {
                System.out.printf("%.0f\t", dato2[n1][n2]);
            }
            System.out.println(); 
        }
        //Denis Ruiz
        
    }
    
}
