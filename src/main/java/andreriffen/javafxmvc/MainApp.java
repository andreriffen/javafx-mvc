package andreriffen.javafxmvc;

import atlantafx.base.theme.PrimerDark;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("FXMLVBoxMain.fxml"));
        Application.setUserAgentStylesheet(new PrimerDark().getUserAgentStylesheet());
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Sistema de Vendas (JavaFX MVC)");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}