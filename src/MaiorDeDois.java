import java.util.Scanner;

public class MaiorDeDois {
    public static void main(String[] args) {
        //TODO:mostrar o numero que for maior

        var scanner = new Scanner(System.in);

        System.out.println("De dois numeros");
        var num1 = scanner.nextInt();
        var num2 = scanner.nextInt();

        if (num1>num2){
            System.out.println("O numero "+num1+" é maior");
        } else if (num2>num1) {
            System.out.println("O numero "+num2+" é maior que "+num1);

        }else{
            System.out.println("Seus numeros "+num1+" e "+num2+" são iguais");
        }

    }
}
