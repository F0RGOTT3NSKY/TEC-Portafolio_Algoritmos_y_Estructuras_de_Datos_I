package Test;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Separator;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application{
	

    public static void main(String[] args) {    	
        launch(args);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream inputAND = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/ANDimage.png");
        Image imageAND = new Image(inputAND);       
        ImageView imageViewAND = new ImageView(imageAND);
        
        FileInputStream inputOR = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/ORimage.png");
        Image imageOR = new Image(inputOR);       
        ImageView imageViewOR = new ImageView(imageOR);
        
        FileInputStream inputNAND = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/NANDimage.png");
        Image imageNAND = new Image(inputNAND);       
        ImageView imageViewNAND = new ImageView(imageNAND);
        
        FileInputStream inputNOR = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/NORimage.png");
        Image imageNOR = new Image(inputNOR);       
        ImageView imageViewNOR = new ImageView(imageNOR);
        
        FileInputStream inputNOT = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/NOTimage.png");
        Image imageNOT = new Image(inputNOT);       
        ImageView imageViewNOT = new ImageView(imageNOT);
        
        FileInputStream inputEXOR = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/EXORimage.png");
        Image imageEXOR = new Image(inputEXOR);       
        ImageView imageViewEXOR = new ImageView(imageEXOR);
        
        FileInputStream inputEXNOR = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/EXNORimage.png");
        Image imageEXNOR = new Image(inputEXNOR);       
        ImageView imageViewEXNOR = new ImageView(imageEXNOR);
        
        FileInputStream InputSave = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/Saveimage.png");
        Image imageSave = new Image(InputSave);
        ImageView imageViewSave = new ImageView(imageSave);
        
        FileInputStream InputAdd = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/ADDimage.png");
        Image imageAdd = new Image(InputAdd);
        ImageView imageViewAdd = new ImageView(imageAdd);
        
        FileInputStream InputEXITSAVE = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/EXITSAVEimage.png");
        Image imageEXITSAVE = new Image(InputEXITSAVE);
        ImageView imageViewEXITSAVE = new ImageView(imageEXITSAVE);
        
        FileInputStream InputRUN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/RUNimage.png");
        Image imageRUN = new Image(InputRUN);
        ImageView imageViewRUN = new ImageView(imageRUN);
        
        FileInputStream InputDELETE = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/DELETEimage.png");
        Image imageDELETE = new Image(InputDELETE);
        ImageView imageViewDELETE = new ImageView(imageDELETE);
        
        FileInputStream InputCLEAR = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/CLEARimage.png");
        Image imageCLEAR = new Image(InputCLEAR);
        ImageView imageViewCLEAR = new ImageView(imageCLEAR);
        
        FileInputStream InputHELP = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/HELPimage.png");
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
        
        
        
        
        Button ANDButton = new Button("AND", imageViewAND);
        Button ORButton = new Button("OR", imageViewOR);
        Button NANDButton = new Button("NAND", imageViewNAND);
        Button NORButton = new Button("NOR", imageViewNOR);
        Button NOTButton = new Button("NOT", imageViewNOT);
        Button XORButton = new Button("XOR", imageViewEXOR);
        Button XNORButton = new Button("XNOR", imageViewEXNOR);
        
        
        ANDButton.setMinWidth(150);
        ORButton.setMinWidth(150);
        NANDButton.setMinWidth(150);
        NORButton.setMinWidth(150);
        NOTButton.setMinWidth(150);
        XORButton.setMinWidth(150);
        XNORButton.setMinWidth(150);
        ANDButton.setMaxWidth(150);
        ORButton.setMaxWidth(150);
        NANDButton.setMaxWidth(150);
        NORButton.setMaxWidth(150);
        NOTButton.setMaxWidth(150);
        XORButton.setMaxWidth(150);
        XNORButton.setMaxWidth(150);
        
        ToolBar toolBar1 = new ToolBar();
        toolBar1.getItems().addAll(new Separator(),splitMenuButton,button,button2,button3,button4,new Separator(),chkSound,chkMusic,new Separator());          
        ToolBar toolBar2 = new ToolBar();
        toolBar2.setOrientation(Orientation.VERTICAL);
        toolBar2.getItems().addAll(new Separator(),ANDButton,ORButton,NANDButton,NORButton,NOTButton,XORButton,XNORButton,new Separator());
        BorderPane pane = new BorderPane();
        pane.setTop(toolBar1);
        pane.setLeft(toolBar2);
        Scene scene = new Scene(pane, 1500, 900);
        String FileName = "Nuevo Archivo";
        primaryStage.setScene(scene);
        primaryStage.setTitle("Compuertas Logicas"+" - "+FileName);
        //primaryStage.getIcons().add(new Image("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/ICONimage.png")); 
        primaryStage.show();
	}
}
