public class Jogador {
    private int idade;
    private String nome;
    private String sexo;
    private int sobre;

    // método construtor
    public Jogador(int idade, String nome, String sexo) {
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
        this.sobre = true;
    

    // metodos especificos das classe
        public void Jogar(){
            System.out.println("O jogador está on");
        }

        public void desistir(){
            System.out.println("O Jogador desistiu da partida");               
        }

        public void vencedor(){
            System.out.println("O Jogador venceu a partida");
        }




       // metodos get&set
        public void setIdade(int idadeJogador) {
            this.idade = idadeJogador;
        }
    
        public int getIdade() {
            return idade;
        }
    
        
        public void setNome(String nomeJogador) {
            this.nome = nomeJogador;
        }
    
        public String getNome() {
            return nome;
        }    
         
        public void setSexo(String sexoJogador) {
            this.sexo = sexoJogador;
        }
        
        public String getSexo() {
            return sexo;
        }

        public void pronto(){
        }

        public void status(){
            System.out.println("DETALHES SOBRE O JOGADOR");
            System.out.println("Idade do Jogador: " + getIdade());
            System.out.println("Nome do Jogador: " + getNome());
            System.out.println("Sexo do Jogador: " + getSexo());

               
            System.out.println();
        }    
          
           
    
    }
    
    

