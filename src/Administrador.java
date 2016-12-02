import java.util.ArrayList;
import java.util.Calendar;

public class Administrador {
	
	private Integer id;
	private String searchUsuario;
	private ArrayList<Usuario> listaDeJogos;
	private Calendar horarioDaJogada;
	private Boolean resultado;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSearchUsuario() {
		return searchUsuario;
	}
	public void setSearchUsuario(String searchUsuario) {
		this.searchUsuario = searchUsuario;
	}
	public ArrayList<Usuario> getListaDeJogos() {
		return listaDeJogos;
	}
	public void setListaDeJogos(ArrayList<Usuario> listaDeJogos) {
		this.listaDeJogos = listaDeJogos;
	}
	public Calendar getHorarioDaJogada() {
		return horarioDaJogada;
	}
	public void setHorarioDaJogada(Calendar horarioDaJogada) {
		this.horarioDaJogada = horarioDaJogada;
	}
	public Boolean getResultado() {
		return resultado;
	}
	public void setResultado(Boolean resultado) {
		this.resultado = resultado;
	}
	
	

}
