package AulaDeHoje;

public class Aluno extends Pessoa {
     //public String nome;
    double nota;


    public Aluno(String Nome, String Email) {
        super(Nome,Email);
    }

    @Override
    public String toString() {
        return super.toString()+
                "nota=" +nota +
                "}}";
    }
}
