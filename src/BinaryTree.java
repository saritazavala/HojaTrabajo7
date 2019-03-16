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
    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, E value) {
        if (current == null) {
            return new Node<E>(value);
        }

        if (value < current.value) {
            current.izquierda = addRecursive(current.izquierda, value);
        } else if (value > current.value) {
            current.derecha = addRecursive(current.derecha, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }


}

