/*
Sara Zavala 18893
Hoja de Trabajo 7
Estructura de Datos
Binary Tree: Diccionario
*/

public class Node {

    String ingles;
    String espaniol;
    Node izquierda;
    Node derecha;

    //Constructor

    public  Node(){
        derecha = null;
        izquierda = null;
        ingles = "";
        espaniol = "";
    }

    //Constructor x2


    public Node(String ingles, String espaniol) {
        this.ingles = ingles;
        this.espaniol = espaniol;
        derecha = null;
        izquierda = null;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    public String getEspaniol() {
        return espaniol;
    }

    public void setEspaniol(String espaniol) {
        this.espaniol = espaniol;
    }

    
}
