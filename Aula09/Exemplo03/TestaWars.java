public class TestaWars {
    public static void main(String[] args) {
        StarWars lukeSkywalker = new Jedai("Luke Skywalker");
        StarWars darthVader = new Sith("Darth Vader");
        StarWars anakin = new Padawan("Anakin");

        lukeSkywalker.executarAcao(); //Executa a ação de um jedi
        darthVader.executarAcao(); //Executa a ação de um Sith
        anakin.executarAcao(); // Executa a ação de um Padawan
    }
}
