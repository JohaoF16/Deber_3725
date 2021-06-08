
package Clases;

public class Prueba_Cuadrilatero {
    public static void main(String[] args) {
        Clase_Cuadrilatero obj1 = new Clase_Cuadrilatero(8,4);
        System.out.println("Cuadrilatero");
        System.out.println("Perimetro del Cuadrilatero: "+obj1.perimetro(3));
        System.out.println("Area del Cuadrilatero: "+obj1.area(3, 5));
        
        Clase_Cuadrilatero obj2 = new Clase_Cuadrilatero(6);
        System.out.println("Cuadrado");
        System.out.println("Perímetro del Cuadrado: "+obj2.perimetro(6));
        System.out.println("Area del Cuadrado: "+obj2.area(6,6));
        
    }
    
}
