module andreriffen.javafxcrudmvc {
    requires javafx.fxml;

    requires atlantafx.base;
    requires java.sql;

    opens andreriffen.javafxcrudmvc to javafx.fxml;
    opens andreriffen.javafxcrudmvc.controller to javafx.fxml;

    exports andreriffen.javafxcrudmvc;
    exports andreriffen.javafxcrudmvc.controller;
}