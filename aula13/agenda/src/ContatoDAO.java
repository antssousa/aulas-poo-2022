import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO implements GenericDAO<Contato> {

	public Connection getConnection() throws SQLException {
		// url do banco
		String url = "jdbc:h2:./agenda";

		// usuário do banco
		String user = "admin";
		// Senha do banco
		String password = "123456";

		// Class.forName("org.h2.Driver");
		return DriverManager.getConnection(url, user, password);
	}

	@Override
	public void insert(Contato e) {

		try (Connection con = getConnection()) {
			String sql = "insert into contatos (nome, telefone, endereco, email) values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, e.getNome());
			ps.setString(2, e.getTelefone());
			ps.setString(3, e.getEndereco());
			ps.setString(4, e.getEmail());
			ps.executeUpdate();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public Contato select(long id) {

		String sql = "select * from contatos where id = ?";

		try (Connection con = getConnection()) {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setLong(1, id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				Contato c = new Contato();
				c.setId(rs.getLong("id"));
				c.setNome(rs.getString("nome"));
				c.setTelefone(rs.getString("telefone"));
				c.setEndereco(rs.getString("endereco"));
				c.setEmail(rs.getString("email"));
				return c;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<Contato> select() {
		ArrayList<Contato> lista = new ArrayList<Contato>();

		String sql = "select * from contatos";

		try (Connection con = getConnection()) {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Contato c = new Contato();
				c.setId(rs.getLong("id"));
				c.setNome(rs.getString("nome"));
				c.setTelefone(rs.getString("telefone"));
				c.setEndereco(rs.getString("endereco"));
				c.setEmail(rs.getString("email"));
				lista.add(c);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lista;
	}

	@Override
	public void update(Contato e) {
		String sql = "update contatos set nome = ?, telefone = ?, endereco = ?, email = ? where id = ?";
		try (Connection con = getConnection()) {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, e.getNome());
			ps.setString(2, e.getTelefone());
			ps.setString(3, e.getEndereco());
			ps.setString(4, e.getEmail());
			ps.setLong(3, e.getId());
			ps.executeUpdate();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}

	@Override
	public void delete(Contato e) {
		String sql = "delete from contatos where id = ?";
		try (Connection con = getConnection()) {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setLong(1, e.getId());
			ps.executeUpdate();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

}
