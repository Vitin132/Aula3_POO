/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Exercicio1_ContaBancaria;

/**
 *
 * @author Vitor
 */
public interface Conta {
    
    public abstract void depositar(double valor);
    public abstract void sacar(double valor);
    public abstract double getSaldo();
    
    
    
}
