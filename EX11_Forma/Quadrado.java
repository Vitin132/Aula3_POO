/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX11_Forma;

/**
 *
 * @author Vitor
 */
public class Quadrado implements forma{

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    
    
    
    
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
    
    
    
    
    
}
