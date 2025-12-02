public class Empresa {

    String nome;

    int totalf = 0;

    int fdisponiveis;
    String cnpj;

    String endereco;

    Funcionario [] funcionarios = new Funcionario[5];

    int funcionariosDisponiveis;



    public Empresa(String nome, String cnpj, String endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    void adicionarFuncionario(Funcionario novoFuncionario){

        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i]==null)
            {
                funcionarios[i] = novoFuncionario;
                totalf++;
                break;
            }
        }


    }

    void alocarFuncionario(int matricula){

        System.out.println("Funcionario de matricula " + matricula + "Alocado");

        for (int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i].matricula == matricula)
                fdisponiveis = fdisponiveis - 1;
        }
    }

    float contarFuncionariosDisponiveis(){

        for (int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i]!= null)
                totalf++;
        }

        return (totalf + fdisponiveis)/totalf;


    }

void mostraInfo(){

    System.out.println("Nome da empresa: " + nome);
    System.out.println( "Endereco" + endereco);

    }

}


aaaa
