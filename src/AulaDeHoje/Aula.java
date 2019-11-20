package AulaDeHoje;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Aula {

    public  Date data;
    public  Materia materia;
    public  List<Aluno> alunos;

    public Date getData() {
        return data;

    }

    public List<Aluno> getAlunos() {
        return alunos;
    }



    @Override
    public String toString(){
        return "Aula{" +
                ", data="+data+
                ", materia" + materia+
                ", alunos" +alunos +
                '}';
    }

}
