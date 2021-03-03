/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

import java.util.Scanner;


public class Exercicio01 {

    String nome;
    double nota01, nota02, nota03;
    
    
    public static void main(String[] args) {
       
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("========== Seja Bem vindo! ==========");
        
        System.out.println("Digite seu nome completo:");
        String nome = ler.nextLine();
        
        System.out.println("Digite sua primeira nota:");
        double nota01 = ler.nextDouble();
        
        System.out.println("Digite sua segunda nota:");
        double nota02 = ler.nextDouble();
        
        System.out.println("Digite sua terceira nota:");
        double nota03 = ler.nextDouble();
        
        System.out.println("========== Processando... ==========");
        
        System.out.println("A sua média é de... " + (nota01 + nota02 + nota03)  /3);
        
        
        
        
                
        
    }
    
}
