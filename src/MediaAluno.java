import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        //TODO: Elabore um algoritmo que valide a media de um aluno e mostre na tela se o mesmo foi aprovado ou reprovado

        var scanner = new Scanner(System.in);

        var nota1= 10;
        int nota2= 6;
        int nota3= 4;


        //Double = 2 casas decimais apos a , tipo "float"
        //calculo da media
        double media = (nota1+nota2+nota3)/3;



        if(media>=6){
            System.out.println("Voce foi Aprovado!!"+media);

        }else{
            System.out.println("Voce foi Reprovado");
        }

    }




}
