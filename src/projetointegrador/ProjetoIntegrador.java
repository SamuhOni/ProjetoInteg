
package projetointegrador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ProjetoIntegrador {

    static Connection connection = null;
  
    public static void main(String[] args) {
        
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String serverName = "127.0.0.1:3306";    //caminho do servidor do BD
            String mydatabase = "aula";        //nome do seu banco de dados
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?useTimezone=true&serverTimezone=UTC";
            String username = "root";        //nome de um usuário de seu BD
            String password = "Nanda02";      //sua senha de acesso

            connection = DriverManager.getConnection(url, username, password);

            //Testa sua conexão//
            if (connection != null) {
                System.out.println("STATUS--->Conectado com sucesso!");
            } else {
                System.out.println("STATUS--->Não foi possivel realizar conexão");
            }

        } catch (ClassNotFoundException e) {  //Driver não encontrado
            System.out.println("O driver expecificado nao foi encontrado.");

        } catch (SQLException e) {
            //Não conseguindo se conectar ao banco
            System.out.println("Nao foi possivel conectar ao Banco de Dados." + e.getMessage());
        }
        
    }
    
}
