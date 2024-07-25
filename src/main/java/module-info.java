module andreriffen.javafxmvc {
    requires javafx.controls;
    requires javafx.fxml;
    requires atlantafx.base;
    requires java.sql;
    requires jasperreports;

    // Permitir que o módulo javafx.fxml acesse os pacotes internos
    opens andreriffen.javafxmvc.controller to javafx.fxml;
    opens andreriffen.javafxmvc to javafx.fxml;

    exports andreriffen.javafxmvc;
}
