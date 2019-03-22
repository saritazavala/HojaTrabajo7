/*
Sara Zavala 18893
Hoja de Trabajo 7
Estructura de Datos
Binary Tree: Diccionario
*/


//Codigo referenciado de este link
//www.cs.pomona.edu/classes/cs062/structure5/Association.java
//Lo cambié y me basé para recordar la estructura
//http://www.cs.williams.edu/~jeannie/cs136/javadoc/structure5/structure5/ComparableAssociation.html
//https://stackoverflow.com/questions/52641366/how-to-make-an-object-of-association-comparable-by-only-one-generic-parameter-ty

public class Association<K extends Comparable<K>, V> implements Comparable<Association<K, V>> {

    private K key;
    private V value;

    //Constructor


    public Association(K key, V value) {
        this.key = key;
        this.value = value;
    }

    //Sets y gets


    public void setKey(K key) {
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    //Metodos de Association

    public boolean equals(Object other)
    {
        Association<K,V> otherAssoc = (Association<K,V>)other;
        return getKey().equals(otherAssoc.getKey());
    }

    public int hashCode()
    {
        return getKey().hashCode();
    }


    @Override
    public int compareTo(Association<K, V> o) {
        return key.compareTo(o.getKey());
    }

    @Override
    public String toString() {
        return "Association{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

