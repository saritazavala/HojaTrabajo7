/*
Sara Zavala 18893
Hoja de Trabajo 7
Estructura de Datos
Binary Tree: Diccionario
*/

public class Association<K,V> implements Comparable<Association<K,V>> {



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

    public boolean equals(Object other)
    {
        Association otherAssoc = (Association)other;
        return getKey().equals(otherAssoc.getKey());
    }


    @Override
    public int compareTo(Association<K, V> kvAssociation) {
        return 0;
    }
}
