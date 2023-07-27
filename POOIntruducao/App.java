package POOIntruducao;

public class App {
    public static void main(String[] args) {
        // criar 3 objetos ResgistraAluno
        RegistraAluno ana = new RegistraAluno();
        RegistraAluno beto = new RegistraAluno();
        Alunos aluno1 = new Alunos();
        //Pessoas pessoa1= new Pessoas(); não pode instanciar objeto
        //classe pessoas é abstract

        // objeto aluno1 classe Alunos
        aluno1.setEndereco(null);
        aluno1.setNome(null);

        // objeto pessoa 1 classe Pessoas
        pessoa1.setEndereco(null);

        // altera as informações com o set
        ana.setNome("Ana Machado");
        ana.setEndereco("Rua Piracicaba,536");
        ana.setIdade(26);
        ana.setNotaCiencias(8);
        ana.setNotaMatematica(5);
        ana.setNotaPortugues(10);

        // printa com as informações
        System.out.println(ana.getNome());
        System.out.println(ana.getEndereco());
        System.out.println(ana.getIdade());
        System.out.println("Contador: "
                + RegistraAluno.getQuantidadeAlunos());

        beto.setNome("Roberto da Silva");
        beto.setEndereco("Rua Angela bukckman");
        beto.setIdade(20);
        beto.setNotaCiencias(7);
        beto.setNotaMatematica(9);
        beto.setNotaPortugues(10);

        System.out.println("++++++++++++++++++++++++++++++++++++++");

        Alunos aluno1 = new Alunos();
        aluno1.setNome("Alberto");
        System.out.println(aluno1.getNome());
    }
}