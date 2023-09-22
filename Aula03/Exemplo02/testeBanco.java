package Aula03.Exemplo02;

public class testeBanco {
    public static void main(String[] args) {
        banco SENAIBank = new banco(25, "Rafael Silva Lima");
        SENAIBank.informacoes();
        SENAIBank.deposito(10);
        System.out.println(SENAIBank.consultarExtrato());
        SENAIBank.sacar(30);
        
    }
}
