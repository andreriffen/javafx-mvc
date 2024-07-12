package andreriffen.javafxcrudmvc;

import atlantafx.base.theme.PrimerDark;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("FXMLAnchorPaneCadastrosClientes.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("FXMLVBoxMain.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        Application.setUserAgentStylesheet(new PrimerDark().getUserAgentStylesheet());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}