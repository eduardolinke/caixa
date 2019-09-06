/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa;

/**
 *
 * @author UFPR
 */
public class Caixa {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        int valor = 50;
        int[] notas = new int[]{2,5,10,20,50,100};
        int[] notasUsadas = new int[notas.length];
        
        int qtNotas = notas.length - 1;
        for (int i = qtNotas; i >= 0; i--) {
            if (valor % notas[i] == 0) {
                System.out.println(valor /  notas[i] + " x " + notas[i]);
                
            }
        }
        
        
     /*   for (int i = 0; i < notas.length; i++) {
            if (notas[i] == 0) {
                System.out.println(valor/notas[i]+ " x "+notas[i]);
        }
             }*/
        
        
        
        
       /* int[] notasUsadas = new int[]*/
        
        

    }
}
