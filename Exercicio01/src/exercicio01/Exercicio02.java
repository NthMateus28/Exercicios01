/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

import java.util.Scanner;

public class Exercicio02 {
    
    String nome;
    
    double raio;
    
public static void main(String[] args) {
    
    Scanner ler = new Scanner (System.in);
    
    System.out.println("========== Seja Muito bem vindo! ==========");
    
    System.out.println("Digite seu nome de usuário:");
    String nome = ler.nextLine();
    
    System.out.println("Digite o raio da circunferência:");
    double raio = ler.nextDouble();
    
    System.out.println("========== Processando... ==========");
    
    System.out.println("O valor do Diâmetro é..." + 2 * raio);
    
    System.out.println("O valor do quadrante é..." + raio /4);
}
    
    
    
}
