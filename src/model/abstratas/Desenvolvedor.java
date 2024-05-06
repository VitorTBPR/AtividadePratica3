package model.abstratas;

public class Desenvolvedor extends Funcionario {

    protected String tecnologias;

    
    
    public Desenvolvedor(String nome, String matricula, float horasTrab, float valorHora, String tecnologias) {
        super(nome, matricula, horasTrab, valorHora);
        this.tecnologias = tecnologias;
    }

    public String getTecnologias() {
        return tecnologias;
    }
    
    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }

@Override
protected float calcularSalario() {
    return horasTrab*valorHora;
    }
}