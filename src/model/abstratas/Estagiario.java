package model.abstratas;

import model.interfaces.Trabalhavel;

public class Estagiario extends Funcionario implements Trabalhavel {

    protected String supervisor;

    public Estagiario(String nome, String matricula, float horasTrab, float valorHora, String supervisor) {
        super(nome, matricula, horasTrab, valorHora);
        this.supervisor = supervisor;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String trabalhar() {
        return "Preciso finalizar a atividade que meu supervisor orientou hoje";
    }

    @Override
    protected float calcularSalario() {
        return horasTrab*valorHora;
    }

    @Override
    public String relatarProgresso() {
        return "Hoje consegui absorver bastante conhecimento com meu supervisor "+supervisor+"!";
    }

    

}
