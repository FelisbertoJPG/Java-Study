import java.util.Scanner;

public class CriarUmaCalculadora {
    public static void main(String[] args) {
        //TODO: criar uma calculadora em Java
        var scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        //crtl click na duvida
        var num1 = scanner.nextFloat();
        System.out.println("Digite o segundo numero: ");
        var num2 = scanner.nextFloat();
        var result = 0.0f;
        System.out.println("Digite o tipo de operação: ");
        System.out.println("operação Soma: 1 ");
        System.out.println("operação Subtração: 2");
        System.out.println("operação Multiplicação: 3");
        System.out.println("operação Divisão: 4");
        var tipo = scanner.nextInt();
        if (tipo == 1){
            result = num1 + num2;
            System.out.println("resultado da soma é: "+result);
        } else if (tipo == 2) {
            result = num1 - num2;
            System.out.println("resultado da Subtração é: "+result);
        } else if (tipo == 3) {
            result = num1 * num2;
            System.out.println("resultado da Multiplicação é: "+result);
        } else if (tipo == 4) {
            result = num1/num2;
            System.out.println("resultado da Subtração é: "+result);
        }
    }
}
