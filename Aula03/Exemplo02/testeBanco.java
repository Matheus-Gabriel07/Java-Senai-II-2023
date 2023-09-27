package Aula03.Exemplo02;

public class testeBanco {
    public static void main(String[] args) {
        banco SENAIBank = new banco(250, "Matheus");
        SENAIBank.informacoes();
        SENAIBank.deposito(200);
        System.out.println(SENAIBank.consultarExtrato());
        SENAIBank.sacar(30);
    }
}
