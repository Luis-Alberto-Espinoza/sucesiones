/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis.espinoza.sucesiones;


/**
 *
 * @author Espinoza
 */
/*PROGRAMACIÓN

Realice en java el código de un programa que tenga el siguiente menú de opciones

El usuario ingresa 10 numeros de una sucesión, el programa determina si la sucesión es geométrica o aritmética

El programa genera 20 numeros de esa serie y los muestra.

Además muestra la suma de n términos de la sucesión (la cantidad de términos a sumar lo ingresa el usuario)*/
/**
 *
 * @author Espinoza
 */
public class Main {

    public static void main(String[] args) {
        Servicio cal = new Servicio();
        Entity en = new Entity();
        Ventana ventana = new Ventana();
//        //                     x    y 
        ventana.setBounds(0, 0, 555, 540);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
