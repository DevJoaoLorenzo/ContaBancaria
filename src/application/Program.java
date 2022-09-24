package application;

import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Program {
     public static void main(String[] args){
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);
         Conta conta;
         System.out.println("Entre com o número da conta: ");
         String number = sc.nextLine();
         System.out.println("Entre com o nome: ");
         String name = sc.nextLine();
         System.out.println("Esse é um depósito inicial? (s/n)");
         char choice = sc.next().charAt(0);
         if(choice=='s'){
             System.out.println("Entre com o valor do depósito: ");
             double primeiroDeposito = sc.nextDouble();
             conta = new Conta(number, name, primeiroDeposito);
         } else{
             conta = new Conta(number, name);
         }

         System.out.println("O que deseja fazer?\n1 - Depósito\n2 - Saque\n3 - Ver informações");
         int option = sc.nextInt();
         if(option==1){
             System.out.println("Entre com o valor do depósito: ");
             double deposito = sc.nextDouble();
             conta.deposito(deposito);
             System.out.println("Dados bancários: ");
             System.out.println(conta);
             System.out.println();
         }
         else if(option==2){
             System.out.println("Entre com o valor do saque: ");
             double saque = sc.nextDouble();
             conta.saque(saque);
             System.out.println("Dados bancários: ");
             System.out.println(conta);
             System.out.println();
         } else if(option==3){
             System.out.println("Dados bancários: ");
             System.out.println(conta);
         }
         sc.close();
     }
}
