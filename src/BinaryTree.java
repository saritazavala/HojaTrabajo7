/*
Sara Zavala 18893
Hoja de Trabajo 7
Estructura de Datos
Binary Tree: Diccionario
*/

//ESTOS METODOS FUERON TOTALMENTE BASADOS EN LAS SIGUIENTES PAGINAS
////https://www.baeldung.com/java-binary-tree PAGINA PRINCIPAL.
//https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
//https://algs4.cs.princeton.edu/32bst/BST.java.html
//https://www.geeksforgeeks.org/insert-a-node-in-binary-search-tree-iteratively/
//https://www.baeldung.com/java-binary-tree

/**
 * BinaryTreeClass
 * @param <E>
 */
public class BinaryTree<E extends Comparable<E>> {

    Node<E> root; //Atributo clase Nodo

    //Constructores

    public BinaryTree() { //constructor
        root = null;
    }

    public BinaryTree(Node<E> root) { //Constructor x2
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

    //Clsico metodo que devuelve si esta vacio o no
    public boolean isEmpty() {
        return (root == null);
    }

    //Codigo prviamente referenciaso. Ordeamiento InOrder
    public void mostrarInorder(Node<E> nodo) {
        if (nodo != null) {
            mostrarInorder(nodo.izquierda);
            System.out.print(nodo.e + " ");
            mostrarInorder(nodo.derecha);
            //nodo.izquierda.getE();
        }
    }
    //Codigo prviamente referenciaso. Metodo para buscar cierto elemeto
    public E containsRecursive(E value){
        Node<E> current = root;
        while(current!=null){
            if(current.e.equals(value)){
                return current.e;
            }else
            if(current.e.compareTo(value)>0){
                current = current.izquierda;
            }else{
                current = current.derecha;
            }
        }
        return null;
    }

    //Codigo prviamente referenciaso. Extra para orden Pre
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.e);
            traversePreOrder(node.izquierda);
            traversePreOrder(node.derecha);
        }
    }

    //Codigo prviamente referenciaso. Metodo para añadir
    public void addRecursive(E current) {
        Node<E> temp = new Node<E>(current);
        if (root == null) {
            root = temp;
            return;
        }

        Node<E> actual = root;
        Node<E> otro = null;

        while (true) {
            otro = actual;
            if (current.compareTo(actual.e) < 0) {
                actual = actual.izquierda;
                if (actual == null) {
                    otro.izquierda = temp;
                    return;
                }
            } else {
                actual = actual.derecha;
                if (actual == null) {
                    otro.derecha = temp;
                    return;
                }
            }
        }
    }



    //To String
    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}