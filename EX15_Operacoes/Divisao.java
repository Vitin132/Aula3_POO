/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX15_Operacoes;

/**
 *
 * @author Vitor
 */
public class Divisao implements operacoesMatematicas{

    @Override
    public double calcular(double a, double b) {
        
        if (b == 0) {
            System.out.println("Não é possivel dividir por zero.");
        }
        return a / b;
        
        
        
    }
    
    
    
}
