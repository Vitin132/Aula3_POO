/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX11_Forma;

/**
 *
 * @author Vitor
 */
public class main {
    public static void main(String[] args) {
        
        Quadrado Q = new Quadrado(10);
        Triangulo T = new Triangulo(10, 15, 8, 5, 3);
        Circulo C = new Circulo(10);
        
        System.out.println("Area do quadrado: "+Q.calcularArea());
        System.out.println("Perimetro do quadrado: "+Q.calcularPerimetro());
        
        System.out.println("Area do triangulo: "+T.calcularArea());
        System.out.println("Perimetro do triangulo: "+T.calcularArea());
        
        System.out.println("Area do circulo: "+C.calcularArea());
        System.out.println("Perimetro do circulo: "+C.calcularPerimetro());
        
    }
}
