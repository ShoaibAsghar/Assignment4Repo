package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SimpleCalculatorController 
{
    
    @FXML
    private Label myLabel1;

    @FXML
    private TextField myTextField;

    @FXML
    private Label mylabel2;
    String pre_var = "";
    String opr_var="";
    int total=0;
    int strtotal=0;
   
    @FXML
    void button1click(ActionEvent event) 
    {
    	pre_var += "1";
    	myTextField.setText(pre_var);

    }

    @FXML
    void button2click(ActionEvent event) 
    {
    	pre_var += "2";
    	myTextField.setText(pre_var);
    }

    @FXML
    void button3click(ActionEvent event) 
    {
    	pre_var += "3";
    	myTextField.setText(pre_var); 
    }

    @FXML
    void button4click(ActionEvent event) 
    {
    	pre_var += "4";
    	myTextField.setText(pre_var);
    }

    @FXML
    void button5click(ActionEvent event) 
    {
    	pre_var += "5";
    	myTextField.setText(pre_var);
    }

    @FXML
    void button6click(ActionEvent event) 
    {
    	pre_var += "6";
    	myTextField.setText(pre_var);
    }

    @FXML
    void button7click(ActionEvent event) 
    {
    	pre_var += "7";
    	myTextField.setText(pre_var);
    }

    @FXML
    void button8click(ActionEvent event) 
    {
    	pre_var += "8";
    	myTextField.setText(pre_var);
    }

    @FXML
    void button9click(ActionEvent event) 
    {
    	pre_var += "9";
    	myTextField.setText(pre_var); 
    }

    
    @FXML
    void buttonACclick(ActionEvent event) 
    {
    	pre_var = "";
    	myTextField.setText(pre_var); 	
     
    }

    @FXML
    void buttonDIVclick(ActionEvent event) 
    {
    	//total=Integer.parseInt(pre_var); 
    	pre_var += "/";
    	myTextField.setText(pre_var);	

    }

    @FXML
    void buttonDOTclick(ActionEvent event) 
    {
    	
    	pre_var += ".";
    	myTextField.setText(pre_var);

    }

    @FXML
    void buttonEquaLclick(ActionEvent event) 
    {
    	
    	
    	EvaluationEqual obj1=new EvaluationEqual();
    	int var1=obj1.evaluate(pre_var);
    	
    	pre_var  = String.valueOf(var1);
    	myTextField.setText(pre_var); 
    	
    }

    @FXML
    void buttonMINUSclick(ActionEvent event) 
    {
    	
    	pre_var += "-";
    	myTextField.setText(pre_var);

    }

    @FXML
    void buttonMODclick(ActionEvent event) 
    {
    	
    	pre_var += "%";
    	myTextField.setText(pre_var);

    }

    @FXML
    void buttonMULTIclick(ActionEvent event) 
    {
    	 
    	pre_var += "*";
    	myTextField.setText(pre_var);

    }

    @FXML
    void buttonPLUSclick(ActionEvent event) 
    {
    	
    	pre_var += "+";
    	myTextField.setText(pre_var);
    }

    @FXML
    void buttonREMOVEclick(ActionEvent event) 
    {
    	strtotal=pre_var.length()-1; 
    	String str2="";
    	
    	for(int i=0;i<strtotal;i++)
    	{
    	  	str2+=pre_var.charAt(i);
    		
    	}
    	   	
    	//String s=String.valueOf(i);//Now it will return "10"
    	
    	pre_var="";
    	pre_var=str2;
    	myTextField.setText(pre_var); 
    	
    }

    @FXML
    void buttonzeroclick(ActionEvent event) 
    {
    	pre_var += "0";
    	myTextField.setText(pre_var);
    }

    @FXML
    void submit(ActionEvent event) 
    {

    }

}
