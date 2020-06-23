/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;
import system.appointment;

/**
 * FXML Controller class
 *
 * @author vip
 */
public class FXML4Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
      @FXML
    private TableView<appointment> tabel;

    @FXML
    private TableColumn<appointment, String> dname;

    @FXML
    private TableColumn<appointment, String> iname;

    @FXML
    private TableColumn<appointment, String> sname;

    @FXML
    private TableColumn<appointment, LocalDate> date;
    @FXML
    private TextField name;

    @FXML
    private TextField id;
    @FXML
    private DatePicker d;
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
    public void btn(){
        appointment a= new appointment(id.getText(),d.getValue(),name.getText(),sp.getText());
         tabel.getItems().add(a);
    }
    
     public void changi(TableColumn.CellEditEvent s)
    {
    appointment d=( appointment) tabel.getSelectionModel().getSelectedItems();
        d.setId(s.getNewValue().toString());
    }
      public void changn(TableColumn.CellEditEvent s)
    {
    appointment d=( appointment) tabel.getSelectionModel().getSelectedItems();
        d.setName(s.getNewValue().toString());
    }
       public void changs(TableColumn.CellEditEvent s)
    {
    appointment d=( appointment) tabel.getSelectionModel().getSelectedItems();
        d.setSpecialty(s.getNewValue().toString());
    }
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         dname.setCellValueFactory(new PropertyValueFactory<appointment,String>("name"));
        iname.setCellValueFactory(new PropertyValueFactory<appointment,String>("id"));
    sname.setCellValueFactory(new PropertyValueFactory<appointment,String>("specialty"));
    date.setCellValueFactory(new PropertyValueFactory<appointment,LocalDate>("date"));
    
    tabel.setItems(getdoctor());
        tabel.setEditable(true);
       dname.setCellFactory(TextFieldTableCell.forTableColumn());
       dname.setCellFactory(TextFieldTableCell.forTableColumn());
             iname.setCellFactory(TextFieldTableCell.forTableColumn());
       sname.setCellFactory(TextFieldTableCell.forTableColumn());
       
       //tabel.getSelectionModel().getSelectionMode(SelectionMode.MULTIPLE);
        
    } 
    public void delete (){
        ObservableList<appointment> selectedRows,allPeople;
        allPeople=tabel.getItems();
        selectedRows=tabel.getSelectionModel().getSelectedItems();
        for(appointment a:selectedRows)
        {
            allPeople.remove(a);
        }
    }
    public ObservableList<appointment> getdoctor(){
        ObservableList<appointment> doct = FXCollections.observableArrayList( );
          doct.add(new appointment("1",LocalDate.of(1980, Month.MARCH, 3),"Ahmed","Internal Medicine"));
          doct.add(new appointment("2",LocalDate.of(1989, Month.MARCH, 2),"Mohmed","Internal Medicine"));
        
        return doct;
     
        
    }  
    
    
}
