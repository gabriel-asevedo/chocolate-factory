package application;

import entities.Caldeira;

public class Program {

    public static void main(String[] args) {
        Caldeira caldeira = Caldeira.getInstancia();

        caldeira.encher();
        caldeira.ferver();
        caldeira.drenar();
    }
}
