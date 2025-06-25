import java.util.Scanner;

public class VerifiqueQuemVota {
    public static void main(String[] args) {
        //TODO:validação de idade e votação
        var scanner = new Scanner(System.in);
        System.out.println("Diga sua Idade: ");
        // scanner.next...()
        // Scanner.nectLine()=>String
        var idadeMinima = 16;
        var idade = scanner.nextInt();

        if (idade>=idadeMinima){
            System.out.println("Pode votar!!");
        }else{
            System.out.println("Voto Negado!! ");
        }











    }
}
