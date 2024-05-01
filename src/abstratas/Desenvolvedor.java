package abstratas;

import java.util.ArrayList;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, String matricula, float horasTrab, float valorHora) {
        super(nome, matricula, horasTrab, valorHora);
    }

    protected ArrayList<Desenvolvedor> tecnologias = new ArrayList<>();

    @Override
    protected float calcularSalario() {
        return horasTrab*valorHora;
    }
    
}
