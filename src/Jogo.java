import java.util.ArrayList;
import java.util.Random;

public class Jogo {
	private Integer resultado;
	private Integer jogada(){
		
		
		String[] frutas = {"banana", "maça", "pera", 
				"uva", "melancia", "morango"};
		
		
	ArrayList<String> jogo = new ArrayList<>();
	
	Random r = new Random();
	
	int tamanho = frutas.length;
	
	for(int i = 0; i < 3; i++ ){
		int index = r.nextInt(tamanho);
		jogo.add(frutas[index]);
		
	}
	if(jogo.get(0) == jogo.get(1)){
		if(jogo.get(1) == jogo.get(2)){
			resultado = 1;
		}
	}else{
		resultado = 0;
	}
return resultado;
	
}
	public Integer getResultado() {
		return resultado = jogada();
	}
	public void setResultado(Integer resultado) {
		this.resultado = jogada();
	}
	
}
