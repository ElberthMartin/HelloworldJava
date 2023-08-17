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
    //definimos para resta
 public static int restar(int a, int b) {
        return a - b;
    }
 // creamos la funcion main
     //public static void main(String[] args) {
     //lramar las v ariables
   public static void main(String[] args) {
        // Pedir al usuario que elija una operación
        String[] opciones = { "Suma", "Resta" };
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una operación:", "Calculadora",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));

        int resultado = 0;
        String operacion = "";
//digitamos sout y tap  para mostrar los resultados
  // Realizamos las  las operaciones asignasdas
             // Realizam la operación seleccionada
        switch (seleccion) {
            case 0:
                resultado = sumar(num1, num2);
                operacion = "suma";
                break;
            case 1:
                resultado = restar(num1, num2);
                operacion = "resta";
                break;
        }
        // Mostraremos el resultado usando JOptionPane
        JOptionPane.showMessageDialog(null, "Resultado de la " + operacion + ": " + resultado);

    }
}