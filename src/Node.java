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

/**
 * Node class.
 * @param <E>
 */
public class Node<E> {

    //Hoja derecha, izquierda y parametro
    Node<E> derecha;
    Node<E> izquierda;
    E e;


    /**
     * Constructor
     * @param e
     */
    public Node(E e){
        this.e = e;
        derecha = null;
        izquierda = null;

    }


    /**
     * Get right leaf
     * @return
     */
    public Node<E> getDerecha() {
        return derecha;
    }

    /**
     * Set right leaf
     * @param derecha
     */
    public void setDerecha(Node<E> derecha) {
        this.derecha = derecha;
    }

    /**
     * Get left leaf
     * @return
     */
    public Node<E> getIzquierda() {
        return izquierda;
    }

    /**
     * Set left leaf
     * @param izquierda
     */
    public void setIzquierda(Node<E> izquierda) {
        this.izquierda = izquierda;
    }

    /**
     * Get E
     * @return
     */
    public E getE() {
        return e;
    }

    /**
     * Set E
     * @param e
     */
    public void setE(E e) {
        this.e = e;
    }

    /**
     * to String created
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }
}