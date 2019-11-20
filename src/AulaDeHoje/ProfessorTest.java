package AulaDeHoje;

import org.junit.Assert;
import org.junit.Test;

public class ProfessorTest {

    @Test
    public void deveCriarProfessorPorMeioDoConstrutor(){
        String email = "fake@email.com";
        String nome= "fake";
        Professor professor = new Professor(email,nome);
        Assert.assertEquals(email,professor.getEmail());
        Assert.assertEquals(nome,professor.getNome());


    }


}
