package andreriffen.javafxcrudmvc.controller;

import andreriffen.javafxcrudmvc.model.domain.Cliente;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.List;

@SuppressWarnings("SpellCheckingInspection")
public class CadastrosClientes {//implements Initializable (require initialize with resource bundle

    @FXML
    private TableView<Cliente> tableViewClientes;
    @FXML
    private TableColumn<Cliente, String> tableColumnClienteNome;
    @FXML
    private TableColumn<Cliente, String> tableColumnClienteCPF;
    @FXML
    private Button buttonInserir;
    @FXML
    private Button buttonAlterar;
    @FXML
    private Button buttonRemover;
    @FXML
    private Label labelClienteCodigo;
    @FXML
    private Label labelClienteNome;
    @FXML
    private Label labelClienteCPF;
    @FXML
    private Label labelClienteTelefone;

    private List<Cliente> listClientes;
    private ObservableList<Cliente> observableListClientes;


    //Atributos para manipulação de Banco de Dados
//    private final Database database = DatabaseFactory.getDatabase("postgresql");
//    private final Connection connection = database.conectar();
//    private final ClienteDAO clienteDAO = new ClienteDAO();


//    @Override
//    public void initialize(URL url, ResourceBundle rb) {
//        clienteDAO.setConnection(connection);
//        carregarTableViewCliente();
//
//        // Listen acionado diante de quaisquer alterações na seleção de itens do TableView
//        tableViewClientes.getSelectionModel().selectedItemProperty().addListener(
//                (observable, oldValue, newValue) -> selecionarItemTableViewClientes(newValue));
//
//    }

//    public void carregarTableViewCliente() {
//        tableColumnClienteNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
//        tableColumnClienteCPF.setCellValueFactory(new PropertyValueFactory<>("cpf"));
//
//        listClientes = clienteDAO.listar();
//
//        observableListClientes = FXCollections.observableArrayList(listClientes);
//        tableViewClientes.setItems(observableListClientes);
//    }


//    public void selecionarItemTableViewClientes(Cliente cliente){
//        if (cliente != null) {
//            labelClienteCodigo.setText(String.valueOf(cliente.getCdCliente()));
//            labelClienteNome.setText(cliente.getNome());
//            labelClienteCPF.setText(cliente.getCpf());
//            labelClienteTelefone.setText(cliente.getTelefone());
//        } else {
//            labelClienteCodigo.setText("");
//            labelClienteNome.setText("");
//            labelClienteCPF.setText("");
//            labelClienteTelefone.setText("");
//        }
//
//    }


}
