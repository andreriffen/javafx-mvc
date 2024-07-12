module andreriffen.javafxcrudmvc {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    requires java.sql;
    requires atlantafx.base;

    opens andreriffen.javafxcrudmvc to javafx.fxml;
    opens andreriffen.javafxcrudmvc.view to javafx.fxml;

    exports andreriffen.javafxcrudmvc;
    exports andreriffen.javafxcrudmvc.model.database;
    exports andreriffen.javafxcrudmvc.view;
    //exports andreriffen.javafxcrudmvc.controller;
}