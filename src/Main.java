import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("Inatel", "123457985","Av Joao Camargo");


        Scanner texto = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        int aux = 26999;

        do {

            System.out.println("Digite 1 para ver as informações da empresa");
            System.out.println("Digite 2 para adcionar um funcionario");
            System.out.println("Digite 3 para alocar um funcionario");
            System.out.println("Digite 4 para contar funcionarios disponiveis");
            System.out.println("Digite 5 para fechar o programa");

            switch (scanner.nextInt()) {

                case 1:
                    empresa.mostraInfo();
                    break;

                case 2:


                    System.out.println("Digite em ordem nome, cpf , idade e matricula");
                    Pessoa p1 = new Pessoa();

                    Funcionario f1 = new Funcionario();

                    p1.nome = texto.nextLine();
                    p1.cpf = texto.nextLine();
                    p1.idade = scanner.nextInt();

                    f1.pessoa = p1;

                    f1.matricula = scanner.nextInt();




                    empresa.adicionarFuncionario(f1);
                    break;

                case 3:
                    empresa.alocarFuncionario(scanner.nextInt());
                    break;

                case 4:
                    System.out.println(empresa.funcionariosDisponiveis);
                    break;

                case 5:

                    aux = 27000;

                default:
                    System.out.println("Digite novamente");
                    break;
            }
        }while (aux != 27000);
    }
}