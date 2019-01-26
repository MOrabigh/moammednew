package sample;

import Connectvy.ConnectionClass;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;



public class Controller_AddMO implements Initializable{

    @FXML
    private JFXDatePicker Date_Warranty_AddMO;
    @FXML
    private JFXDatePicker Date_StartMo_AddMO;
    @FXML
    private JFXDatePicker Date_EndMO_AddMO;
    @FXML
    private JFXTextField Txfiled_SPCost_AddMO;
    @FXML
    private JFXTextField Txfiled_MOCost_AddMO;
    @FXML
    private JFXTextField Txfiled_VAT_AddMO;
    @FXML
    private JFXTextField Txfiled_TotalCost_AddMO;
    @FXML
    private JFXTextField Txfiled_MOnum_AddMO;
    @FXML
    private JFXTextArea Txfiled_ProplemDisc_AddMO;
    @FXML
    private ComboBox<?> Selct_Techichan_AddMO;
    @FXML
    private ComboBox<?> Selct_MoStatus_AddMO;
    @FXML
    private JFXTextField Txfiled_SpSerialN_AddMO;
    @FXML
    private JFXTextField Txfiled_SearchSP_AddMO;
    @FXML
    private JFXTextField Txfiled_CusName_AddMO;
    @FXML
    private JFXTextField Txfiled_CusMnum_AddMO;
    @FXML
    private JFXTextField Txfiled_DevSerialN_AddMO;
    @FXML
    private JFXTextField Txfiled_DevDiscription_AddMO;
    @FXML
    private JFXButton Btn_Print_AddMo;
    @FXML
    private JFXButton Btn_Cancle_AddMo;
    @FXML
    private JFXButton Btn_Delete_AddMo;
    @FXML
    private JFXButton Btn_Save_AddMo;
    @FXML
    private JFXButton Btn_Search_AddMo;
    
    
    

 
    @FXML
    private void M_Txfiled_SpSerialN_AddMO(ActionEvent event) {
    }

    @FXML
    private void M_Btn_ReomveSP_AddMo(ActionEvent event) {
    }

    @FXML
    private void M_Txfiled_SearchSP_AddMO(ActionEvent event) {
    }

    @FXML
    private void M_Btn_AddSP_AddMo(ActionEvent event) {
    }

    @FXML
    private void M_Btn_Print_AddMo(ActionEvent event) {
    }

    @FXML
    private void M_Btn_Cancle_AddMo(ActionEvent event) {
    }

    @FXML
    private void M_Btn_Delete_AddMo(ActionEvent event) {
    }

    @FXML
    private void M_Btn_Save_AddMo(ActionEvent event) {
    }

    ConnectionClass connectionClass = new ConnectionClass();
    //Connection connection;
    @FXML
    private void M_Btn_Search_AddMo(ActionEvent event) throws SQLException {
        
                     
   
        
  Connection connection = connectionClass.getConnection();
       // String sql ="INSERT INTO \"azoz\".\"dbo\".\"user\" (\"name\") VALUES('"+textbox.getText()+"')";
        String sql ="INSERT INTO user VALUES('"+"hhhhhhhh"+"')";
       java.sql.Statement statement1 = connection.createStatement();
        statement1.executeUpdate(sql);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
          //ConnectionClass connectionClass = new ConnectionClass();
    // we call conneClass  that we make it up
    Connection connection = connectionClass.getConnection();
        System.out.println("Byee");    }

  



}