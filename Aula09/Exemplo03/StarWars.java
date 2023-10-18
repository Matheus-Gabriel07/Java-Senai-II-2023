/**
 * Classe Abstrata -> São classes que servem de modelo para outras classes.
 * Não podem ser instanciadas.
 * Palavra chave -> abstract
 */

// Classe abstrata
abstract class StarWars {
    String nome;

    public StarWars(String nome) {
        if (nome != null) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido");
        }
    }

    // Método abstrato que deve ser implementado pelas subclasses
    public abstract void executarAcao();
}

class Jedai extends StarWars {
    public Jedai(String nome) {
        super(nome);
    }

    @Override
    public void executarAcao() {
        System.out.println("Usa a força para o lado da Luz");
    }
}

class Padawan extends StarWars {
    public Padawan(String nome) {
        super(nome);
    }

    @Override
    public void executarAcao() {
        System.out.println(nome + " treina para usar a força");
    }
}

class Sith extends StarWars {
    public Sith(String nome) {
        super(nome);
    }

    @Override
    public void executarAcao() {
        System.out.println(nome + "  usar o lado sombrio da força");
    }
}