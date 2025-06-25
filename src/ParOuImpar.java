import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        //TODO:Peça um número inteiro ao usuário e diga se ele é par ou ímpar.
        //in funcionalidade da classe System
        //alt tbm =>
        var scanner = new Scanner(System.in);


        System.out.println("Digite um numero inteiro: ");
        var num = scanner.nextInt();

        if(num%2==0 ){
            System.out.println("É par!!");
        } else if (num%2!=0) {
            System.out.println("É Impar!");
        } else if (num==0) {
            System.out.println("É 0");
        }else{
            System.out.println("Digite um numero valido");

        }


    }
}
