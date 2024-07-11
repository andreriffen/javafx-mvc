package andreriffen.javafxcrudmvc.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class FXMLAnchorPaneCadastrosClientes implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btninsert;

    @FXML
    private Button btnremove;

    @FXML
    private Button btnupdate;

    @FXML
    private Label labelClienteCPF;

    @FXML
    private Label labelClienteCodigo;

    @FXML
    private Label labelClienteNome;

    @FXML
    private Label labelClienteTelefone;

    @FXML
    private TableColumn<?, ?> tableCollumnClienteCPF;

    @FXML
    private TableColumn<?, ?> tableCollumnClienteNome;

    @FXML
    private TableView<?> tableviewClientes;

    @FXML
    void initialize() {
        assert btninsert != null : "fx:id=\"btninsert\" was not injected: check your FXML file 'FXMLAnchorPaneCadastrosClientes.fxml'.";
        assert btnremove != null : "fx:id=\"btnremove\" was not injected: check your FXML file 'FXMLAnchorPaneCadastrosClientes.fxml'.";
        assert btnupdate != null : "fx:id=\"btnupdate\" was not injected: check your FXML file 'FXMLAnchorPaneCadastrosClientes.fxml'.";
        assert labelClienteCPF != null : "fx:id=\"labelClienteCPF\" was not injected: check your FXML file 'FXMLAnchorPaneCadastrosClientes.fxml'.";
        assert labelClienteCodigo != null : "fx:id=\"labelClienteCodigo\" was not injected: check your FXML file 'FXMLAnchorPaneCadastrosClientes.fxml'.";
        assert labelClienteNome != null : "fx:id=\"labelClienteNome\" was not injected: check your FXML file 'FXMLAnchorPaneCadastrosClientes.fxml'.";
        assert labelClienteTelefone != null : "fx:id=\"labelClienteTelefone\" was not injected: check your FXML file 'FXMLAnchorPaneCadastrosClientes.fxml'.";
        assert tableCollumnClienteCPF != null : "fx:id=\"tableCollumnClienteCPF\" was not injected: check your FXML file 'FXMLAnchorPaneCadastrosClientes.fxml'.";
        assert tableCollumnClienteNome != null : "fx:id=\"tableCollumnClienteNome\" was not injected: check your FXML file 'FXMLAnchorPaneCadastrosClientes.fxml'.";
        assert tableviewClientes != null : "fx:id=\"tableviewClientes\" was not injected: check your FXML file 'FXMLAnchorPaneCadastrosClientes.fxml'.";

    }

    @Override
    public void initialize(URL url, ResourceBundle rb){
        //TODO
    }

}
