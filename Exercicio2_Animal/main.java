/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2_Animal;

/**
 *
 * @author Vitor
 */
public class main {
    public static void main(String[] args) {
        
        Cachorro c = new Cachorro();
        Gato g = new Gato();
        Passaro p = new Passaro();
        
        System.out.print("Cachorro: ");
        c.emitirSom();
        System.out.print("Gato: ");
        g.emitirSom();
        System.out.print("Passaro: ");
        p.emitirSom();
        
        
        
    }
}
