package andreriffen.javafxcrudmvc.view;

import andreriffen.javafxcrudmvc.model.dao.ClienteDAO;
import andreriffen.javafxcrudmvc.model.database.Database;
import andreriffen.javafxcrudmvc.model.database.DatabaseFactory;
import andreriffen.javafxcrudmvc.model.domain.Cliente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.util.List;
import java.util.ResourceBundle;

@SuppressWarnings("SpellCheckingInspection")// WELCOME TO BRAZIL!!! 🇧🇷 🇧🇷 🇧🇷
public class FXMLAnchorPaneCadastrosClientes implements Initializable {

    //Atributos para manipulação do Banco de Dados
    private final Database database = DatabaseFactory.getDatabase("javafxmvc");
    private final Connection connection;
    private final ClienteDAO clienteDAO = new ClienteDAO();
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

    {
        assert database != null;
        connection = database.conectar();
    }

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
    public void initialize(URL url, ResourceBundle rb) {
        if (connection != null) {
            clienteDAO.setConnection(connection);
            carregarTableViewCliente();
        } else {
            System.err.println("Erro ao conectar com o banco de dados.");
        }
    }


    public void carregarTableViewCliente() {
        tableCollumnClienteNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        tableCollumnClienteCPF.setCellValueFactory(new PropertyValueFactory<>("cpf"));

        List<Cliente> listClientes = clienteDAO.listar();

        ObservableList<Cliente> observableListClientes = FXCollections.observableArrayList(listClientes);

        tableviewClientes.setItems(observableListClientes);
    }
}
