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
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventType;
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
    private ComboBox<String> Selct_Techichan_AddMO;
    @FXML
    private ComboBox<String> Selct_MoStatus_AddMO;
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
       Selct_MoStatus_AddMO.getSelectionModel().clearSelection();
       Date_Warranty_AddMO.getEditor().clear();
       Date_StartMo_AddMO.getEditor().clear();
       Date_EndMO_AddMO.getEditor().clear();
       
       
       
       
       
       
       
       
       
       
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
                 
               //  String sql = "select * from maintenance_operation WHERE MO_NBER = '" + Txfiled_MOnum_AddMO.getText()+ "'";
             
                Statement st = connection.createStatement();
                
                
                
               st.executeQuery("select * FROM  maintenance_operation WHERE MO_NBER= '" + Txfiled_MOnum_AddMO.getText()+"'");
               //String dq1=("select  EMP_NAME FROM  maintenance_operation INNER JOIN EMPLOYEE ON maintenance_operation.EMPLOYEE_ID = EMPLOYEE.EMPLOYEE_ID= '" +  Selct_Techichan_AddMO.getSelectionModel()+ "'"); 
                
                 //Statement ps1=connection.prepareStatement(dq1); 
               
                 //ResultSet rs1=ps1.executeQuery(dq1); 
               //st.executeQuery("SELECT t1.*, t2.* FROM t1 JOIN t2 WHERE t1.i1 = t2.i2  '");
               //st.executeQuery("select  EMP_NAME FROM  EMPLOYEE WHERE EMPLOYEE_ID= '" +  Txfiled_MOnum_AddMO.getText()+ "'");
                // st.executeQuery("select * CUS_NAME FROM  CUSTOMER WHERE CUS_MOBILE_NBER= '" + Txfiled_CusMnum_AddMO.getText()+ "'");
              ResultSet rs = st.getResultSet();
              //st = connection.prepareCall();
              
              if(rs.first()){
                  String EDate = rs.getString("ENDING_DATE");
                  String WDate = rs.getString("WARRANTY");
                  String SDate = rs.getString("STARTING_DATE");
                  
                  
                  
            
          Txfiled_MOnum_AddMO.setDisable(true);
            Txfiled_ProplemDisc_AddMO.setText(rs.getString("PROBLEM_DESC"));
            Txfiled_CusMnum_AddMO.setText(rs.getString("CUS_MOBILE_NBER"));
            Txfiled_SPCost_AddMO.setText(rs.getString("SP_COST"));
            Txfiled_MOCost_AddMO.setText(rs.getString("MO_COST"));
            Txfiled_DevSerialN_AddMO.setText(rs.getString("DEVICE_SN"));
            Txfiled_DevDiscription_AddMO.setText(rs.getString("DEVICE_DESC"));
           // Date_Warranty_AddMO.getEditor().setText(rs.getString("WARRANTY"));
           // Date_StartMo_AddMO.getEditor().setText(rs.getString("STARTING_DATE"));
             Date_EndMO_AddMO.getEditor().setText(EDate);
               Date_Warranty_AddMO.getEditor().setText(WDate);
                 Date_StartMo_AddMO.getEditor().setText(SDate);
             
          //List<String> State = new ArrayList<>();
          //State.add(rs.getString("STATE"));
          //Selct_MoStatus_AddMO.setItems(FXCollections.observableArrayList(State));
          Selct_MoStatus_AddMO.getSelectionModel().select(rs.getString("STATE"));
         //Selct_Techichan_AddMO.getSelectionModel().select(rs.getString("EMPLOYEE_ID"));
          Selct_Techichan_AddMO.setItems(ListOfTechichan);
          
          
          //List<String> Tec = new ArrayList<>();
          //Tec.add(rs.getString("EMPLOYEE_ID"));
          //Selct_Techichan_AddMO.getSelectionModel().select(rs.getString("EMPLOYEE_ID"));
          
             Btn_Delete_AddMo.setDisable(false);
             Btn_Save_AddMo.setDisable(false);
             Btn_Print_AddMo.setDisable(false);
             Btn_Delete_AddMo.setDisable(false);
             Txfiled_CusName_AddMO.setDisable(true);
             Btn_Cancle_AddMo.setDisable(false);
             
      
              }else
              {
                  
                  Txfiled_MOnum_AddMO.setDisable(true);
                  Txfiled_MOnum_AddMO.clear();
                  Btn_Delete_AddMo.setDisable(true);
                  Btn_Cancle_AddMo.setDisable(false);
                  Btn_Save_AddMo.setDisable(false);
                  Btn_Print_AddMo.setDisable(false);
                   Txfiled_CusName_AddMO.setDisable(false);
                 
            
              }
            
               
           
           
              
              
    
     

      java.sql.Statement statement1 = connection.createStatement();
       //statement1.executeQuery(dq1);

    
    
       //statement1.executeQuery(sql);
              
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadTech();
        
          //ConnectionClass connectionClass = new ConnectionClass();
    // we call conneClass  that we make it up
    Connection connection = connectionClass.getConnection();
        System.out.println("Byee");    }
     public void loadTech() {
        String query = "SELECT EMP_NAME FROM employee";
        ResultSet rs = connectionClass.execQuery(query);
        try {
            while (rs.next()) {

                ListOfTechichan.add(rs.getString("EMP_NAME"));

            }
            rs.close();

        } catch (SQLException ex) {
            ex.printStackTrace();

        }

    }

  



}