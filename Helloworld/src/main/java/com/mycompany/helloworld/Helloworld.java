/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.helloworld;
import javax.swing.JOptionPane;



/**
 *
 * @author Alumno
 */
// crear una nueva clase
public class Helloworld {
    //definimos para la suma
    public static int sumar(int a, int b) {
        return a + b;
    }
    // definimos para resta
 public static int restar(int a, int b) {
        return a - b;
    }
 // creamos la funcion main
     public static void main(String[] args) {
     //lramar las v ariables
        int num1 = 10;
        int num2 = 5;

        int resultadoSuma = sumar(num1, num2);
        int resultadoResta = restar(num1, num2);
//digitamos sout y tap  para mostrar los resultados
  System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println("Resultado de la resta: " + resultadoResta);
        
     }
 
}
