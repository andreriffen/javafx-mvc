package andreriffen.javafxcrudmvc.model.database;

public class DatabaseFactory {
    public static Database getDatabase(String nome){
        if(nome.equalsIgnoreCase("javafxmvc")){
            return new DatabasePostgreSQL();
        } else if(nome.equalsIgnoreCase("mysql")){
            return new DatabaseMySQL();
        }
        return null;
    }
}

