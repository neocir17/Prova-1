public class Jogo {
    private String estiloDeJogo;
    private String nome;
    private String  dificuldade;
    private boolean jogar;
      

	public void Jogo(String estilo, String nomeJogador, String dificuldade){
    this.estiloDeJogo = estilo;
    this.nome = nomeJogador;
    this.dificuldade = dificuldade;
    this.jogar = true;    
    }
    
    public void setEstiloDeJogo(String estilo) {
        this.estiloDeJogo = estilo;
    }
   
    public String getEstiloDeJogo() {
        return estiloDeJogo;
    }

   
    public void setNome(String nomeJogo) {
        this.nome = nomeJogo;
    }

    public String getNome() {
        return nome;
    }

    public void setDificuldade(String dificuldadeJogo) {
        this.dificuldade = dificuldadeJogo;
    } 

    public String getDificuldade() {
        return dificuldade;
    }

    public void iniciando(){
        this.jogar = false;
    }


    public void status(){
        
System.out.println("O jogo está iniciando? " + this.jogar);
System.out.println("Estilo do jogo:" + this.getEstiloDeJogo());
System.out.println("Nome do jogo:" + this.getNome());
System.out.println("Dificuldade escolhida: " + this.getDificuldade()); 

if(this.jogar = true){
    System.out.println("Sua partida iniciou!!");
} else {
    System.out.println("Nao iniciou");
}

System.out.println();       
}

         
    }


