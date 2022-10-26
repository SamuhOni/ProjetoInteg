package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import projetointegrador.AlunoProf;

public class ConexaoBanco {

    static Connection connection = null;

    public static java.sql.Connection getConexaoMySQL() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String serverName = "127.0.0.1:3306";
            String mydatabase = "aula";
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?useTimezone=true$serverTimezone=UTC";
            String username = "root";
            String password = "";

            connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                System.out.println("STATUS--->Conectado com sucesso!");
            } else {
                System.out.println("STATUS--->Nao foi possivel realizar conexao");
            }
            return connection;

        } catch (ClassNotFoundException e) {  //Driver nao encontrado
            System.out.println("O driver expecificado nao foi encontrado.");
            return null;
        } catch (SQLException e) {
            //Nao consegue se conectar ao banco
            System.out.println("Nao foi possivel conectar ao banco de dados." + e.getMessage());
            return null;
        }
    }

    //Método que fecha sua conexão
    public static boolean getFecharConexao() {
        try {
            connection.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public static boolean insertBancoAlunoProf(AlunoProf alunoprof ) {
        boolean retorno = false;
        try {
            String sql = "INSERT INTO AlunoProf (nome, nascimento, datacadastro, cpf, rg, responsavel, fone, proficiencia, turma, endereco, materia, trimestre, falta, nota) Values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, alunoprof.getNome());
            ps.setString(2, alunoprof.getNascimento());
            ps.setString(3, alunoprof.getDatacadastro());
            ps.setString(4, alunoprof.getCpf());
            ps.setString(5, alunoprof.getRg());
            ps.setString(6, alunoprof.getResponsavel());
            ps.setString(7, alunoprof.getFone());
            ps.setString(8, alunoprof.getProficiencia());
            ps.setString(9, alunoprof.getTurma());
            ps.setString(10, alunoprof.getEndereco());
            ps.setString(11, alunoprof.getMateria());
            ps.setString(12, alunoprof.getTrimestre());
            ps.setString(13, alunoprof.getFalta());
            ps.setString(14, alunoprof.getNota());
            retorno = ps.execute();
        } catch (SQLException e) {
            System.out.println("Erro insert pessoa: " + e.getMessage());
        }
        return retorno;
    }
    
     public static List<AlunoProf> selectBancoAlunoProf() {
        List<AlunoProf> AlunoProf = new ArrayList<>();
        try {
            String sqlSelect = "select * from alunoprof";
            PreparedStatement ps = connection.prepareStatement(sqlSelect);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                AlunoProf alunoprof = new AlunoProf();
                alunoprof.setNome(rs.getString("nome"));
                alunoprof.setNascimento(rs.getString("nascimento"));
                alunoprof.setDatacadastro(rs.getString("datacadastro"));
                alunoprof.setCpf(rs.getString("cpf"));
                alunoprof.setFone(rs.getString("rg"));
                alunoprof.setResponsavel(rs.getString("responsavel"));
                alunoprof.setFone(rs.getString("fone"));
                alunoprof.setFone(rs.getString("proficiencia"));
                alunoprof.setFone(rs.getString("turma"));
                alunoprof.setEndereco(rs.getString("endereco"));
                alunoprof.setMateria(rs.getString("materia"));
                alunoprof.setTrimestre(rs.getString("trimestre"));
                alunoprof.setFalta(rs.getString("falta"));
                alunoprof.setNota(rs.getString("nota"));
                AlunoProf.add(alunoprof);
            }
        } catch (SQLException e) {
            System.out.println("Erro select: " + e.getMessage());
        }
        return AlunoProf;
    }
     
     public static int updateBancoAlunoProf(AlunoProf alunoprof) {
        int retornoUpdate = 0;
        try {
            String sql = "update alunoprof SET nome=?, nascimento=?, datacadastro=?,  cpf=?, rg=?, fone=?, responsavel=?, "
                    + "proficiencia=?, turma=?, endereco=?, tipo=?, materia=?, trimestre=?, falta=?, nota=? where cpf = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, alunoprof.getNome());
            ps.setString(2, alunoprof.getNascimento());
            ps.setString(3, alunoprof.getDatacadastro());
            ps.setString(4, alunoprof.getCpf());
            ps.setString(5, alunoprof.getRg());
            ps.setString(6, alunoprof.getFone());
            ps.setString(7, alunoprof.getResponsavel());
            ps.setString(8, alunoprof.getProficiencia());
            ps.setString(9, alunoprof.getTurma());
            ps.setString(10, alunoprof.getEndereco());
            ps.setString(11, alunoprof.getTipo());
            ps.setString(12, alunoprof.getMateria());
            ps.setString(13, alunoprof.getTrimestre());
            ps.setString(14, alunoprof.getFalta());
            ps.setString(15, alunoprof.getNota());
            ps.setString(16, alunoprof.getCpf());
            retornoUpdate = ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro select: " + e.getMessage());
        }
        return retornoUpdate;
    }
     
       public static boolean deleteBancoAlunoProf(AlunoProf alunoprof) {
        boolean retornoDelete = false;
        try {
            String sqlDelete = "delete FROM alunoprof WHERE cpf = ?";
            PreparedStatement ps = connection.prepareStatement(sqlDelete);
            ps.setString(1, alunoprof.getCpf());
            retornoDelete = ps.execute();

        } catch (SQLException e) {
            System.out.println("Erro delete: " + e.getMessage());
        }
        return retornoDelete;
    }
}
