package andreriffen.javafxcrudmvc.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

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
        void initialize() {
            assert menuItemCadastrosCategorias != null : "fx:id=\"menuItemCadastrosCategorias\" was not injected: check your FXML file 'FXMLVBoxMain.fxml'.";
            assert menuItemCadastrosClientes != null : "fx:id=\"menuItemCadastrosClientes\" was not injected: check your FXML file 'FXMLVBoxMain.fxml'.";
            assert menuItemCadastrosProdutos != null : "fx:id=\"menuItemCadastrosProdutos\" was not injected: check your FXML file 'FXMLVBoxMain.fxml'.";
            assert menuItemGraficosVendasPorMes != null : "fx:id=\"menuItemGraficosVendasPorMes\" was not injected: check your FXML file 'FXMLVBoxMain.fxml'.";
            assert menuItemProcessosVendas != null : "fx:id=\"menuItemProcessosVendas\" was not injected: check your FXML file 'FXMLVBoxMain.fxml'.";
            assert menuItemRelatoriosQuantidadeProdutos != null : "fx:id=\"menuItemRelatoriosQuantidadeProdutos\" was not injected: check your FXML file 'FXMLVBoxMain.fxml'.";

        }

    }
