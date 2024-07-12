package andreriffen.javafxcrudmvc.model.database;

import java.sql.Connection;

@SuppressWarnings("SpellCheckingInspection") //BRAZIL-IL
public class TestDatabaseConnection {
    public static void main(String[] args) {
        Database database = DatabaseFactory.getDatabase("postgresql");

        if (database != null) {
            Connection connection = database.conectar();
            if (connection != null) {
                System.out.println("Conexão estabelecida com sucesso!");
                database.desconectar(connection);
            } else {
                System.out.println("Falha ao estabelecer conexão.");
            }
        } else {
            System.out.println("Banco de dados não suportado.");
        }
    }
}
