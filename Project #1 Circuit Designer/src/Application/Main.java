package Application;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *Clase de la ventana principal 
 */
public class Main extends Application{
	/**
	 * 
	 */
    public static void main(String[] args) {    	
        launch(args);
    }

    /**
	 * 
	 */
	public void start(Stage primaryStage) throws Exception {
		
		Buttons MenuButtonFile = new Buttons();
		Buttons MenuButtonHelp = new Buttons();
        Buttons boton = new Buttons();
        Buttons button2 = new Buttons();
        Buttons button3 = new Buttons();
        Buttons MenuItem1 = new Buttons();
        Buttons MenuItem2 = new Buttons();
        Buttons MenuItem3 = new Buttons();
        Buttons MenuItem4 = new Buttons();
        Buttons MenuItem5 = new Buttons();
        Buttons ANDButton = new Buttons();
        Buttons ORButton = new Buttons();
        Buttons NOTButton = new Buttons();
        Buttons NANDButton = new Buttons();
        Buttons NORButton = new Buttons();
        Buttons XORButton = new Buttons();
        Buttons XNORButton = new Buttons();
        
        Images ImageABOUT = new Images();
        ImageABOUT.setImageView(ImageABOUT,ImageType.About);
        Images ImageADD = new Images();
        ImageADD.setImageView(ImageADD,ImageType.Add);
        Images ImageAND = new Images();
        ImageAND.setImageView(ImageAND,ImageType.And);
        Images ImageCLEAR = new Images();
        ImageCLEAR.setImageView(ImageCLEAR,ImageType.Clear);
        Images ImageDELETE = new Images();
        ImageDELETE.setImageView(ImageDELETE,ImageType.Delete);
        Images ImageEXITSAVE = new Images();
        ImageEXITSAVE.setImageView(ImageEXITSAVE,ImageType.ExitSave);
        Images ImageEXNOR = new Images();
        ImageEXNOR.setImageView(ImageEXNOR,ImageType.Exnor);
        Images ImageEXOR = new Images();
        ImageEXOR.setImageView(ImageEXOR,ImageType.Exor);
        Images ImageFILE = new Images();
        ImageFILE.setImageView(ImageFILE,ImageType.File);
        Images ImageHELP = new Images();
        ImageHELP.setImageView(ImageHELP,ImageType.Help);
        Images ImageICON = new Images();
        ImageICON.setImage(ImageICON,ImageType.Icon);
        Images ImageNAND = new Images();
        ImageNAND.setImageView(ImageNAND,ImageType.Nand);
        Images ImageNOR = new Images();
        ImageNOR.setImageView(ImageNOR,ImageType.Nor);
        Images ImageNOT = new Images();
        ImageNOT.setImageView(ImageNOT,ImageType.Not);
        Images ImageOR = new Images();
        ImageOR.setImageView(ImageOR,ImageType.Or);
        Images ImageRUN = new Images();
        ImageRUN.setImageView(ImageRUN,ImageType.Run);
        Images ImageSAVE = new Images();
        ImageSAVE.setImageView(ImageSAVE,ImageType.Save);
        Images ImageWIKI = new Images();
        ImageWIKI.setImageView(ImageWIKI,ImageType.Wiki);
        
        
        MenuButtonFile.setMenuButton(MenuButtonFile,MenuButtonType.File,ImageFILE.getImageView(),
        							 MenuItem1,MenuItemType.choice1,ImageADD.getImageView(),
        							 MenuItem2,MenuItemType.choice2,ImageSAVE.getImageView(),
        							 MenuItem3,MenuItemType.choice3,ImageEXITSAVE.getImageView());
        boton.setButton(boton,ButtonType.Run,ImageRUN.getImageView());
        button2.setButton(button2,ButtonType.Delete,ImageDELETE.getImageView());
        button3.setButton(button3,ButtonType.Clear,ImageCLEAR.getImageView());
        MenuButtonHelp.setMenuButton(MenuButtonHelp,MenuButtonType.Help,ImageHELP.getImageView(),
        							 MenuItem4,MenuItemType.about,ImageABOUT.getImageView(),
        							 MenuItem5,MenuItemType.wiki,ImageWIKI.getImageView());
        ANDButton.setButton(ANDButton, ButtonType.And,ImageAND.getImageView());
        ORButton.setButton(ORButton, ButtonType.Or,ImageOR.getImageView());
        NOTButton.setButton(NOTButton, ButtonType.Not,ImageNOT.getImageView());
        NANDButton.setButton(NANDButton, ButtonType.Nand,ImageNAND.getImageView());
        NORButton.setButton(NORButton, ButtonType.Nor,ImageNOR.getImageView());
        XORButton.setButton(XORButton, ButtonType.Exor,ImageEXOR.getImageView());
        XNORButton.setButton(XNORButton, ButtonType.Exnor,ImageEXNOR.getImageView());
        
        
        

        ToolBar toolBar1 = new ToolBar();
        toolBar1.getItems().addAll(MenuButtonFile.getMenuButton(),new Separator(),boton.getButton(),button2.getButton(),button3.getButton(),new Separator(),MenuButtonHelp.getMenuButton());        
        ToolBar toolBar2 = new ToolBar();
        toolBar2.setOrientation(Orientation.VERTICAL);
        toolBar2.getItems().addAll(new Separator(),ANDButton.getButton(),ORButton.getButton(),NANDButton.getButton(),NORButton.getButton(),NOTButton.getButton(),XORButton.getButton(),XNORButton.getButton(),new Separator());
        BorderPane pane = new BorderPane();
        pane.setTop(toolBar1);
        pane.setLeft(toolBar2);
        
        
        Scene scene = new Scene(pane, 1000, 600);
        String FileName = "Nuevo Archivo";
        primaryStage.setScene(scene);
        primaryStage.setTitle("Compuertas Logicas"+" - "+FileName);
        primaryStage.getIcons().add(ImageICON.getImage());
        primaryStage.show();
	}
	
	
}
