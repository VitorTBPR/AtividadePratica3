package sistema;

public class Sistema {

    public static void menu(){
        int op;
        do{
            System.out.println("---------------------------------------");
            System.out.println("Bem vindo usuário!");
            System.out.println("O que deseja?");
            System.out.println("1. Adicionar funcionários");
            System.out.println("2. Remover funcionários");
            System.out.println("3. Exibir todos os funcionários");
            System.out.println("---------------------------------------");
            System.out.print("R: ");
            op = Console.lerInt();
        }while(op!= 0);
           

    
    }
}