/*
Sara Zavala 18893
Hoja de Trabajo 7
Estructura de Datos
Binary Tree: Diccionario
*/


/* Referencias

****************Tutorias recibidas durrante las ultimas semanas*******************
http://www.dit.upm.es/~pepe/doc/adsw/tema1/023_diccionarios.pdf
https://www.lawebdelprogramador.com/codigo/Java/2257-Arboles-binarios-de-busqueda.html
https://intercambiosos.org/showthread.php?t=26253
https://users.dcc.uchile.cl/~bebustos/apuntes/cc3001/Diccionario/
https://www.youtube.com/watch?v=zYRV5mVhlaE
Libro de texto de la clase de Java
* */
import java.io.*;
import java.util.*;

import java.io.*;
import java.util.*;


//LA IDEA DEL SPLIT Y AGREGARLO A UNA LISTA LA TOME DE MI
//HDT6, LA DE LAS CARTAS
public class Main {
    public static void main(String[] args) {

        File f;
        FileReader fr;
        BufferedReader br;
        BinaryTree<Association<String, String>> tree1 = new BinaryTree<>();
        ArrayList<String> documento = new ArrayList<String>();

//PRIMERO SE VA A TRATAR DE LEER EL PRIMER DICCIONARIO. SE VAN A REMPLAZAR LOS PARENTESIS
        //CON ESPACIOS EN BLANCOS, Y LUEGO SE VA A SPLITEAR CUANDO SE ENCUENTRE UNA COMA
        //LA POSICION 0 VA A SER EL KEY Y LA 1 EL VALUE
        try{
            f = new File("diccionario.txt");
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String linea;
            while((linea = br.readLine())!= null){
                linea = linea.replaceAll("[()]", "");
                String[] datos = linea.split(",");
                tree1.addRecursive(new Association<String, String>(datos[0],datos[1]));
                System.out.println(linea);
            }
            br.close();
            fr.close();
            //SE CIERRA EL DOCUMENTO

            //Segundo documento
            //SE LEE EL SEGUNDO DICCIONARIO
            f = new File("Diccionario2.txt");
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            //MIENTRAS SEA DISTINTO A NULL, SE VA A REMPLAZAR CADA PARENTESIS CON UN ESPACIO
            while((linea = br.readLine())!= null){
                linea = linea.replaceAll("[()]", "");
                System.out.println(linea);
                String palabras = "";
                //Ciclo for para recorrer desde 0 hasta el lenght de la lidea
                for (int x=0; x<linea.length();x++){
                    if ((!" ".equals(linea.substring(x, x+1)))
                            && (!".".equals(linea.substring(x, x+1)))){
                        palabras += linea.substring(x, x+1);
                    }
                    else {
                        //Asocioacion resultante = al resultado de nuestri arbol
                        Association<String,String> result = tree1.containsRecursive(new Association(palabras, ""));
                        if (result != null){
                            documento.add(result.getValue());
                        } else{
                            documento.add("*"+palabras+"*"); }
                        palabras ="";
                    }
                }
            }
            //Se va a ir agregando
            linea ="";
            for (int i=0;i<documento.size();i++){
                linea = linea +" "+documento.get(i);

            }
            //Se cierra
            System.out.println(linea);
            br.close();
            fr.close();


        }catch(Exception e){
            System.err.println("Se produjo un error");
        }

        //semuestra en pantalla
        tree1.mostrarInorder(tree1.getRoot());
        tree1.toString();
        //arbol.mostrarInorder(arbol.getRoot().izquierda);
        //arbol.mostrarInorder(arbol.getRoot());
        System.out.println("\n");

    }

}