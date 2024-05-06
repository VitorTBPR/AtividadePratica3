package model.abstratas;

public abstract class Funcionario {

    private String nome;
    private String matricula;
    protected float horasTrab;
    protected float valorHora;
    
    protected abstract float calcularSalario();
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(float horasTrab) {
        this.horasTrab = horasTrab;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public Funcionario(String nome, String matricula, float horasTrab, float valorHora) {
        this.nome = nome;
        this.matricula = matricula;
        this.horasTrab = horasTrab;
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "\nFuncionario: "+nome+"\nMatricula: "+matricula+"\nHoras Trabalhadas: "+horasTrab+"\nValor Hora R$: "
                + valorHora;
    }

    



}
