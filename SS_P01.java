package application;

/** 

//*********************************************************************** 

'Project: Assignment 2 

'Programmer: Sohail Samar 

'Company Info:  soharisumar@gmail.com

'Date: 08 10 2004

'Description:  Problem Number 1.   

'     

'   LINE 1 AT LEAST 3 LINES OF PROGRAM DESCRIPTION 

'   LINE 2 AT LEAST 3 LINES OF PROGRAM DESCRIPTION 

'   LINE 3 AT LEAST 3 LINES OF PROGRAM DESCRIPTION 

' 

'	-------------------------------------------------------------------------- 

'   							HONOR CODE:  

'	I pledge that this program represents my own program code, I have received  

'	help from no one and I have given help to no one. 

'	 

'								OR 

' 

'	I received help from NAME OR NO ONE in designing and debugging my program. 

'	I given help to NAME OR NO ONE in designing and debugging my program. 

'----------------------------------------------------------------------------- 

' 

'  LINE LENGTH - AVOID LINES LONGER THAN 80 CHARACTERS 

'  SCALE BELOW IS TO CALIBRATE SCREENSHOTS 

'  DO NOT HAVE YOUR CODE OR SCREENSHOT EXTEND BEYOND THE SCALE 

0........1.........2.........3.........4.........5.........6.........7.........8 

12345678901234567890123456789012345678901234567890123456789012345678901234567890 

*/ 


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class SS_P01 extends Application {
	private Label foodChargeLabel;      // Label for food charge input
    private Label tipLabel;             // Label to display tip amount
    private Label taxLabel;             // Label to display sales tax
    private Label totalLabel;           // Label for total amount
    private TextField foodChargeField;   // Field for food charge input
    private TextField tipField;          // Field to display tip amount
    private TextField taxField;          // Field to display sales tax
    private TextField totalField;        // Field to display total amount
    private Button calcButton;     // Button to trigger calculations

    @Override
    public void start(Stage applicationStage) {
        // Project setup
    	Scene scene = null;
        GridPane gridPane = null;

        gridPane = new GridPane();

        scene = new Scene(gridPane); 

        // Set labels for food charge, tip, tax, and total
        foodChargeLabel = new Label("Food Charge:");
        tipLabel = new Label("Tip (18%):");
        taxLabel = new Label("Sales Tax (7%):");
        totalLabel = new Label("Total:");

        // Set text fields for user input and calculated values
        foodChargeField = new TextField();
        foodChargeField.setPrefColumnCount(15);
        foodChargeField.setEditable(true);
        foodChargeField.setText("0");

        tipField = new TextField();
        tipField.setPrefColumnCount(15);
        tipField.setEditable(false);

        taxField = new TextField();
        taxField.setPrefColumnCount(15);
        taxField.setEditable(false);

        totalField = new TextField();
        totalField.setPrefColumnCount(15);
        totalField.setEditable(false);

        calcButton = new Button("Calculate");

        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setHgap(10); 
        gridPane.setVgap(10); 

        gridPane.add(foodChargeLabel, 0, 0);
        gridPane.add(foodChargeField, 1, 0);
        gridPane.add(tipLabel, 0, 1);
        gridPane.add(tipField, 1, 1);
        gridPane.add(taxLabel, 0, 2);
        gridPane.add(taxField, 1, 2);
        gridPane.add(totalLabel, 0, 3);
        gridPane.add(totalField, 1, 3);
        gridPane.add(calcButton, 0, 4);
	      
	      calcButton.setOnAction(new EventHandler<ActionEvent>() {
	         @Override
	         public void handle(ActionEvent event) {
	            String userInput; 
	            double foodCharge;
	            double tips;
	            double tax;
	            double total;

	            userInput = foodChargeField.getText();            
	            foodCharge = Double.parseDouble(userInput);
	            tips = foodCharge * 0.18;
	            tax = foodCharge * 0.07;
	            total = foodCharge + tips + tax;

	            tipField.setText("$" + String.format("%.2f", tips));
	            taxField.setText("$" + String.format("%.2f", tax));
	            totalField.setText("$" + String.format("%.2f", total));
	         } 
	      });

	      applicationStage.setScene(scene);    // Set window's scene  
	      applicationStage.setTitle("FoodCharge"); // Set window's title
	      applicationStage.show();             // Display window
   }
   
   public static void main(String [] args) {
      launch(args); // Launch application
   }
}