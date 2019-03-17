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
        BinaryTree<Association<String, String>> tree = new BinaryTree<>();
        String doc = teclado.nextLine();
        File file = new File(doc);
        FileReader fileR = null;
        BufferedReader file2 = null;
        boolean leeer = false;


        String fichero = doc;
        try {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            String linea;
            while((linea = br.readLine()) != null)
                System.out.println(linea);

            fr.close();
        }
        catch(Exception e) {
            System.out.println("Excepcion leyendo fichero "+ fichero + ": " + e);
        }


    }
}
