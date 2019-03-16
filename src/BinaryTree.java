/*
Sara Zavala 18893
Hoja de Trabajo 7
Estructura de Datos
Binary Tree: Diccionario
*/
public class BinaryTree<E> implements Comparable<E> {

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



    @Override
    public int compareTo(E e) {
        return 0;
    }


    //METODOS


    //Insert Element
    
}

