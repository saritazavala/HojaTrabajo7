/*
Sara Zavala 18893
Hoja de Trabajo 7
Estructura de Datos
Binary Tree: Diccionario
*/

//Referencias
//Codigo basado en esta página
//https://www.baeldung.com/java-binary-tree
public class Node<E> {


    private Node<E> izquierda;
    private Node<E> derecha;

    //Constructor

    public  Node(){
        derecha = null;
        izquierda = null;

    }

    //Constructor x2

    public Node(Node<E> izquierda, Node<E> derecha) {

        this.izquierda = izquierda;
        this.derecha = derecha;
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
