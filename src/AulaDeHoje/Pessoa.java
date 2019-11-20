package AulaDeHoje;



public abstract class Pessoa {

        private String email;
        private String nome;
        public Pessoa(String email, String nome) {
            this.nome=nome;
            this.email=email;

    }

    public  String getEmail(){
            return email;
    }

    public String getNome() {
           return nome;
    }

    @Override
    public String toString(){
            return "\nPessoa{" +"\nemail: "+email + '\'' + "\n nome: " + nome + '\'' ;
        }

}
