package application;

/** 

//*********************************************************************** 

'Project: Assignment 2 

'Programmer: Sohail Samar 

'Company Info:  soharisumar@gmail.com

'Date: 08 10 2004

'Description:  Problem Number 2.   

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
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckBox;


public class SS_P02 extends Application {

    @Override
    public void start(Stage applicationStage) {
        Scene scene = null;
        GridPane gridPane = null;

        gridPane = new GridPane(); 

        scene = new Scene(gridPane); 

        // Choose the registration type
        Label registrationLabel = new Label("Choose a conference type: ");
        ToggleGroup toggleGroup = new ToggleGroup();
        RadioButton genReg = new RadioButton("General $845");
        RadioButton studReg = new RadioButton("Student $495");
        genReg.setSelected(true);
        genReg.setToggleGroup(toggleGroup);
        studReg.setToggleGroup(toggleGroup);

        // Keynote
        CheckBox keyNoteBox = new CheckBox("Interested in opening night dinner? $30");
        
        // Workshop
        Label workshopLabel = new Label("Workshops:");
        CheckBox w1 = new CheckBox("Introduction to E-commerce $295");
        CheckBox w2 = new CheckBox("The Future of the Web $295");
        CheckBox w3 = new CheckBox("Advanced Java Programming  $395");
        CheckBox w4 = new CheckBox("Network Security  $395");


        
        // Finish
        Label totalLabel = new Label("Total:");
        TextField totalField;
        totalField = new TextField();
        totalField.setPrefColumnCount(15);
        totalField.setEditable(false);
        Button calcButton = new Button("Calculate");

        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Reg type
        gridPane.add(registrationLabel, 0, 0);
        gridPane.add(genReg, 0, 1);
        gridPane.add(studReg, 0, 2);
        //Keynote
        gridPane.add(keyNoteBox, 0, 4);
        //Workshop
        gridPane.add(workshopLabel, 0, 6);
        gridPane.add(w1, 0, 7);
        gridPane.add(w2, 0, 8);
        gridPane.add(w3, 0, 9);
        gridPane.add(w4, 0, 10);
        //Total
        gridPane.add(totalLabel, 0, 12);
        gridPane.add(totalField, 1, 13);
        gridPane.add(calcButton, 0, 14); 
	      
	      calcButton.setOnAction(new EventHandler<ActionEvent>() {
	         @Override
	         public void handle(ActionEvent event) {
	        	int total = 0;
	        	if (genReg.isSelected()) {
	        		total += 845;
	        	} else if (studReg.isSelected()) {
	        		total += 495;
	        	}
	        	
	        	if (keyNoteBox.isSelected()) {
	        		total += 30;
	        	}
	        	
	        	if (w1.isSelected()) {
	        		total += 295;
	        	}
	        	if (w2.isSelected()) {
	        		total += 295;
	        	}
	        	if (w3.isSelected()) {
	        		total += 395;
	        	}
	        	if (w4.isSelected()) {
	        		total += 395;
	        	}

	            totalField.setText("$" + total);
	         } 
	      });

	      applicationStage.setScene(scene);
	      applicationStage.setTitle("Conference fees");
	      applicationStage.show();
   }
   
   public static void main(String [] args) {
      launch(args); // Launch application
   }
}