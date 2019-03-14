/*
Sara Zavala 18893
Hoja de Trabajo 7
Estructura de Datos
Binary Tree: Diccionario
*/

public class Node {

    private String keyingles;
    private String valueespaniol;
    private Node izquierda;
    private Node derecha;

    //Constructor

    public  Node(){
        derecha = null;
        izquierda = null;
        keyingles = "";
        valueespaniol = "";
    }

    //Constructor x2


    public Node(String keyingles, String valueespaniol) {
        this.keyingles = keyingles;
        this.valueespaniol = valueespaniol;
        derecha = null;
        izquierda = null;
    }

    public String getKeyingles() {
        return keyingles;
    }

    public void setKeyingles(String keyingles) {
        this.keyingles = keyingles;
    }

    public String getValueespaniol() {
        return valueespaniol;
    }

    public void setValueespaniol(String valueespaniol) {
        this.valueespaniol = valueespaniol;
    }


}
