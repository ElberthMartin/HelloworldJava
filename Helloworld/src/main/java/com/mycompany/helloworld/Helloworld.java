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
    /*definimos para resta
 public static int restar(int a, int b) {
        return a - b;
    }
 // creamos la funcion main
     public static void main(String[] args) {
     //lramar las v ariables
        int num1 = 10;
        int num2 = 5;
*/
        // Pedimos al usuario que elija una operación
        String[] opciones = { "Suma", "Resta" };
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una operación:", "Calculadora",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));

//digitamos sout y tap  para mostrar los resultados
  System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println("Resultado de la resta: " + resultadoResta);
       
     }

    
    
 
}
