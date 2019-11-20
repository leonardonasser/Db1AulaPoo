package AulaDeHoje;

import java.util.ArrayList;
import java.util.Date;

public class App {

    public static void main(String[] args) {
         Aluno aluno1 = new Aluno("Maiko cunha","Maiko@db1.com.br");
     //    aluno1.nome = "Maiko cunha";
     //    aluno1.email = "Maiko@db1.com.br";

        Aluno aluno2 = new Aluno("Leonardo Nasser","Leonardonaser11@hotmail.com");
       // aluno2.nome = "Leonardo Nasser";
      //  aluno2.email = "Leonardonasser11@hotmail.com";

        Professor professor = new Professor("Igor.silva@db1.com.br","Igor Silva");
     //   professor.nome ="Igor Silva";
      //  professor.email = "Igor.Silva@db1.com.br";

        Materia materia = new Materia();
        materia.nome = "POO";
        materia.descrição="Abstração, Encapulamento, polimorfismo, herança";
        materia.cargaHorario=10.5;
        materia.quantidadeAulas=3;
        materia.professor = professor;

        Aula aula    =   new Aula();
        aula.data    =   new Date();
        aula.materia =   new Materia();
        aula.alunos  =   new ArrayList<>();
        aula.alunos.add(aluno1);
        aula.alunos.add(aluno2);

        System.out.println(materia);

        aula.toString();
    }


}
