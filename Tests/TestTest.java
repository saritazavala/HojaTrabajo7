import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTest<E> {

    @Test

    public void Test1(){

        Node<E> root;
        BinaryTree<Association<String, String>> arbol = new BinaryTree<>();
        arbol.addRecursive(new Association("hello", "hola"));
        arbol.toString();
    }

    public void Test2(){
        Node<E> root;
        BinaryTree<Association<String, String>> arbol2 = new BinaryTree<>();
        arbol2.addRecursive(new Association("hello", "hola"));
        arbol2.addRecursive(new Association("yo", "me"));
        arbol2.addRecursive(new Association("el", "he"));
        arbol2.traversePreOrder(arbol2.getRoot());

    }

    public void Test3(){
        BinaryTree<Association<String, String>> arbol2 = new BinaryTree<>();
        arbol2.addRecursive(new Association("hello", "hola"));
        arbol2.addRecursive(new Association("yo", "me"));
        arbol2.addRecursive(new Association("el", "he"));
        arbol2.traversePreOrder(arbol2.getRoot());
    }

    public void Test4(){
        BinaryTree<Association<String, String>> arbol2 = new BinaryTree<>();
        arbol2.addRecursive(new Association("hello", "hola"));
        arbol2.addRecursive(new Association("yo", "me"));
        arbol2.addRecursive(new Association("el", "he"));
        arbol2.mostrarInorder(arbol2.getRoot());
    }

}