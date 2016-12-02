import java.util.ArrayList;
import java.util.Calendar;

public class Usuario {
	private Integer id;
	private String nome;
	private Integer moedas;
	private Calendar horario;
	private ArrayList<Jogo> resultados;

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getMoedas() {
		return moedas;
	}
	public void setMoedas(Integer moedas) {
		this.moedas = moedas;
	}
	public Calendar getHorario() {
		return horario;
	}
	public void setHorario(Calendar horario) {
		this.horario = horario;
	}
	public ArrayList<Jogo> getResultados() {
		return resultados;
	}
	public void setResultados(ArrayList<Jogo> resultados) {
		this.resultados = resultados;
	}

}
