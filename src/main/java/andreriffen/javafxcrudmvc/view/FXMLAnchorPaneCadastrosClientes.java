package andreriffen.javafxcrudmvc.view;

import java.net.URL;
import java.sql.Connection;
import java.util.List;
import java.util.ResourceBundle;

import andreriffen.javafxcrudmvc.model.dao.*;
import andreriffen.javafxcrudmvc.model.database.*;
import andreriffen.javafxcrudmvc.model.domain.*;
import javafx.collections.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

@SuppressWarnings("SpellCheckingInspection")// WELCOME TO BRAZIL!!! 🇧🇷 🇧🇷 🇧🇷
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
    private TableView<Cliente> tableviewClientes;

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


    //Atributos para manipulação do Banco de Dados
    private final Database database = DatabaseFactory.getDatabase("javafxmvc");

    private final Connection connection;

    {
        assert database != null;
        connection = database.conectar();
    }

    private final ClienteDAO clienteDAO = new ClienteDAO();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if (connection != null) {
            clienteDAO.setConnection(connection);
            carregarTableViewCliente();
        } else {
            System.err.println("Erro ao conectar com o banco de dados.");
        }
    }


    public void carregarTableViewCliente(){
        tableCollumnClienteNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        tableCollumnClienteCPF.setCellValueFactory(new PropertyValueFactory<>("cpf"));

        List<Cliente> listClientes = clienteDAO.listar();

        ObservableList<Cliente> observableListClientes = FXCollections.observableArrayList(listClientes);

        tableviewClientes.setItems(observableListClientes);
    }
}
