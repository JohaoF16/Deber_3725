
package Clases;

public class Clase_Cubo {
    int ancho;
    int alto;
    int profundo;
    
    public Clase_Cubo(){
        
    }
    public Clase_Cubo(int a,int b,int c){
        this.ancho = a;
        this.alto = b;
        this.profundo = c;
    }
    public int volumenCubo(int a, int b, int c){
        return a*b*c;
    }
}