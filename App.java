public class App {
    public static void main(String[] args) throws Exception {
        Jogo jogar = new jogo ("Corrida", "Midnigth club 3", "Amador");        
        jogar.status();
        
        Jogador player = new Jogador(21 , "jhon", "Masculo");
        player.status();
        
        Campeonato disputa = new Campeonato(10, 15, 4);
        disputa.finalizar();
 
      
    } 
}
