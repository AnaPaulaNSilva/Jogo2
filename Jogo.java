public class Jogo {
	
	public static void main(String[] args) {
		Guerreiro jogador1 = new Guerreiro("Ana");
		Mago jogador3 = new Mago("Renato Augusto");
		Dragao mob1 = new Dragao();
		BolaDeFogo mob2 = new BolaDeFogo(100);
		
		
		var fase = new Fase();
		
		fase.carregar(mob1);
		fase.carregar(mob2);
		fase.carregar(jogador3);
		fase.carregar(jogador1);
		
		System.out.println("Jogador1 " + jogador1.getNome()+ 
						         	"XP=" + jogador1.getXp() +
					        		" HP=" + jogador1.getHp() +   
						        	" Envenenado=" + jogador1.isEnvenenado()   
									);
		jogador1.ganharExperiencia(10);
		jogador3.ganharExperiencia(150);
		jogador1.receberAntidoto();
		jogador3.atacar(jogador1);
		jogador3.mover(20, 20);
		jogador1.mover(20,20);
		
		
		System.out.println("Jogador1 " + jogador1.getNome()+ 
				"XP=" + jogador1.getXp() +
				" HP=" + jogador1.getHp() +   
				" Envenenado=" + jogador1.isEnvenenado()   
				);
		     
		System.out.println("Jogador3 XP" + jogador3.getXp());
		
	}
	
}
