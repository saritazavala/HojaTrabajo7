/*
Sara Zavala 18893
Hoja de Trabajo 7
Estructura de Datos
Binary Tree: Diccionario
*/

//https://algs4.cs.princeton.edu/32bst/BST.java.html
//https://www.geeksforgeeks.org/insert-a-node-in-binary-search-tree-iteratively/

public class BinaryTree<E extends Comparable<E>>{

    Node<E> root;

    //Constructores

    public BinaryTree(){
        root = null;
    }

    public BinaryTree(Node<E> root) {
        this.root = root;
    }

    //SETS Y GETS
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




    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.derecha);
            System.out.print(" " + node.e);
            traverseInOrder(node.derecha);
        }
    }

    private Node addRecursive(Node<E> current, E value) {
        if (current == null) {
            return new Node(value);
        }

        if (value.compareTo(current.e) < 0) {
            current.izquierda = addRecursive(current.izquierda, value);
        } else if (value.compareTo(current.e)>0) {
            current.derecha = addRecursive(current.derecha, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public void add(E value) {
        root = addRecursive(root, value);
    }

    private boolean containsNodeRecursive(Node<E> current, E value) {
        if (current == null) {
            return false;
        }
        if (value == current.e) {
            return true;
        }
        return (value.compareTo(current.e) < 0)
                ? containsNodeRecursive(current.izquierda, value)
                : containsNodeRecursive(current.derecha, value);
    }

    public boolean containsNode(E value) {
        return containsNodeRecursive(root, value);
    }

    private Node deleteRecursive(Node<E> current, E value) {
        if (current == null) {
            return null;
        }

        if (value == current.e) {
            // Node to delete found
            // ... code to delete the node will go here
        }
        if (value.compareTo(current.e) < 0) {
            current.izquierda = deleteRecursive(current.izquierda, value);
            return current;
        }
        current.derecha = deleteRecursive(current.derecha, value);
        return current;
    }

    public void delete(E value) {
        root = deleteRecursive(root, value);
    }





}

