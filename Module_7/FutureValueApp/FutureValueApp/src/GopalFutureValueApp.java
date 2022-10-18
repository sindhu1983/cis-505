/**
 *     Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/ 

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

//Use JavaFX to build a user interface for the FutureValueApp.
public class GopalFutureValueApp extends Application {
	
	// Private variable for label- Monthly Payment 
	private Label lblMonthlyPayment = new Label("Monthly Payment:");
	
	//Private variable Text Field for  Monthly Payment 
	private TextField textFieldMonthlyPayment = new TextField();

	//Private variable Label for  Interest Rate 
	private Label lblInterestRate = new Label("Interest Rate:");

	//Private variable Text Field for  Interest Rate 
	private TextField textFieldInterestRate = new TextField();

	//Private variable Label for  displaying the message for interest rate text field 
	private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");

	//Private variable Label for  displaying the number of year 
	private Label lblYear = new Label("Years:");

	//Private variable Combo Box for  drop down selection 
	private ComboBox<Integer> comboBox = new ComboBox<Integer>();

	//Private variable Button - Calculate 
	private Button btnCalculate = new Button("Calculate");

	//Private variable Button - Clear
	private Button btnClear = new Button("Clear");

	//Private variable Text Area 
	private TextArea textArea = new TextArea();
	
	
	//  Extend the JavaFX Application object and setup the @Override start method with a single argument for the Stage objec
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//add a new GridPane object and set its alignment to Pos.CENTER, set its padding to 11.5, 12.5, 13.5, and 14.5
		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));

		//set the panes Hgap to 5.5
		gridPane.setHgap(5.5);

		//set the panes Vgap to 5.5.
		gridPane.setVgap(5.5);
		
		// Add to gridPane - Monthly Payment label and Text Field
		gridPane.add(lblMonthlyPayment, 0, 0);
		gridPane.add(textFieldMonthlyPayment, 1, 0);
		
		// Add to gridPane - Interest Rate label and Text Field
		gridPane.add(lblInterestRate, 0, 1);
		gridPane.add(textFieldInterestRate, 1, 1);
		
		//Add to gridPane - Message for Interest Rate 
		lblInterestRateFormat.setTextFill(Color.RED);
		gridPane.add(lblInterestRateFormat,1,2);
		gridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);
		
		// Add to gridPane - Year label and Combo box 
		gridPane.add(lblYear, 0, 3);
		gridPane.add(comboBox, 1, 3);
		
		//Add the clear and calculate buttons to an HBox with a spacing of 10 and a padding of 15, 0, 15, and 30.
		HBox actionBtnContainer = new HBox();
		actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
		actionBtnContainer.setSpacing(10);
		actionBtnContainer.getChildren().add(btnClear);
		actionBtnContainer.getChildren().add(btnCalculate);
		gridPane.add(actionBtnContainer, 1, 4);
		
		//Add to gridPane - Text Area
		gridPane.add(textArea, 0, 5);
		
		//Set the primary stages title to “YourLastName Future Value App.”	
		Scene scene = new Scene(gridPane);
		primaryStage.setTitle("Gopal Future Value App.");
		primaryStage.setScene(scene); 
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
