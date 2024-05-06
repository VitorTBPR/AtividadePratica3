package view;

import java.util.ArrayList;

import controller.Console;
import model.abstratas.Desenvolvedor;
import model.abstratas.Estagiario;
import model.abstratas.Funcionario;
import model.abstratas.Gerente;

public class Sistema {
    protected static ArrayList<Funcionario>listaFuncionarios = new ArrayList<>();

    public static void menu(){
        int op;
        do{
            System.out.println("---------------------------------------");
            System.out.println("Bem vindo usuário!");
            System.out.println("O que deseja?");
            System.out.println("1. Adicionar funcionários");
            System.out.println("2. Remover funcionário");
            System.out.println("3. Exibir todos os funcionários");
            System.out.println("4. Buscar funcionário");
            System.out.println("0. Sair");
            System.out.println("---------------------------------------");
            System.out.print("R: ");
            op = Console.lerInt();

            switch (op) {
                case 1:
                int op1;
                do{ 
                System.out.println("\nQuem você deseja adicionar?");
                System.out.println("1. Desenvolvedor");
                System.out.println("2. Estagiário");
                System.out.println("3. Gerente");
                System.out.println("0. Voltar");
                op1 = Console.lerInt();
                switch (op1) {
                    case 1:
                    Desenvolvedor desenvolvedor = new Desenvolvedor(null, null, op, op1, null);
                    System.out.print("Qual o nome do desenvolvedor: "); 
                    desenvolvedor.setNome(Console.lerString());
                    System.out.print("Matricula: ");
                    desenvolvedor.setMatricula(Console.lerString());
                    System.out.print("Horas trabalhadas: ");
                    desenvolvedor.setHorasTrab(Console.lerFloat());
                    System.out.print("Valor da hora: ");
                    desenvolvedor.setValorHora(Console.lerFloat());
                    cadastrarLista(desenvolvedor);  
                    System.out.println("Desenvolvedor cadastrado");
                        break;
                    
                    case 2:
                    Estagiario estagiario = new Estagiario(null, null, op, op1, null);
                    System.out.print("Qual o nome do estagiário: "); 
                    estagiario.setNome(Console.lerString());
                    System.out.print("Matricula: ");
                    estagiario.setMatricula(Console.lerString());
                    System.out.print("Horas trabalhadas: ");
                    estagiario.setHorasTrab(Console.lerFloat());
                    System.out.print("Valor da hora: ");
                    estagiario.setValorHora(Console.lerFloat());
                    System.out.print("Supervisor: ");
                    estagiario.setSupervisor(Console.lerString());
                    cadastrarLista(estagiario);  
                    System.out.println("Estagiário cadastrado");
                    
                        break;
                     
                    case 3:
                    Gerente gerente = new Gerente(null, null, op, op1, null);
                    System.out.print("Qual o nome do gerente: "); 
                    gerente.setNome(Console.lerString());
                    System.out.print("Matricula: ");
                    gerente.setMatricula(Console.lerString());
                    System.out.print("Horas trabalhadas: ");
                    gerente.setHorasTrab(Console.lerFloat());
                    System.out.print("Valor da hora: ");
                    gerente.setValorHora(Console.lerFloat());
                    System.out.print("Equipe(s) que gerencia: ");
                    gerente.setEquipe(Console.lerString());
                    cadastrarLista(gerente);  
                    System.out.println("Gerente cadastrado");
                    
                        break;

                    case 0:
                    
                        break;
                
                    default:
                    System.out.println("Opção inválida");
                        break;
                }
                }while(op1!=0);
                    
                    break;
                case 2:
                excluirFuncionario();
                    break;
                
                case 3:
                listarFuncionarios();
                    break;

                case 4:
                buscarFuncionario();
                    break;    
                
                case 0:
                System.out.println("Finalizando sistema...");
                    break;

                default:
                System.out.println("Opção inválida");
                    break;
            }
        }while(op!= 0);
           

    
    }

    public static void cadastrarLista(Funcionario funcionario){
        listaFuncionarios.add(funcionario);
    }

    public static void listarFuncionarios(){
        if (listaFuncionarios.size() == 0) {
            System.out.println("Não há nenhum funcionário na lista");
            return;
        }

        for (Funcionario funcionario : listaFuncionarios){
            System.out.println(funcionario.getNome());
            }
        }

        public static void excluirFuncionario(){
            System.out.println("Quem você deseja remover? Digite o nome");
            if (listaFuncionarios.size()==0){
                System.out.println("Não há funcionários na lista");
                return;
            }
            listarFuncionarios();
            String nomeFuncionario = Console.lerString();
    
            boolean encontrado = false;
    
            for(Funcionario funcionario : listaFuncionarios){
              
                if (funcionario.getNome().equals(nomeFuncionario)) {
                    listaFuncionarios.remove(funcionario);
                    encontrado = true;
                    break;
                }
            }
        }

        public static void buscarFuncionario(){
            System.out.println("Qual a matrícula do funcionário que você deseja buscar?");
            String matriculaBuscado = Console.lerString();
    
            boolean encontrado = false;
    
            for(Funcionario funcionario:listaFuncionarios){
                if (funcionario.getMatricula().equals(matriculaBuscado)){
                    System.out.println("A matricula "+matriculaBuscado+" foi encontrada, o nome do funcionário é  "+funcionario.getNome());
                    encontrado = true;
                    break;
                }
            } 
            if(!encontrado){
                System.out.println("A matricula "+matriculaBuscado+" não foi encontrada");
            }
     } 

        


}

