package main;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int cont=0, idade=0, soma=0, total=0;
        
       /* while(cont<200){
            cont++;
            if(cont % 2 !=0) {
                System.out.println(cont);
            }
        }
    */
            /*do{
                System.out.println(cont);
                cont--;
            }while(cont>=0);
        */
            /*do{
                System.out.println("informe a idade: ");
                idade = grava.nextInt();
                total++;
                soma +=idade;
            }while(idade!=0);
            System.out.println(soma / total);
            */
          /*  System.out.println("Informe a quantidade de Repetições: ");
            cont = grava.nextInt();
            while(soma < cont){
                soma++;
                System.out.println(soma +" Isso é um teste");
            }
*/
          
          while(cont < 1000){
              cont++;
              soma += cont;
              System.out.println(soma);
              
          }
}
    
}
