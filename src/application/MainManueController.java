package application;

import java.io.IOException;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

public class MainManueController {
	
	private Stage stage;
	private Parent root;
	private Scene scene;

    @FXML
    void ButtonAGEclick(ActionEvent event) throws IOException
    {
    	
    }

    @FXML
    void ButtonBMIclick(ActionEvent event) throws IOException
    {

    }

    @FXML
    void ButtonCurrencyClick(ActionEvent event) throws IOException
    {

    }

    @FXML
    void ButtonDiscountClick(ActionEvent event) throws IOException
    {

    }

    @FXML
    void ButtonInvestmentClick(ActionEvent event) throws IOException
    {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Investment_calculator.fxml"));
    	root = loader.load();
    	
    	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();
    	
    }

    @FXML
    void ButtonSimpleCalculatorClick(ActionEvent event) throws IOException 
    {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("CalculatorAssign.fxml"));
    	root = loader.load();
    	
    	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();
    }

}
