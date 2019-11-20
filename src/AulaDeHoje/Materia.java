package AulaDeHoje;

public class Materia {

    public    String    nome,descrição;
    public    Professor professor;
    public    Double    cargaHorario;
    public    Integer   quantidadeAulas;

    public  String getNomeMateria(){
        return nome;
    }
    public  String getDescrição(){
        return descrição;
    }
    public  Professor getProfessor(){
        return professor;
    }
    public Double getCargaHorario() {
        return cargaHorario;
    }
    public Integer getquantidadeAulas() {
        return quantidadeAulas;
    }




    @Override
    public String toString(){
        return "\nNome: "+ nome + "\nDescrição: "+descrição+"\nCarga Horaria: "+cargaHorario+"Quantidade de aulas " + quantidadeAulas;
    }

}
