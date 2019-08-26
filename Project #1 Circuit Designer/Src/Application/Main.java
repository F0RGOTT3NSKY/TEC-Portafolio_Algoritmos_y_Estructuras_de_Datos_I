package Application;


import java.io.FileInputStream;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application{
	

    public static void main(String[] args) {    	
        launch(args);
    }


	public void start(Stage primaryStage) throws Exception {
		
		FileInputStream inputAND = new FileInputStream("resources/images/ANDimage.png");
        Image imageAND = new Image(inputAND);       
        ImageView imageViewAND = new ImageView(imageAND);
        
        FileInputStream inputOR = new FileInputStream("resources/images/ORimage.png");
        Image imageOR = new Image(inputOR);       
        ImageView imageViewOR = new ImageView(imageOR);
        
        FileInputStream inputNAND = new FileInputStream("resources/images/NANDimage.png");
        Image imageNAND = new Image(inputNAND);       
        ImageView imageViewNAND = new ImageView(imageNAND);
        
        FileInputStream inputNOT = new FileInputStream("resources/images/NOTimage.png");
        Image imageNOT = new Image(inputNOT);       
        ImageView imageViewNOT = new ImageView(imageNOT);
        
        FileInputStream InputSave = new FileInputStream("resources/images/Saveimage.png");
        Image imageSave = new Image(InputSave);
        ImageView imageViewSave = new ImageView(imageSave);
        
        FileInputStream InputAdd = new FileInputStream("resources/images/ADDimage.png");
        Image imageAdd = new Image(InputAdd);
        ImageView imageViewAdd = new ImageView(imageAdd);
        
        FileInputStream InputEXITSAVE = new FileInputStream("resources/images/EXITSAVEimage.png");
        Image imageEXITSAVE = new Image(InputEXITSAVE);
        ImageView imageViewEXITSAVE = new ImageView(imageEXITSAVE);
        
        FileInputStream InputRUN = new FileInputStream("resources/images/RUNimage.png");
        Image imageRUN = new Image(InputRUN);
        ImageView imageViewRUN = new ImageView(imageRUN);
        
        FileInputStream InputDELETE = new FileInputStream("resources/images/DELETEimage.png");
        Image imageDELETE = new Image(InputDELETE);
        ImageView imageViewDELETE = new ImageView(imageDELETE);
        
        FileInputStream InputCLEAR = new FileInputStream("resources/images/CLEARimage.png");
        Image imageCLEAR = new Image(InputCLEAR);
        ImageView imageViewCLEAR = new ImageView(imageCLEAR);
        
        FileInputStream InputHELP = new FileInputStream("resources/images/HELPimage.png");
        Image imageHELP = new Image(InputHELP);
        ImageView imageViewHELP = new ImageView(imageHELP);
        
		SplitMenuButton splitMenuButton = new SplitMenuButton();
		splitMenuButton.setText("File");
		MenuItem choice1 = new MenuItem("Open Project", imageViewAdd);
		MenuItem choice2 = new MenuItem("Save Project", imageViewSave);
		MenuItem choice3 = new MenuItem("Save and Exit", imageViewEXITSAVE);
		splitMenuButton.getItems().addAll(choice1, choice2, choice3);
		Button button = new Button("Run", imageViewRUN);
		Button button2 = new Button("Delete", imageViewDELETE );
		Button button3 = new Button("Clear", imageViewCLEAR);
		Button button4 = new Button("Help", imageViewHELP);
        CheckBox chkSound = new CheckBox("Sound");
        CheckBox chkMusic = new CheckBox("Music");
        
        
        
        Button ANDButton = new Button(" AND", imageViewAND);
        Button ORButton = new Button("  OR  ", imageViewOR);
        Button NANDButton = new Button("NAND", imageViewNAND);
        Button NORButton = new Button("NOR");
        Button NOTButton = new Button("NOT", imageViewNOT);
        Button XORButton = new Button("XOR");
        Button XNORButton = new Button("XNOR");
        
 
        ToolBar toolBar1 = new ToolBar();
        toolBar1.getItems().addAll(new Separator(),splitMenuButton,button,button2,button3,button4,new Separator(),chkSound,chkMusic,new Separator());          
        ToolBar toolBar2 = new ToolBar();
        toolBar2.setOrientation(Orientation.VERTICAL);
        toolBar2.getItems().addAll(new Separator(),ANDButton,ORButton,NANDButton,NORButton,NOTButton,XORButton,XNORButton,new Separator());
        BorderPane pane = new BorderPane();
        pane.setTop(toolBar1);
        pane.setLeft(toolBar2);
        Scene scene = new Scene(pane, 1200, 800);
        String FileName = "Nuevo Archivo";
        primaryStage.setScene(scene);
        primaryStage.setTitle("Compuertas Logicas"+" - "+FileName);
        primaryStage.getIcons().add(new Image("resources/images/ICONimage.png")); 
        primaryStage.show();
	}
	
	
}
