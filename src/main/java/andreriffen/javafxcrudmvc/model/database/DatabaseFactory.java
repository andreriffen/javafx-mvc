package andreriffen.javafxcrudmvc.model.database;

@SuppressWarnings("SpellCheckingInspection") //Avoid 'typo error' IDE English
public class DatabaseFactory {
    public static Database getDatabase(String nome){
        if(nome.equals("postgresql")){
            return new DatabasePostgreSQL();
        }else if(nome.equals("mysql")){
            return new DatabaseMySQL();
        }
        return null;
    }
}
