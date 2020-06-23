/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;


public class FXML6Controller implements Initializable {

  @FXML
    void home(ActionEvent event) throws IOException {
   Parent root = FXMLLoader.load(getClass().getResource("FXML2.fxml"));
               Stage stage =new Stage();
               Scene scene = new Scene(root);
              ((Node)(event.getSource())).getScene().getWindow().hide();
              stage.setScene(scene);
                stage.show();
    }

    @FXML
    void logout(ActionEvent event) throws IOException {
   Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
               Stage stage =new Stage();
               Scene scene = new Scene(root);
              ((Node)(event.getSource())).getScene().getWindow().hide();
              stage.setScene(scene);
                stage.show();
    }
       @FXML
    private TableView<normal> tabel;
       @FXML
    private TextField d;

     @FXML
    private TableColumn<normal, String> dname;

    @FXML
    private TableColumn<normal, String> iname;

    @FXML
    private TableColumn<normal, String> aname;

    @FXML
    private TableColumn<normal, String> pname;

    @FXML
    private TableColumn<normal, String> gender;

    @FXML
    private TableColumn<normal, String> sname;

    @FXML
    private TableColumn<normal, String> dia;

    @FXML
    private TableColumn<normal, String> pay;
    @FXML
    private TextField name;

    @FXML
    private TextField id;

    @FXML
    private TextField add;

    @FXML
    private TextField ph;

   @FXML
    private TextField ge;

    @FXML
    private TextField p;


    @FXML
    private TextField sy;
        public void changa(TableColumn.CellEditEvent s)
    {
        normal d=(normal) tabel.getSelectionModel().getSelectedItems();
        d.setAddress(s.getNewValue().toString());
    }
     public void changd(TableColumn.CellEditEvent s)
    {
        normal d=(normal) tabel.getSelectionModel().getSelectedItems();
        d.setDiagnosis(s.getNewValue().toString());
    }
      public void changg(TableColumn.CellEditEvent s)
    {
        normal d=(normal) tabel.getSelectionModel().getSelectedItems();
        d.setGender(s.getNewValue().toString());
    }
       public void changi(TableColumn.CellEditEvent s)
    {
        normal d=(normal) tabel.getSelectionModel().getSelectedItems();
        d.setId(s.getNewValue().toString());
    }
        public void changn(TableColumn.CellEditEvent s)
    {
        normal d=(normal) tabel.getSelectionModel().getSelectedItems();
        d.setName(s.getNewValue().toString());
    }
         public void changp(TableColumn.CellEditEvent s)
    {
        normal d=(normal) tabel.getSelectionModel().getSelectedItems();
        d.setPayment(s.getNewValue().toString());
    }
          public void changph(TableColumn.CellEditEvent s)
    {
        normal d=(normal) tabel.getSelectionModel().getSelectedItems();
        d.setPhone(s.getNewValue().toString());
    }
           public void changas(TableColumn.CellEditEvent s)
    {
        normal d=(normal) tabel.getSelectionModel().getSelectedItems();
        d.setSymptoms(s.getNewValue().toString());
    }
           public void btn(){
               normal n=new normal(name.getText(),id.getText(),ph.getText(),add.getText(),sy.getText(),dia.getText(),p.getText(),ge.getText());
               tabel.getItems().add(n);
           }



    @Override
    public void initialize(URL url, ResourceBundle rb) {
            dname.setCellValueFactory(new PropertyValueFactory<normal,String>("name"));
    pname.setCellValueFactory(new PropertyValueFactory<normal,String>("phone"));
    aname.setCellValueFactory(new PropertyValueFactory<normal,String>("address"));
    iname.setCellValueFactory(new PropertyValueFactory<normal,String>("id"));
    sname.setCellValueFactory(new PropertyValueFactory<normal,String>("Symptoms"));
    pay.setCellValueFactory(new PropertyValueFactory<normal,String>("payment"));
    gender.setCellValueFactory(new PropertyValueFactory<normal,String>("gender"));
    pname.setCellValueFactory(new PropertyValueFactory<normal,String>("phone"));
    dia.setCellValueFactory(new PropertyValueFactory<normal,String>("Diagnosis"));
       
      tabel.setItems(getdoctor());
       tabel.setEditable(true);
       dname.setCellFactory(TextFieldTableCell.forTableColumn());
       pname.setCellFactory(TextFieldTableCell.forTableColumn());
       aname.setCellFactory(TextFieldTableCell.forTableColumn());
       iname.setCellFactory(TextFieldTableCell.forTableColumn());
       sname.setCellFactory(TextFieldTableCell.forTableColumn());
        pay.setCellFactory(TextFieldTableCell.forTableColumn());
         gender.setCellFactory(TextFieldTableCell.forTableColumn());
          dia.setCellFactory(TextFieldTableCell.forTableColumn());
           //tabel.getSelectionModel().getSelectionMode(SelectionMode.MULTIPLE);

    } 
    public void delete (){
        ObservableList<normal> selectedRows,allPeople;
        allPeople=tabel.getItems();
        selectedRows=tabel.getSelectionModel().getSelectedItems();
        for(normal a:selectedRows)
        {
            allPeople.remove(a);
        }
    }
    public ObservableList<normal> getdoctor(){
        ObservableList<normal> doct = FXCollections.observableArrayList( );
         doct.add(new normal("1", "8590977", "Alzamalk","Ahmed","Hip pain","Hip ","Male","cash"));
        doct.add(new normal("2", "1283895", "MdentNaser","Mohmmed","knee pain","Knee ","Male","credt"));
        doct.add(new normal("3", "1045533", "algeza","Naser","Hedaches","Hedaches","Male","cash"));
        
        return doct;
     
        
    }
  
    

    }    
    

