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
        boolean hola = true;


        while (hola ==true) {
            System.out.println("--------Menu---------");
            System.out.println("Opciones:");
            System.out.println("1. Mostrar ordenado el diccionario");
            System.out.println("2. Traducir txt");
            System.out.println("3. Salir");
            System.out.println("Ingrese la opcion deseada");


            try {
                int opcin = teclado.nextInt();
                teclado.nextLine();
                if (opcin == 1) {
                    tree.mostrarInorder(tree.root);
                    System.out.println("holi");
                } else if (opcin == 2) {

                } else if (opcin == 3) {
                    hola = false;
                } else {
                    System.out.println("Ingrese opcion válida");
                }
            } catch (InputMismatchException e){
                System.out.println("Ingrese una opcion disponible");


            }

            }


        }
    }

