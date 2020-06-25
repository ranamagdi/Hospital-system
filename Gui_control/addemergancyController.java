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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author vip
 */
public class addemergancyController implements Initializable {

    

    @FXML
    private void logout(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
               Stage stage =new Stage();
               Scene scene = new Scene(root);
              ((Node)(event.getSource())).getScene().getWindow().hide();
              stage.setScene(scene);
                stage.show();
    }

    @FXML
    private void home(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FXML2.fxml"));
               Stage stage =new Stage();
               Scene scene = new Scene(root);
              ((Node)(event.getSource())).getScene().getWindow().hide();
              stage.setScene(scene);
                stage.show();
    }
    @FXML
    private TableView<emergency> tabel;

    @FXML
    private TableColumn<emergency, String> dname;

    @FXML
    private TableColumn<emergency, String> iname;

    @FXML
    private TableColumn<emergency,String> aname;

    @FXML
    private TableColumn<emergency, String> pname;

    @FXML
    private TableColumn<emergency, String> gender;

    @FXML
    private TableColumn<emergency, String> sname;

    @FXML
    private TableColumn<emergency, String> dia;

    @FXML
    private TableColumn<emergency, String> pay;
    @FXML
    private TableColumn<emergency, String> room;
        @FXML
    private TextField name;
     @FXML
    private TextField p;

    @FXML
    private TextField id;

    @FXML
    private TextField add;

    @FXML
    private TextField ph;

    @FXML
    private TextField ge;

    @FXML
    private TextField sy;
    @FXML
    private TextField r;
      @FXML
    private TextField d;
   
         public void changa(TableColumn.CellEditEvent s)
    {
      emergency d=( emergency) tabel.getSelectionModel().getSelectedItems();
        d.setAddress(s.getNewValue().toString());
    }
     public void changd(TableColumn.CellEditEvent s)
    {
      emergency d=( emergency) tabel.getSelectionModel().getSelectedItems();
        d.setDiagnosis(s.getNewValue().toString());
    }
      public void changg(TableColumn.CellEditEvent s)
    {
         emergency d=( emergency) tabel.getSelectionModel().getSelectedItems();
        d.setGender(s.getNewValue().toString());
    }
       public void changi(TableColumn.CellEditEvent s)
    {
        emergency d=( emergency) tabel.getSelectionModel().getSelectedItems();
        d.setId(s.getNewValue().toString());
    }
        public void changn(TableColumn.CellEditEvent s)
    {
      emergency d=( emergency) tabel.getSelectionModel().getSelectedItems();
        d.setName(s.getNewValue().toString());
    }
         public void changp(TableColumn.CellEditEvent s)
    {
       emergency d=( emergency) tabel.getSelectionModel().getSelectedItems();
        d.setPayment(s.getNewValue().toString());
    }
          public void changph(TableColumn.CellEditEvent s)
    {
          emergency d=(  emergency) tabel.getSelectionModel().getSelectedItems();
        d.setPhone(s.getNewValue().toString());
    }
           public void changas(TableColumn.CellEditEvent s)
    {
        emergency d=(emergency) tabel.getSelectionModel().getSelectedItems();
        d.setSymptoms(s.getNewValue().toString());
    }
                   public void changar(TableColumn.CellEditEvent s)
    {
        emergency d=(emergency) tabel.getSelectionModel().getSelectedItems();
        d.setRoom(s.getNewValue().toString());
    }



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
               dname.setCellValueFactory(new PropertyValueFactory<emergency,String>("name"));
    pname.setCellValueFactory(new PropertyValueFactory<emergency,String>("phone"));
    aname.setCellValueFactory(new PropertyValueFactory<emergency,String>("address"));
    iname.setCellValueFactory(new PropertyValueFactory<emergency,String>("id"));
    sname.setCellValueFactory(new PropertyValueFactory<emergency,String>("Symptoms"));
    pay.setCellValueFactory(new PropertyValueFactory<emergency,String>("payment"));
    gender.setCellValueFactory(new PropertyValueFactory<emergency,String>("gender"));
       dia.setCellValueFactory(new PropertyValueFactory<emergency,String>("Diagnosis"));
       room.setCellValueFactory(new PropertyValueFactory<emergency,String>("room"));
      tabel.setItems(getdoctor());
        tabel.setEditable(true);
      // tabel.getSelectionModel().getSelectionMode(SelectionMode.MULTIPLE);//
          
    } 
    public void btn(){
               emergency n=new emergency(name.getText(),id.getText(),ph.getText(),add.getText(),sy.getText(),d.getText(),p.getText(),ge.getText(),r.getText());
               tabel.getItems().add(n);
           }
    public void delete (){
        ObservableList<emergency> selectedRows,allPeople;
        allPeople=tabel.getItems();
        selectedRows=tabel.getSelectionModel().getSelectedItems();
        for(emergency a:selectedRows)
        {
            allPeople.remove(a);
        }
    }
    public ObservableList<emergency> getdoctor(){
        ObservableList<emergency> doct = FXCollections.observableArrayList( );
         doct.add(new emergency("1", "8590977", "Alzamalk","Ahmed","Hip pain","Hip ","Male","cash","6567"));
        doct.add(new emergency("2", "1283895", "MdentNaser","Mohmmed","knee pain","Knee ","Male","credt","764"));
        doct.add(new emergency("3", "1045533", "algeza","Naser","Hedaches","Hedaches","Male","cash","45"));
        
        return doct;
     
        
    }
    }    

      
    

