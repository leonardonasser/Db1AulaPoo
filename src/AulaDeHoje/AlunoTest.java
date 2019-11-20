package AulaDeHoje;



import org.junit.Assert;
import org.junit.Test;

public class AlunoTest {

    @Test
    public void deveCriarAlunoPorMeioDoConstrutor(){
      String email = "email.fake@email.com";
      String nome= "fake";
       Aluno aluno = new Aluno(email,nome);
       Assert.assertEquals(email,aluno.getEmail());
       Assert.assertEquals(nome, aluno.getNome());
    }


}
