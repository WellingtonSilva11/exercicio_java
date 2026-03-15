public class TestaAcademico {

    public static void main(String[] args) {

        Aluno a1 = new Aluno(1, "Carlos", "2023001", "Engenharia");
        Aluno a2 = new Aluno(2, "Ana", "2023002", "Computacao");

        Disciplina d1 = new Disciplina(1, "Programacao Orientada a Objetos", "Professor Marcos");

        d1.matricularAluno(a1);
        d1.matricularAluno(a2);

        d1.criarAvaliacao(1, "Prova Semestral");

        Avaliacao av = d1.getAvaliacoes().get(0);

        av.adicionarQuestao(1, "Explique o que é classe em Java", 2.0f);
        av.adicionarQuestao(2, "Explique o que é objeto", 3.0f);
        av.adicionarQuestao(3, "Explique o conceito de herança", 5.0f);

        System.out.println(d1.toString());
    }
}
