/*
Sara Zavala 18893
Hoja de Trabajo 7
Estructura de Datos
Binary Tree: Diccionario
*/

public class Node<E> {

    private String keyingles;
    private String valueespaniol;
    private Node<E> izquierda;
    private Node<E> derecha;

    //Constructor

    public  Node(){
        derecha = null;
        izquierda = null;
        keyingles = "";
        valueespaniol = "";
    }

    //Constructor x2

    public Node(String keyingles, String valueespaniol, Node<E> izquierda, Node<E> derecha) {
        this.keyingles = keyingles;
        this.valueespaniol = valueespaniol;
        this.izquierda = izquierda;
        this.derecha = derecha;
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

    public Node<E> getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Node<E> izquierda) {
        this.izquierda = izquierda;
    }

    public Node<E> getDerecha() {
        return derecha;
    }

    public void setDerecha(Node<E> derecha) {
        this.derecha = derecha;
    }
}
