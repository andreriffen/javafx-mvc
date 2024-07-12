package andreriffen.javafxcrudmvc.model.database;

import java.sql.Connection;

@SuppressWarnings("SpellCheckingInspection") //Avoid 'typo error' IDE English
public interface Database {

    Connection conectar();
    void desconectar(Connection conn);
}
