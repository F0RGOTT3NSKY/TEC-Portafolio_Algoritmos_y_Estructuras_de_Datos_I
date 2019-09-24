package Application;



import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *Clase de la ventana principal de la applicacion
 */
public class Main extends Application{
	public static final Group Group = new Group();
	public static final Pane Pane = new Pane(Group);
	/**
	 * Metodo que ejecuta argumentos
	 */
    public static void main(String[] args) {    	
        launch(args);
    }

    /**
	 * Metodo para iniciar la ventana principal
	 * @param primaryStage
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
        Images ImageEXITSAVE = new Images();
        ImageEXITSAVE.setImageView(ImageEXITSAVE,ImageType.ExitSave);       
        Images ImageFILE = new Images();
        ImageFILE.setImageView(ImageFILE,ImageType.File);
        Images ImageHELP = new Images();
        ImageHELP.setImageView(ImageHELP,ImageType.Help);
        Images ImageSAVE = new Images();
        ImageSAVE.setImageView(ImageSAVE,ImageType.Save);
        Images ImageWIKI = new Images();
        ImageWIKI.setImageView(ImageWIKI,ImageType.Wiki);       
        Images ImageICON = new Images();
        ImageICON.setImage(ImageICON,ImageType.Icon);
        
        
        MenuButtonFile.setMenuButton(MenuButtonFile,MenuButtonType.File,ImageFILE.getImageView(),
        							 MenuItem1,MenuItemType.choice1,ImageADD.getImageView(),
        							 MenuItem2,MenuItemType.choice2,ImageSAVE.getImageView(),
        							 MenuItem3,MenuItemType.choice3,ImageEXITSAVE.getImageView());
        boton.setButton(boton,ButtonType.Run);
        button2.setButton(button2,ButtonType.Delete);
        button3.setButton(button3,ButtonType.Clear);
        MenuButtonHelp.setMenuButton(MenuButtonHelp,MenuButtonType.Help,ImageHELP.getImageView(),
        							 MenuItem4,MenuItemType.about,ImageABOUT.getImageView(),
        							 MenuItem5,MenuItemType.wiki,ImageWIKI.getImageView());
        ANDButton.setButton(ANDButton, ButtonType.And);
        ORButton.setButton(ORButton, ButtonType.Or);
        NOTButton.setButton(NOTButton, ButtonType.Not);
        NANDButton.setButton(NANDButton, ButtonType.Nand);
        NORButton.setButton(NORButton, ButtonType.Nor);
        XORButton.setButton(XORButton, ButtonType.Exor);
        XNORButton.setButton(XNORButton, ButtonType.Exnor);
        
        
        

        ToolBar toolBar1 = new ToolBar();
        toolBar1.getItems().addAll(MenuButtonFile.getMenuButton(),new Separator(),boton.getButton(),button2.getButton(),button3.getButton(),new Separator(),MenuButtonHelp.getMenuButton());        
        ToolBar toolBar2 = new ToolBar();
        toolBar2.setOrientation(Orientation.VERTICAL);
        toolBar2.getItems().addAll(new Separator(),ANDButton.getButton(),ORButton.getButton(),NANDButton.getButton(),NORButton.getButton(),NOTButton.getButton(),XORButton.getButton(),XNORButton.getButton(),new Separator());
        
        Pane.setOnDragOver(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                event.acceptTransferModes(TransferMode.COPY_OR_MOVE); }
        });
        Pane.setOnDragDropped(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
            	Images Image = new Images();
                Events.OnDragDropped(event, Image.getImageView());
            }
        });
        BorderPane pane = new BorderPane();
        pane.setTop(toolBar1);
        pane.setLeft(toolBar2);
        pane.setCenter(Pane);
        
        
        Scene scene = new Scene(pane, 1000, 600);
        String FileName = "Nuevo Archivo";
        primaryStage.setScene(scene);
        primaryStage.setTitle("Compuertas Logicas"+" - "+FileName);
        primaryStage.getIcons().add(ImageICON.getImage());
        primaryStage.show();
	}
	
	
}
