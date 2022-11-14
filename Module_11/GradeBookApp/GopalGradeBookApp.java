/**
 *      Richard Lomax (2022). CIS 505: Intermediate Java Programming. Bellevue University.
 *      Modified by Sindhu Gopal Student 2022
*/ 

/**
*       OpenEdX is an organization dedicated to open-source education and 
*       providing institutions with a variety of Learning Management tools. 
*       Recently OpenEdX was contracted by learn.edu to build a tool for tracking student performance.
*       The proposed solution should track the following fields:
*       First name.
*       Last name.
*       Course name.
*       Grade (letters A-F) 
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//Use JavaFX to build a user interface for the EDX Project Gradebookapp
public class GopalGradeBookApp extends Application {

	//Define String variable File name and Delimmiter to store teh grades as CSV file 
	private static final String FILE_NAME = "C:\\Sindhu\\grades.csv";
	private static final String DELIMITER = "\\,";

    //Private variable for label- First Name 
	private Label lblFirstName = new Label("First Name");

    //Private variable for Text Field - First Name 
	private TextField textFieldFirstName = new TextField();

    //Private variable for label- Last Name 
	private Label lblLastName = new Label("Last Name");

    //Private variable for Text Field - Last Name
	private TextField textFieldLastName = new TextField();

    //Private variable for label- Course
	private Label lblCourse = new Label("Course");

    //Private variable for Text Field - Course
	private TextField textFieldCourse = new TextField();

    //Private variable for label- Grade
    private Label lblGrade = new Label("Grade");
	
    //Private variable Combo Box for Grade Drop Down Selection 
    private ComboBox<String> gradeComboBox = new ComboBox<String>();
	
    //Private variable Button - Save
    private Button btnSave = new Button("Save");
	
    //Private variable Button - Clear
    private Button btnClear = new Button("Clear");
	
    //Private variable Button - View
    private Button btnView = new Button("View");

	//For viewing the student grades 
	private TableView<Student> table = new TableView<>();
	
	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage primaryStage) throws Exception {

        //add a new GridPane object and set its alignment to Pos.CENTER, set its padding to 11.5, 12.5, 13.5, and 14.5
		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));

        //set the panes Hgap to 10.5
		gridPane.setHgap(10.5);

        //set the panes Vgap to 10.5.
		gridPane.setVgap(10.5);

		// Add to gridPane - First Name label and Text Field
		gridPane.add(lblFirstName, 0, 0);
		gridPane.add(textFieldFirstName, 1, 0);
		
        // Add to gridPane - Last Name label and Text Field
		gridPane.add(lblLastName, 0, 1);
		gridPane.add(textFieldLastName, 1, 1);
		
        // Add to gridPane - Course label and Text Field
		gridPane.add(lblCourse, 0, 2);
		gridPane.add(textFieldCourse, 1, 2);
		
		// Add to gridPane - Grade label and Drop Down 	
		gradeComboBox.getItems().addAll("A","B","C","D","E","F");
		gridPane.add(lblGrade, 0, 3);
		gridPane.add(gradeComboBox, 1, 3);

		// Add a HBox for Save, Clear and View Button 
		HBox actionBtnContainer = new HBox();
		actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
		actionBtnContainer.setSpacing(10);
		actionBtnContainer.getChildren().add(btnClear);
		actionBtnContainer.getChildren().add(btnSave);
		actionBtnContainer.getChildren().add(btnView);
		gridPane.add(actionBtnContainer, 1, 4);
		
        //Set Clear Action for Clear Button 
		btnClear.setOnAction(event -> {
			clearFormFields();
		});
		
		//Set Save Action for Save Button 
		btnSave.setOnAction(e -> {
			saveGradebook();
	      });
		
        //Set View Action for View Button 
		btnView.setOnAction(e -> {
			viewGradebook();
	      });
		
		
		//Set the primary stages title to “YourLastName Grade Book App.”
		Scene scene = new Scene(gridPane);
		primaryStage.setTitle("Gopal Grade Book App.");
		primaryStage.setScene(scene); 
		primaryStage.show();
	
	}
	
    // Function for Clear Button functionality 
	private void clearFormFields() {
		textFieldFirstName.clear();
		textFieldLastName.clear();
		textFieldCourse.clear();
		gradeComboBox.valueProperty().set("");
	}
	
     // Function for Save Button functionality ( Planned for next week )
	private void saveGradebook() {
		String firstName = textFieldFirstName.getText();
		String lastName = textFieldLastName.getText();
		String course = textFieldCourse.getText();
		String grade = gradeComboBox.getValue();
		List<String> list = new ArrayList<>();
		try (BufferedReader br = Files.newBufferedReader(Paths.get(FILE_NAME))) {
			list = br.lines().collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(FILE_NAME)))  {
			list.add(new Student(firstName, lastName, course, grade).toString());
			for (String line : list) {
				writer.write(line);
				writer.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
     // Function for View Button functionality ( Planned for next week )
	private void viewGradebook() {

		List<String> list = new ArrayList<>();
		List<Student> students = new ArrayList<>();
		try (BufferedReader br = Files.newBufferedReader(Paths.get(FILE_NAME))) {
			list = br.lines().collect(Collectors.toList());
			int counter = 1;
			for (String s : list) {
				if (counter == 1) {
					counter++;
					continue;
				}
				String[] s1 =  s.split(DELIMITER, -1);
				String firstName = s1[0];
				String lastName = s1[1];
				String course = s1[2];
				String grade = s1[3];
				students.add(new Student(firstName, lastName, course, grade));
			}
		} catch (IOException e) {
			e.printStackTrace();

	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

}
