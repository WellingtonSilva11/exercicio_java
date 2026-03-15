import java.util.ArrayList;

public class Disciplina {

    private int id;
    private String nome;
    private String professor;

    private ArrayList<Aluno> alunos;
    private ArrayList<Avaliacao> avaliacoes;

    public Disciplina(int id, String nome, String professor) {

        this.id = id;
        this.nome = nome;
        this.professor = professor;

        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public void matricularAluno(Aluno a) {
        alunos.add(a);
    }

    public void criarAvaliacao(int id, String nome) {

        Avaliacao av = new Avaliacao(id, nome);

        avaliacoes.add(av);
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public String toString() {

        String texto = "Disciplina: " + nome + "\nProfessor: " + professor + "\n";

        texto = texto + "\nAlunos:\n";

        for (Aluno a : alunos) {
            texto = texto + a.toString() + "\n";
        }

        texto = texto + "\nAvaliacoes:\n";

        for (Avaliacao av : avaliacoes) {
            texto = texto + av.toString() + "\n";
        }

        return texto;
    }
}
