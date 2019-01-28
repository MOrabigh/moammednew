package sample;

import Connectvy.ConnectionClass;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;



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
     ObservableList<String> ListOfStatus = FXCollections.observableArrayList("UnderMO", "Another Problem", "Finsh");

    ObservableList<String> ListOfTechichan = FXCollections.observableArrayList();

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

    void loadWindow(String loc , String title){
        try {

            Parent parent = FXMLLoader.load(getClass().getResource(loc));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setScene(new Scene(parent));
            stage.setTitle(title);
            stage.show();
        } catch (IOException s) {
            s.printStackTrace();
        }}


    


    @FXML
     private void M_Btn_Print_AddMo(ActionEvent event)  {
       
     loadWindow("/sample/Print_Window.fxml" ,"" );

       
    
    }
     
    

    @FXML
    private void M_Btn_Cancle_AddMo(ActionEvent event) {
      
        
       Txfiled_ProplemDisc_AddMO.clear();
       Txfiled_CusMnum_AddMO.clear();
       Txfiled_SPCost_AddMO.clear();
       Txfiled_MOCost_AddMO.clear();
       Txfiled_DevSerialN_AddMO.clear();
       Txfiled_DevDiscription_AddMO.clear();
       Txfiled_SpSerialN_AddMO.clear();
       Txfiled_TotalCost_AddMO.clear();
       Txfiled_VAT_AddMO.clear();
       Txfiled_MOnum_AddMO.clear();
       Txfiled_SearchSP_AddMO.clear();
       Selct_Techichan_AddMO.getSelectionModel().clearSelection();
       
       
       
       
       
       
       
       
       
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
               //String sql ="INSERT INTO student VALUES('100.00')"; 
        // String sql ="INSERT INTO maintenance_operation VALUES('"+
         //Txfiled_ProplemDisc_AddMO.getText()+"''"+Txfiled_CusMnum_AddMO.getText()+"'"
                 //+ "'"+Date_Warranty_AddMO.getValue()+"''"+Date_StartMo_AddMO.getValue()+"''"+Date_EndMO_AddMO.getValue()+"''"+Txfiled_SPCost_AddMO.getText()+"'"
                 //+ "'"+Txfiled_MOCost_AddMO.getText()+"''"+Txfiled_MOnum_AddMO.getText()+"')";
                 
                 //String sql = "select * from maintenance_operation WHERE MO_NBER = '" + Txfiled_MOnum_AddMO.getText()+ "'";
             
                Statement st = connection.createStatement();
               st.executeQuery("select * FROM  maintenance_operation WHERE MO_NBER= '" + Txfiled_MOnum_AddMO.getText()+ "'");
              ResultSet rs = st.getResultSet();
              //st = connection.prepareCall(sql);
              
              if(rs.first()){
                  
            
        
            Txfiled_ProplemDisc_AddMO.setText(rs.getString("PROBLEM_DESC"));
            Txfiled_CusMnum_AddMO.setText(rs.getString("CUS_MOBILE_NBER"));
            Txfiled_SPCost_AddMO.setText(rs.getString("SP_COST"));
            Txfiled_MOCost_AddMO.setText(rs.getString("MO_COST"));
            Txfiled_DevSerialN_AddMO.setText(rs.getString("DEVICE_SN"));
            Txfiled_DevDiscription_AddMO.setText(rs.getString("DEVICE_DESC"));
            Date_Warranty_AddMO.getEditor().setText(rs.getString("WARRANTY"));
            Date_StartMo_AddMO.getEditor().setText(rs.getString("STARTING_DATE"));
            Date_EndMO_AddMO.getEditor().setText(rs.getString("ENDING_DATE"));
             Btn_Delete_AddMo.setDisable(false);
             Btn_Save_AddMo.setDisable(false);
             Btn_Print_AddMo.setDisable(false);
             Btn_Delete_AddMo.setDisable(false);
             Txfiled_CusName_AddMO.setDisable(true);
      //Selct_Techichan_AddMO.getSelectionModel().selectedIndexProperty().(rs.getString("STATE"));
      
            
            //Selct_MoStatus_AddMO.setItems(Integer.toString(rs.getInt("EMPLOYEE_ID"));
            //String s = rs.getString("STATE");
              }else
              {
                  Txfiled_MOnum_AddMO.setDisable(true);
                  Btn_Delete_AddMo.setDisable(true);
                  Btn_Cancle_AddMo.setDisable(false);
                  Btn_Save_AddMo.setDisable(false);
                  Btn_Print_AddMo.setDisable(false);
                   Txfiled_CusName_AddMO.setDisable(false);
                  
                  

                                    
                  
                 
                  
              
            
            
            
              }
            
            
            
             
            //String sringFormatDate = .sqlDateToString(rs.getDate("STARTING_DATE"));
            // Date_EndMO_AddMO.;
            //Selct_MoStatus_AddMO.(rs.getString("PROBLEM_DESC"));
            //Txfiled_ProplemDisc_AddMO.setText(rs.getString("PROBLEM_DESC"));
            //Txfiled_ProplemDisc_AddMO.setText(rs.getString("PROBLEM_DESC"));
            //Txfiled_ProplemDisc_AddMO.setText(rs.getString("PROBLEM_DESC"));
            
         
            //System.out.println(rs.getString(""));
            //System.out.println(rs.getString(""));
            //System.out.println(rs.getString(""));

                               
     

      java.sql.Statement statement1 = connection.createStatement();
       //statement1.executeQuery(sql);

    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
          //ConnectionClass connectionClass = new ConnectionClass();
    // we call conneClass  that we make it up
    Connection connection = connectionClass.getConnection();
        System.out.println("Byee");    }

  



}