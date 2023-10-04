package Exemplo03;

public class Promocao {
    public Empregado promocao(Empregado e1, Empregado e2){
        if(e1.getTempoDeCasa() > e2.getTempoDeCasa()){
            return e1;
        } else {
            return e2;
        }
    }
}
