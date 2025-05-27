/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX15_Operacoes;

/**
 *
 * @author Vitor
 */
public class main {

    public static void main(String[] args) {

        operacoesMatematicas soma = new Soma();
        operacoesMatematicas sub = new Subtracao();
        operacoesMatematicas multi = new Multiplicacao();
        operacoesMatematicas divisao = new Divisao();

        double num1 = 200;
        double num2 = 25;
        
        
        System.out.println("Soma: " + soma.calcular(num1, num2));
        System.out.println("Subtração: " + sub.calcular(num1, num2));
        System.out.println("Multiplicação: " + multi.calcular(num1, num2));
        System.out.println("Divisão: " + divisao.calcular(num1, num2));

    }
}
