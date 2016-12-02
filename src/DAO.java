
import java.sql.Array;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class DAO {
	private Connection connection = null;
	public DAO() {
	    try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/meus_dados2", "root", "123456");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void adiciona(Usuario usuario) {
		String sql = "INSERT INTO UsuarioMCN" +
		"(nome,horario,resultados) values(?,?,?)";
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1,usuario.getNome());
			stmt.setDate(2, new Date(usuario.getHorario().getTimeInMillis()));
			stmt.setArray(3,(Array) usuario.getResultados());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	@SuppressWarnings("unchecked")
	public List<Usuario> getLista() {

		List<Usuario> dadosDoUsuario = new ArrayList<Usuario>();

		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement("SELECT * FROM UsuarioMCN");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(rs.getInt("id"));
				usuario.setNome(rs.getString("nome"));
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("horario"));
				usuario.setHorario(data);
				usuario.setResultados((ArrayList<Jogo>) rs.getArray("resultados"));
				dadosDoUsuario.add(usuario);
			}
			rs.close();
			stmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return dadosDoUsuario;
	}

	public void close() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
