package andreriffen.javafxcrudmvc.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class FXMLVBoxMain {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuItem menuItemCadastrosCategorias;

    @FXML
    private MenuItem menuItemCadastrosClientes;

    @FXML
    private MenuItem menuItemCadastrosProdutos;

    @FXML
    private MenuItem menuItemGraficosVendasPorMes;

    @FXML
    private MenuItem menuItemProcessosVendas;

    @FXML
    private MenuItem menuItemRelatoriosQuantidadeProdutos;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    void initialize() {
        assert menuItemCadastrosCategorias != null : "fx:id=\"menuItemCadastrosCategorias\" was not injected: check your FXML file 'FXMLVBoxMain.fxml'.";
        assert menuItemCadastrosClientes != null : "fx:id=\"menuItemCadastrosClientes\" was not injected: check your FXML file 'FXMLVBoxMain.fxml'.";
        assert menuItemCadastrosProdutos != null : "fx:id=\"menuItemCadastrosProdutos\" was not injected: check your FXML file 'FXMLVBoxMain.fxml'.";
        assert menuItemGraficosVendasPorMes != null : "fx:id=\"menuItemGraficosVendasPorMes\" was not injected: check your FXML file 'FXMLVBoxMain.fxml'.";
        assert menuItemProcessosVendas != null : "fx:id=\"menuItemProcessosVendas\" was not injected: check your FXML file 'FXMLVBoxMain.fxml'.";
        assert menuItemRelatoriosQuantidadeProdutos != null : "fx:id=\"menuItemRelatoriosQuantidadeProdutos\" was not injected: check your FXML file 'FXMLVBoxMain.fxml'.";

    }

    @FXML
    public void handleMenuItemCadastrosClientes() throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FXMLAnchorPaneCadastrosClientes.fxml")));
        anchorPane.getChildren().setAll(a);
    }
}
