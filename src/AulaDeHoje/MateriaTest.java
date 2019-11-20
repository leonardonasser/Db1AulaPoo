package AulaDeHoje;

import org.junit.Assert;
import org.junit.Test;

public class MateriaTest {

        @Test
        public void deveCriarMateriaPorMeioDoConstrutor(){
            String nomeMateria = "Poo";
            String descrição = "Abstração, Encapulamento, polimorfismo, herança";
            Professor professor;
            Double  cargahorario = 10.5;
            Integer quantidadedeaulas = 3;
            Materia Materia = new Materia(nomeMateria,descrição,cargahorario,quantidadedeaulas);
            Assert.assertEquals(nomeMateria,Materia.getNomeMateria());
            Assert.assertEquals(descrição,Materia.getDescrição());
            Assert.assertEquals(professor,Materia.getProfessor());
            Assert.assertEquals(cargahorario,Materia.getCargaHorario());
            Assert.assertEquals(quantidadedeaulas,Materia.getquantidadeAulas());
        }
    }



