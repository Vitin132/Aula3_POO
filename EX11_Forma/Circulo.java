/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX11_Forma;

/**
 *
 * @author Vitor
 */
public class Circulo implements forma{
    
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    
    
    
    

    @Override
    public double calcularArea() {
         return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
    
    
    
    
}
