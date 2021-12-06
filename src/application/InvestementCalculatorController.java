package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

public class InvestementCalculatorController 
{
	@FXML
    private ToggleGroup investment;
    private AnchorPane MYlabeltitle;  

    @FXML
    private TextField myTextFieldINTERST;

    @FXML
    private TextField myTextFieldinvestment;
    
    String pre_var = "";
    String opr_var="";
    int total=0;
    int strtotal=0;
    
    @FXML
    void button1click2(ActionEvent event) 
    {
    	pre_var += "1";
    	myTextFieldINTERST.setText(pre_var);
    }

    @FXML
    void button2click2(ActionEvent event) 
    {
    	pre_var += "2";
    	myTextFieldINTERST.setText(pre_var);
    }

    @FXML
    void button3click2(ActionEvent event) 
    {
    	pre_var += "3";
    	myTextFieldINTERST.setText(pre_var);
    }

    @FXML
    void button4click2(ActionEvent event) 
    {
    	pre_var += "4";
    	myTextFieldINTERST.setText(pre_var);
    }

    @FXML
    void button5click2(ActionEvent event) 
    {
    	pre_var += "5";
    	myTextFieldINTERST.setText(pre_var);
    }

    @FXML
    void button6click2(ActionEvent event) 
    {
    	pre_var += "6";
    	myTextFieldINTERST.setText(pre_var);
    }

    @FXML
    void button7click2(ActionEvent event) 
    {
    	pre_var += "7";
    	myTextFieldINTERST.setText(pre_var);
    }

    @FXML
    void button8click2(ActionEvent event) 
    {
    	pre_var += "8";
    	myTextFieldINTERST.setText(pre_var);
    }

    @FXML
    void button9click2(ActionEvent event) 
    {
    	pre_var += "9"; 
    	myTextFieldINTERST.setText(pre_var);
    }

    @FXML
    void buttonACclick2(ActionEvent event) 
    {
    	pre_var = "";
    	myTextFieldINTERST.setText(pre_var); 
    }

    @FXML
    void buttonDIVclick2(ActionEvent event) 
    {
    	pre_var += "/"; 
    	myTextFieldINTERST.setText(pre_var);
    }

    @FXML
    void buttonDOTclick2(ActionEvent event) 
    {
    	pre_var += "."; 
    	myTextFieldINTERST.setText(pre_var);
    }

    @FXML
    void buttonEQUALclick2(ActionEvent event) 
    {
    	EvaluationEqual obj2=new EvaluationEqual();
    	int var2=obj2.evaluate(pre_var);
    	
    	pre_var  = String.valueOf(var2);
    	myTextFieldINTERST.setText(pre_var); 
    	
    }

    @FXML
    void buttonMINUSclick2(ActionEvent event) 
    {
    	pre_var += "-"; 
    	myTextFieldINTERST.setText(pre_var);
    }

    @FXML
    void buttonMODclick2(ActionEvent event) 
    {
    	pre_var += "%"; 
    	myTextFieldINTERST.setText(pre_var);
    }

    @FXML
    void buttonMULTIclick2(ActionEvent event) 
    {
    	pre_var += "*"; 
    	myTextFieldINTERST.setText(pre_var);
    }

    @FXML
    void buttonPLUSclick2(ActionEvent event) 
    {
    	pre_var += "+"; 
    	myTextFieldINTERST.setText(pre_var);
    }

    @FXML
    void buttonREMOVclick2(ActionEvent event) 
    {
    	strtotal=pre_var.length()-1; 
    	String str2="";
    	
    	for(int i=0;i<strtotal;i++)
    	{
    	  	str2+=pre_var.charAt(i);
    		
    	}
    	   	
    	
    	
    	pre_var="";
    	pre_var=str2;
    	myTextFieldINTERST.setText(pre_var); 
    }

    @FXML
    void buttonZeroclick2(ActionEvent event) 
    {
    	pre_var += "0"; 
    	myTextFieldINTERST.setText(pre_var);
    }
	
	
}
