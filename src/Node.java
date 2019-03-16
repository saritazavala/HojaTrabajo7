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


    Node<E> derecha;
    Node<E> izquierda;
    E coso;


    public Node(E e){
        derecha = null;
        izquierda = null;
        e = coso;
    }

    public Node<E> getDerecha() {
        return derecha;
    }

    public void setDerecha(Node<E> derecha) {
        this.derecha = derecha;
    }

    public Node<E> getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Node<E> izquierda) {
        this.izquierda = izquierda;
    }

    public E getCoso() {
        return coso;
    }

    public void setCoso(E coso) {
        this.coso = coso;
    }
}
