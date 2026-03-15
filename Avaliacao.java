import java.util.ArrayList;

public class Avaliacao {

    private int id;
    private String nome;
    private ArrayList<Questao> questoes;

    public Avaliacao(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.questoes = new ArrayList<>();
    }

    public void adicionarQuestao(int num, String texto, float peso) {

        Questao q = new Questao(num, texto, peso);

        questoes.add(q);
    }

    public String toString() {

        String texto = "Avaliacao: " + nome + "\n";

        for (Questao q : questoes) {
            texto = texto + q.toString() + "\n";
        }

        return texto;
    }
}
