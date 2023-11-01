import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Personagem finn = new Personagem("Finn", 40);
        Personagem jake = new Personagem("Jake", 50);

        System.out.println("HORA DA AVENTURA");
        Thread.sleep(2000);
        System.out.println("Esta aventura de Finn e Jake depende de suas escolhas");
        Thread.sleep(2000);
        System.out.println("Ao chegarem A Masmorra dos Desafios, Finn e Jake dão de cara com dois caminhos e decidem se separarem para saquear a masmorra.");
        Thread.sleep(2000);

        String aventura;
        Scanner masmorra = new Scanner(System.in);

        System.out.println("Nesta parte da aventura, você irá fazer as escolhas do personagem Finn");
        Thread.sleep(2000);
        System.out.println("Ao chegar na primeira sala, Finn se depara com duas portas, uma porta com alguns esqueletos e a outra porta com um cristal de Rubi");
        Thread.sleep(2000);
        System.out.println("Escolha uma das portas: porta esqueleto ou porta rubi?");

        aventura = masmorra.nextLine();

        if (aventura.equals("porta rubi")) {
            System.out.println("Finn abre a porta e cai em uma armadilha de espinhos.");
            Thread.sleep(2000);
            finn.perderVida(50);
            if (finn.getVida() <= 0) {
                System.out.println("Finn se machuca e não pode mais ficar na masmorra e volta para casa.");
            } 
        } else if (aventura.equals("porta esqueleto")) {
            System.out.println("Finn abre a porta e vê uma espada de grama e pega para si, ele avista uma saída e vai até ela");
            Thread.sleep(2000);
            System.out.println("Finn aparece em outra sala e avista um golem de lama. Finn tem duas ideias, jogá-lo na poça d'agua ou tentar cortá-lo com a espada de grama");
            Thread.sleep(2000);
            System.out.println("Faça sua escolha: jogar o golem ou cortar o golem?\n");
            aventura = masmorra.nextLine();
            Thread.sleep(2000);

            if (aventura.equals("cortar o golem")) {
                System.out.println("A espada atravessa o golem, mas não surte efeito algum, o golem ataca Finn.");
                finn.perderVida(50);
                if (finn.getVida() <= 0) {
                    System.out.println("Finn se machuca e não pode mais ficar na masmorra e volta para casa.");
                } 
            } else if (aventura.equals("jogar o golem")) {
                System.out.println("O golem se desfaz e em seu interior revela uma gema valiosa!");
                System.out.println("Você alcançou o final perfeito!");
                
            } 
        }
        System.out.println("Agora nesta parte da aventura, você irá fazer as escolhas do personagem Jake");
        Thread.sleep(2000);
        System.out.println("Quando jake entra na sala ele se depara com duas alavancas chamativas");
        Thread.sleep(2000);
        System.out.println("Escolha uma das alavancas: alavanca de ouro ou alavanca de cristal?");

        aventura = masmorra.nextLine();

        if (aventura.equals("alavanca de cristal")) {
            System.out.println("Jake puxa a alavanca e flechas caem do ceu.");
            Thread.sleep(2000);
            finn.perderVida(50);
            if (finn.getVida() <= 0) {
                System.out.println("Jake se machuca e não pode mais ficar na masmorra e volta para casa.");
            } 
        } else if (aventura.equals("alavanca de ouro")) {
            System.out.println("Jake puxa a alavanca e aparece uma coroa, ele a pega para si, ao avistar uma saída ele vai até ela");
            Thread.sleep(2000);
            System.out.println("Jake aparece em outra sala e avista um Gato monstro. Jake tem duas ideias, latir para o monstro e tentar ataca-lo");
            Thread.sleep(2000);
            System.out.println("Faça sua escolha: latir ou atacar?\n");
            aventura = masmorra.nextLine();
            Thread.sleep(2000);

            if (aventura.equals("atacar")) {
                System.out.println("Jake avança até o monstro mas perde a luta.");
                finn.perderVida(50);
                if (finn.getVida() <= 0) {
                    System.out.println("Jake se machuca e não pode mais ficar na masmorra e volta para casa.");
                } 
            } else if (aventura.equals("latir")) {
                System.out.println("Mesmo sendo um monstro ele ainda é um gato e foge deixando um bau para tras");
                System.out.println("Você alcançou o final perfeito!");
            }
        }    
        masmorra.close();
    }
}
