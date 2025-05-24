/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1_ContaBancaria;

/**
 *
 * @author Vitor
 */
public class contaCorrente implements Conta {

    double saldo;

    public contaCorrente(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {

        saldo += valor;
        

    }

    @Override
    public void sacar(double valor) {
        
        if (this.saldo > 0 && this.saldo > valor) {
            saldo -= valor;
            System.out.println("Saldo atual: " + saldo);

        } else {
            System.out.println("Saldo insuficiente.");
        }
        
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo() {
        this.saldo = saldo;
    }

}
