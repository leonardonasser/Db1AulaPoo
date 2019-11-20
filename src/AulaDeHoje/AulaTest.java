package AulaDeHoje;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class AulaTest {


    @Test
    public void deveCriarAulaPorMeioDoConstrutor(){
        Date data = null;
        List<Aluno> alunos = null;
        Aula aula = new Aula(data,alunos);
        Assert.assertEquals(alunos,Aula.getData());
        Assert.assertEquals(data,Aula.getAlunos());


    }

}
