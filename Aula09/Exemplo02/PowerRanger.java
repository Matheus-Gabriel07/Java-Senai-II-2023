//Clase base

package Aula09.Exemplo02;

public class PowerRanger {
    String nome;

    public PowerRanger(String nome) {
        this.nome = nome;
    }

    public void morfar() {
        System.out.println(nome + "Hora de morfar!");
    }
}

class PowerRangerVerde extends PowerRanger {
    public PowerRangerVerde(String nome) {
        super(nome);
    }

    @Override
    public void morfar() {
        System.out.println(nome + "...says: Dragonzard!\n");
    }
}

class PowerRangerAmarelo extends PowerRanger {
    public PowerRangerAmarelo(String nome) {
        super(nome);
    }

    @Override
    public void morfar() {
        System.out.println(nome + "...says: Saber Tooth Tiger!\n");
    }
}

class PowerRangerAzul extends PowerRanger {
    public PowerRangerAzul(String nome) {
        super(nome);
    }

    @Override
    public void morfar() {
        System.out.println(nome + "...says: Triceratops!\n");
    }
}

class PowerRangerPreto extends PowerRanger {
    public PowerRangerPreto(String nome) {
        super(nome);
    }

    @Override
    public void morfar() {
        System.out.println(nome + "...says: Mastodon!\n");
    }
}

class PowerRangerRosa extends PowerRanger {
    public PowerRangerRosa(String nome) {
        super(nome);
    }

    @Override
    public void morfar() {
        System.out.println(nome + "...says: Pterodactyl!\n");
    }
}

class PowerRangerVermelho extends PowerRanger {
    public PowerRangerVermelho(String nome) {
        super(nome);
    }

    @Override
    public void morfar() {
        System.out.println(nome + "...says: Tyrannosaurs!\n");
    }
}