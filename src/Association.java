/*
Sara Zavala 18893
Hoja de Trabajo 7
Estructura de Datos
Binary Tree: Diccionario
*/

public class Association <K,V>{
    private Association izquierda;
    private Association derecha;
    private String espaniol;
    private String ingles;

    //Constructor

    public Association(){
        derecha = null;
        izquierda = null;
        espaniol = "";
        ingles = "";

    }

    public Association(String espaniol, String ingles) {
        this.espaniol = espaniol;
        this.ingles = ingles;
    }

    public void setIzquierda(Association izquierda) {
        this.izquierda = izquierda;
    }

    public void setDerecha(Association derecha) {
        this.derecha = derecha;
    }

    public void setEspaniol(String espaniol) {
        this.espaniol = espaniol;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }
}
