/*
Sara Zavala 18893
Hoja de Trabajo 7
Estructura de Datos
Binary Tree: Diccionario
*/
public class BinaryTree<E extends Comparable<E>>{

    Node<E> root;

    //Constructores

    public BinaryTree(){
        root = null;
    }

    public BinaryTree(Node<E> root) {
        this.root = root;
    }

    public Node<E> getRoot() {
        return root;
    }

    public void setRoot(Node<E> root) {
        this.root = root;
    }


    //METODOS

    //Is Empty :v el primerito jaja

    public boolean isEmpty(){
        return  root == null;
    }


    //Insert Element

}

