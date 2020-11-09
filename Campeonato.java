public class Campeonato {
    private int adversarios;
    private int pontos;
    private int classificacao;
    private boolean fimDoJogo;

 public Campeonato(int adv, int pnt, int clasfç){
     this.adversarios = adv; 
     this.pontos = pnt;      
     this.classificacao = clasfç;
     this.fimDoJogo = true;
    }

    public void setQtdAdversarios(int adv) {
        this.adversarios = adv;
    }
    
    public int getQtdAdversarios() {
        return adversarios;
    }
   
    public void setPontuacao(int pnt) {
        this.pontos = pnt;
    } 

    public int getPontuacao() {
        return pontos;
    }

    
    public void setClassificacao(int clasfç) {
        this.classificacao = clasfç;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void partida (){
        System.out.print("Voce venceu o campeonato: ");
        ganhar();
        
    }

    private void ganhar(){
        System.out.println(fimDoJogo + " pontos");
    }


  public void terminou(){
      this.fimDoJogo = true;
    }
    

    void finalizar(){
        System.out.println("Seu campeonato está finalizando...");
        System.out.println("Quantidade de adversarios: " + getQtdAdversarios());
        System.out.println("Sua pontuação atual: " + getPontuacao());
        System.out.println("Sua classificação: " + getClassificacao());
        
        if(this.fimDoJogo = true){
            System.out.println("Seu campeonato foi finalizado!");
        } else {
            System.out.println("De Continuidade ao fim do jogo!");
        }

        System.out.println();
    }


    }


