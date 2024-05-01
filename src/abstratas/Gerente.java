package abstratas;

public class Gerente extends Funcionario {
    public Gerente(String nome, String matricula, float horasTrab, float valorHora) {
        super(nome, matricula, horasTrab, valorHora);
    }

    private float bonificacao;

    @Override
    public float calcularSalario() {
        return valorHora*getHorasTrab()+bonificacao;
    }
    
}
