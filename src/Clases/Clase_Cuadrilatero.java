
package Clases;


public class Clase_Cuadrilatero {
    int lado1;
    int lado2;
    
    public Clase_Cuadrilatero(){
        
    }
    public Clase_Cuadrilatero(int a, int b){
        this.lado1 = a;
        this.lado2 = b;
    }
    public Clase_Cuadrilatero(int a){
        this.lado1 = this.lado2 = lado1; 
    }
    public int area(int a, int b){
        return a*b;
    }
    public int perimetro(int a){
        return (a+a)*2;
    }
}
