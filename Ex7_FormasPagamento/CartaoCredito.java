/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex7_FormasPagamento;

import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class CartaoCredito implements formaPagamento {
    
    Scanner sc = new Scanner(System.in);
    
    @Override
    public void efetuarPagamento(double valor) {
        
        System.out.println("Qual o valor a ser pago?");
        valor = sc.nextDouble();
        
        System.out.println("Pagamento de "+valor+" efetuado com sucesso!");
        
    }
    
    
    
    
    
}
