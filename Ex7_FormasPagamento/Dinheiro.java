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
public class Dinheiro  implements formaPagamento{

    @Override
    public void efetuarPagamento(double valor) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor a ser pago: ");
        valor = sc.nextDouble();
        
        System.out.println("O pagamento no valor de "+valor+" foi efetuado com dinheiro.");
        
        
    }
    
    
    
    
    
}
