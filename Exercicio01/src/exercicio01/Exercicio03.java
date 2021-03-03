/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

import java.util.Scanner;

public class Exercicio03 {
    
    String nome;
    double valor;
    
    public static void main(String[] args) {
    
    Scanner ler = new Scanner (System.in);
    
    System.out.println("========== Olá entusiasta da Matemática!==========");
    
    System.out.println("Estou aqui para ajuda-lo.");
    
    System.out.println("Digite seu nome para começarmos:");
    String nome = ler.nextLine();
    
    System.out.println("Digite algum valor para eu poder te mostrar algumas coisas que podemos fazer com ele:");
    double valor = ler.nextDouble();
    
    System.out.println("O dobro desse número é..." + valor * 2);
    
    System.out.println("O triplo desse valor é..." + valor * 3);
    
    System.out.println("A metade do triplo do dobro é:" + valor * 2 *3 /2);
    
    System.out.println("O quadrado dessa variavel é..." + valor * valor);
    
    System.out.println("A quinta parte do dobro é..." + (valor *2) /5);
    
    
    
    }
    
    
}
