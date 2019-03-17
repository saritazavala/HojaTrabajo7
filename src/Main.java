/*
Sara Zavala 18893
Hoja de Trabajo 7
Estructura de Datos
Binary Tree: Diccionario
*/

import java.io.*;
import java.util.*;
public class Main {

    public static void main(String args[]){

        //Variables
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la direccion de su .txt");
        String doc = teclado.nextLine();
        File file = new File(doc);
        FileReader fileR = null;
        BufferedReader file2 = null;
        boolean leeer = false;



            try {
                fileR = new FileReader(file);
                file2 = new BufferedReader(fileR);
                leeer = true;


            } catch (FileNotFoundException | java.lang.NullPointerException e) {
                System.out.println("No se encontro el archivo "+file.getName());
            }

            if (leeer==true) {
                try {
                    String lines = "";
                    while ((lines = file2.readLine()) != null) {
                        System.out.println(lines);
                    }
                } catch (IOException | java.lang.NullPointerException e) {
                    e.printStackTrace();

                }
            }

        }








}
