/*
Sara Zavala 18893
Hoja de Trabajo 7
Estructura de Datos
Binary Tree: Diccionario
*/

//Referencias
//Codigo basado en esta página
//https://www.baeldung.com/java-binary-tree
//BinaryTree.java documento subido por Ingeniero Douglas
public class Node<E> {



    Node<E> derecha;
    Node<E> izquierda;
    E e;


    public Node(E e){
        this.e = e;
        derecha = null;
        izquierda = null;

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

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
