import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection obterConexao() {
        String urlDeConexao = "jdbc:h2:./banco/bancoDeDados;AUTO_SERVER=TRUE";
        String login = "sa";
        String senha = "";
        try {
            return DriverManager.getConnection(urlDeConexao, login, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void fechar(Connection conexao)  {
        try {
            conexao.close();
        } catch (SQLException e) {
            throw new RuntimeException("Falha no fechamento da conexão com o banco.", e);
        }
    }
}