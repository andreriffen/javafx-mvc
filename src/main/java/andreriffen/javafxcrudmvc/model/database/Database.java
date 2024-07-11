package andreriffen.javafxcrudmvc.model.database;

import java.sql.Connection;

@SuppressWarnings("SpellCheckingInspection") //Avoid 'typo error' IDE English
public interface Database {

    public Connection conectar();
    public void desconectar(Connection conn);
}
