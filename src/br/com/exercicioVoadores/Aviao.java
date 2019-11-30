package br.com.exercicioVoadores;

public class Aviao implements Voador{
    private double horas;

    public Aviao(double horas) {
        this.horas = horas;
    }

    @Override
    public void voar() {
        double horasAtualizadas = this.horas + 13;

        System.out.println("Estou voando como um aviao! Horas: "+horasAtualizadas);

    }

}
