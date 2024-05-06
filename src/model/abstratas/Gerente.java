package model.abstratas;

import model.interfaces.Trabalhavel;

public class Gerente extends Funcionario implements Trabalhavel {

    private float bonificacao;
    private String equipe;

    public Gerente(String nome, String matricula, float horasTrab, float valorHora, String equipe) {
        super(nome, matricula, horasTrab, valorHora);
        this.equipe = equipe;
    }


    @Override
    public float calcularSalario() {
        return valorHora*getHorasTrab()+bonificacao;
    }



    @Override
    public String trabalhar() {
        return "Preciso verificar minha agenda e preciso dar sequência nas atividades em andamento";
    }



    @Override
    public String relatarProgresso() {
        return "Hoje o dia foi produtivo, consegui finalizar o que estava pendente e orientar a equipe para as demais demandas  ";
    }



    public float getBonificacao() {
        return bonificacao;
    }



    public void setBonificacao(float bonificacao) {
        this.bonificacao = bonificacao;
    }


    public String getEquipe() {
        return equipe;
    }


    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    
    
}
