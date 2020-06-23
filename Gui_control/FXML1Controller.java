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
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;
import system.doctor;

/**
 * FXML Controller class
 *
 * @author vip
 */
public class FXML1Controller implements Initializable {

    
    @FXML
    private TableView<doctor> tabel;
     @FXML
    private TableColumn<doctor, String> dname;

    @FXML
    private TableColumn<doctor, String> iname;

    @FXML
    private TableColumn<doctor, String> aname;

    @FXML
    private TableColumn<doctor, String> pname;

    @FXML
    private TableColumn<doctor, String> sname;
@FXML
    private TextField name;

    @FXML
    private TextField id;

    @FXML
    private TextField add;

    @FXML
    private TextField ph;

    @FXML
    private TextField sp;
  
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
    public void changn(CellEditEvent s)
    {
        doctor d=(doctor) tabel.getSelectionModel().getSelectedItems();
        d.setName(s.getNewValue().toString());
    }
    public void changi(CellEditEvent s)
    {
        doctor d=(doctor) tabel.getSelectionModel().getSelectedItems();
        d.setId(s.getNewValue().toString());
    }
    public void changa(CellEditEvent s)
    {
        doctor d=(doctor) tabel.getSelectionModel().getSelectedItems();
        d.setAddress(s.getNewValue().toString());
    }
    public void changp(CellEditEvent s)
    {
        doctor d=(doctor) tabel.getSelectionModel().getSelectedItems();
        d.setPhone(s.getNewValue().toString());
    }
    public void changs(CellEditEvent s)
    {
        doctor d=(doctor) tabel.getSelectionModel().getSelectedItems();
        d.setSpecialty(s.getNewValue().toString());
    }
    public void btn(){
        doctor d=new doctor(name.getText(),id.getText(),sp.getText(),ph.getText(),add.getText());
        tabel.getItems().add(d);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
                 
    dname.setCellValueFactory(new PropertyValueFactory<doctor,String>("name"));
    pname.setCellValueFactory(new PropertyValueFactory<doctor,String>("phone"));
    aname.setCellValueFactory(new PropertyValueFactory<doctor,String>("address"));
    iname.setCellValueFactory(new PropertyValueFactory<doctor,String>("id"));
    sname.setCellValueFactory(new PropertyValueFactory<doctor,String>("specialty"));
     
    
       tabel.setItems(getdoctor());
       tabel.setEditable(true);
       dname.setCellFactory(TextFieldTableCell.forTableColumn());
       pname.setCellFactory(TextFieldTableCell.forTableColumn());
       aname.setCellFactory(TextFieldTableCell.forTableColumn());
       iname.setCellFactory(TextFieldTableCell.forTableColumn());
       sname.setCellFactory(TextFieldTableCell.forTableColumn());
      //tabel.getSelectionModel().getSelectionMode(SelectionMode.MULTIPLE);//
    } 
    public void delete (){
        ObservableList<doctor> selectedRows,allPeople;
        allPeople=tabel.getItems();
        selectedRows=tabel.getSelectionModel().getSelectedItems();
        for(doctor a:selectedRows)
        {
            allPeople.remove(a);
        }
    }
    public ObservableList<doctor> getdoctor(){
        ObservableList<doctor> docto = FXCollections.observableArrayList( );
         docto.add(new doctor("1", "8590977", "Alzamalk","Ahmed","Internal Medicine"));
        docto.add(new doctor("2", "1283895", "MdentNaser","Mohmmed","General Surgery"));
        docto.add(new doctor("3", "1045533", "algeza","Naser","General Surgery"));
        docto.add(new doctor("4", "1989076", "Alqahra","Adel","Pediatrics"));
        docto.add(new doctor("5", "1800084", "Alzmalk","Ghada","Pediatrics"));
        return docto;
     
        
    }

    
        
}
