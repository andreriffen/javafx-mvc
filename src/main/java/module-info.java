module andreriffen.javafxcrudmvc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires atlantafx.base;

    opens andreriffen.javafxcrudmvc to javafx.fxml;
    exports andreriffen.javafxcrudmvc;
}