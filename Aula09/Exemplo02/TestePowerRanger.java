package Aula09.Exemplo02;
import java.util.Scanner;

public class TestePowerRanger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomePowerRanger;

        System.out.println("\t***It's Morphing Time***\n");

        System.out.println("Digite o nome do Power Ranger Verde");
        nomePowerRanger = sc.nextLine();
        PowerRanger verde = new PowerRangerVerde(nomePowerRanger);
        
        System.out.println("Digite o nome do Power Ranger Preto");
        nomePowerRanger = sc.nextLine();
        PowerRanger preto = new PowerRangerPreto(nomePowerRanger);

        System.out.println("Digite o nome do Power Ranger Rosa");
        nomePowerRanger = sc.nextLine();
        PowerRanger rosa = new PowerRangerRosa(nomePowerRanger);

        System.out.println("Digite o nome do Power Ranger Azul");
        nomePowerRanger = sc.nextLine();
        PowerRanger azul = new PowerRangerAzul(nomePowerRanger);

        System.out.println("Digite o nome do Power Ranger Amarelo");
        nomePowerRanger = sc.nextLine();
        PowerRanger amarelo = new PowerRangerRosa(nomePowerRanger);

        System.out.println("Digite o nome do Power Ranger Vermelho");
        nomePowerRanger = sc.nextLine();
        PowerRanger vermelho = new PowerRangerVermelho(nomePowerRanger);
        sc.close();

        verde.morfar();
        preto.morfar();
        rosa.morfar();
        azul.morfar();
        amarelo.morfar();
        vermelho.morfar();
    }
}
