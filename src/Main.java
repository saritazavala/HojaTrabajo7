/*
Sara Zavala 18893
Hoja de Trabajo 7
Estructura de Datos
Binary Tree: Diccionario
*/

import java.io.*;
import java.util.*;
public class Main {

    public static void main(String args[]) {

        //Variables
        Scanner teclado = new Scanner(System.in);
        BinaryTree<Association<String, String>> tree = new BinaryTree<>();


        while (true) {
            System.out.println("--------Menu---------");
            System.out.println("Opciones:");
            System.out.println("1. Mostrar ordenado el diccionario");
            System.out.println("2. Traducir txt");
            System.out.println("3. Salir");
            System.out.println("Ingrese la opcion deseada");

            


            String seleccion = teclado.nextLine();
            if (seleccion.equals("1")) {
                tree.mostrarInorder(tree.root);
                System.out.println("holi");
            } else if (seleccion.equals("2")) {

            } else if (seleccion.equals("3")) {
                break;
            } else {
                System.out.println("Ingrese opcion válida");
            }




        }

    }


}


