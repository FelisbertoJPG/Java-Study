import java.util.Scanner;

public class BatalhaPokemon {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println();
        int inicial = 0;
        var vida = 1;
        var advVida = 1;
        var moves = 0;
        var dmg = 0;
        var poke = "";
        var tipo = "";
        var adv = "";
        var moveSelecionado = "";
        var moveSelecionadoOp = 0;
        boolean lampada = false;

        do {
            System.out.println("Escolha um dos 3 Iniciais de Kanto: ");
            System.out.println("1: Bulbassauro");
            System.out.println("2: Squirtle");
            System.out.println("3: Charmander");
            inicial = scanner.nextInt();
            if (inicial != 1 && inicial != 2 && inicial != 3) {
                System.out.println("Escolha um Pokemon Elegivel!");
                 lampada = true;
            }
            if(lampada){

                System.out.println("Lampada ligou!!");
            }
        } while (inicial != 1 && inicial != 2 && inicial != 3);
        if(inicial==1){
            tipo = "Grama";
            poke = "Bulbassauro";
            adv = "Charmander";
            vida = 35;
            moves = 1;
            advVida = 30;

        } else if (inicial==2) {
            tipo = "Agua";
            poke = "Squirtle";
            adv = "Bulbassauro";
            vida = 40;
            moves = 2;
            advVida = 35;
        } else {
            tipo = "Fogo";
            poke = "Charmander";
            adv = "Squirtle";
            vida = 30;
            moves = 3;
            advVida = 40;
        }
        System.out.println("Seu pokemon escolhido foi o "+poke+" do tipo "+tipo);
        System.out.println("Seu Adversário sera "+adv);
        System.out.println("Escolha seu Primeiro Movimento: ");
        if(moves == 1){
            System.out.println("1: Proteção");
            System.out.println("2: Investida");
            System.out.println("3: Folha navalha");

            do {
                System.out.println("Selecione seu proximo Movimento: ");
                moveSelecionadoOp = scanner.nextInt();
                if (moveSelecionadoOp==1){
                    dmg = 0;
                    advVida = advVida-dmg;
                    System.out.printf("Voce se Protegeu do Ataque de "+adv);
                    System.out.println("Selecione seu proximo Movimento: ");
                } else if (moveSelecionadoOp==2) {
                    dmg = 2;
                    //
                    advVida = advVida-dmg;
                    vida --;
                    System.out.println("Seu pokemon Usou investida no "+adv);
                    System.out.println(poke+" Causou "+dmg+" de Dano");
                    System.out.println(adv+" Contra Atacou!!");
                    System.out.println(poke+" Sofreu um Golpe Direto, Restoulhe "+vida);
                } else if (moveSelecionadoOp==3) {
                    dmg = 4;
                    vida = vida-5;
                    advVida = advVida-dmg;
                    System.out.println("Seu pokemon Usou Folha Navalha no "+adv);
                    System.out.println(poke+" Causou "+dmg+" de Dano");
                    System.out.println(adv+" Contra Atacou com Labaredas!!");
                    System.out.println(poke+" Sofreu um Golpe Direto, Restoulhe "+vida);
                } else {
                    System.out.println("Selecione um Movimento Válido!!!");
                }

            }while(vida>=0 || advVida>=0);
            if (vida==0){
                System.out.println("Voce Perdeu!!");
                return;
            }

        }

    }
}

