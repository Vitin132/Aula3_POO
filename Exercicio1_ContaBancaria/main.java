/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1_ContaBancaria;

import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        contaCorrente c1 = new contaCorrente(0);
        
        
        System.out.println("Qual o saldo atual?");
        c1.saldo = sc.nextDouble();
        
        System.out.println("Deseja sacar ou depositar?");
        String opcao = sc2.nextLine();
        
        if(opcao.equalsIgnoreCase("sacar")){
            System.out.println("Digite o valor:");
            double saque = sc.nextDouble();
            c1.sacar(saque);
            
        }else if(opcao.equalsIgnoreCase("depositar")){
            System.out.println("Digite o valor:");
            double deposito = sc.nextDouble();
            c1.depositar(deposito);
            System.out.println("Saldo atual: "+c1.getSaldo());
        }

    }

}
