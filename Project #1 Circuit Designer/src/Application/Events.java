package Application;

import Application.Patron_Factory.LogicType;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToolBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Modality;
import javafx.stage.Stage;
/**
 * Clase usada para organizar los eventos 
 */
public class Events {
	private static Rectangle rectangle;
	private static double PositionSceneX,PositionSceneY;
    private static double PositionTranslateX,PositionTranslateY;
    static Patron_Factory Compuerta = new Patron_Factory();
    public static ToolBar Toolbar1 = new ToolBar();
    public static TableView tableView = new TableView();
    private static int indexPrev = 0;
    private static String values = new String();
    private static int combinations;
    /**
     * Metodo para cuando se detecta que un boton esta siendo arrastrado
     * @param e
     * @param ImageView
     * @param Name
     */
	public static final void DragDetected(MouseEvent e, ImageView ImageView, String Name){
        Dragboard db= ImageView.startDragAndDrop(TransferMode.ANY);
        ClipboardContent content = new ClipboardContent();
        Main.Pane.setOnDragDropped(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                Events.OnDragDropped(event, ImageView, Name);
            }
        });
        content.putString(Name);
        db.setContent(content);
        e.consume();
    }
	/**
	 * Evento para establecer la compuerta en el panel despues de ser movida
	 */
	private static EventHandler<MouseEvent> RectangleOnMouseDraggedEventHandler = new EventHandler<MouseEvent>() {
	    @Override
	    public void handle(MouseEvent t) {
	        double offsetX = t.getSceneX() - PositionSceneX;
	        double offsetY = t.getSceneY() - PositionSceneY;
	        double newTranslateX = PositionTranslateX + offsetX;
	        double newTranslateY = PositionTranslateY + offsetY;
	        ((Rectangle)(t.getSource())).setTranslateX(newTranslateX);
	        ((Rectangle)(t.getSource())).setTranslateY(newTranslateY);
	    }
	};
	/**
	 * Metodo para agregar las compuertas al panel 
	 * @param e
	 * @param ImageView
	 */
	public static void OnDragDropped(DragEvent e,ImageView ImageView, String Name) {
	       rectangle = new Rectangle(140,50);
	       rectangle.setFill(new ImagePattern(ImageView.getImage()));
	       rectangle.setCursor(Cursor.HAND);
	       rectangle.setX(e.getSceneX());
	       rectangle.setY(e.getSceneY());
	       rectangle.setOnMousePressed(RectangleOnMousePressedEventHandler);
	       rectangle.setOnMouseDragged(RectangleOnMouseDraggedEventHandler);
	       rectangle.setId(Name);
	       System.out.println(Name+" Inputs to 0");
	       SetInputs(0,0, Name);
	       if(Name == "NOT"){
	    	   Buttons.TotalEntradas++;
	       }else {
	    	   Buttons.TotalEntradas++;
	    	   Buttons.TotalEntradas++;
	       }
	       AddInputs(Toolbar1, Name);
	       Main.Group.getChildren().add(rectangle);  
	    }
	public static void SetInputs(int Input1, int Input2 , String Name) {
		if(Name == "AND") {
			Compuerta.setLogic_Gate(Compuerta, LogicType.type_AND, Input1, Input2);
		}else if(Name == "OR") {
			Compuerta.setLogic_Gate(Compuerta, LogicType.type_OR, Input1, Input2);
		}else if(Name == "NOT") {
			Compuerta.setLogic_Gate(Compuerta, LogicType.type_NOT, Input1, Input2);
		}else if(Name == "NAND") {
			Compuerta.setLogic_Gate(Compuerta, LogicType.type_NAND, Input1, Input2);
		}else if(Name == "NOR") {
			Compuerta.setLogic_Gate(Compuerta, LogicType.type_NOR, Input1, Input2);
		}else if(Name == "XOR") {
			Compuerta.setLogic_Gate(Compuerta, LogicType.type_XOR, Input1, Input2);
		}else if(Name == "XNOR") {
			Compuerta.setLogic_Gate(Compuerta, LogicType.type_XNOR, Input1, Input2);
		}
	}
	public static void Window() {
		Stage stage = new Stage();
		BorderPane Panel = new BorderPane();
		Panel.setLeft(Toolbar1);
		Panel.setCenter(tableView);
		tableView.setPlaceholder(new Label("No hay Compuertas en el Circuito"));
		Toolbar1.setOrientation(Orientation.VERTICAL);
		stage.setTitle("Set Inputs | Truth Table ");
		stage.setScene(new Scene(Panel, 450, 450));				
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.showAndWait();
	}
	public static void AddInputs(ToolBar ToolBar, String Name) {
		Buttons Input1 = new Buttons();
		Buttons setInput1 = new Buttons();
		Buttons setInput2 = new Buttons();
		Input1.setMenuButton(Input1, MenuButtonType.Input, setInput1 , MenuItemType.Input1, setInput2, MenuItemType.Input2 , Name);
		ToolBar.getItems().add(Input1.getMenuButton());
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void AddColumns(TableView TableView) {
		TableColumn inputsColumn = new TableColumn("Inputs");
		inputsColumn.setMinWidth(TableView.getMaxWidth()/2);
        TableColumn<ObservableList<String>, String> outputColumn = new TableColumn("Outputs");
        outputColumn.setMinWidth(TableView.getMaxWidth()/2);
        for (int i = 0; i < Buttons.TotalEntradas; i++) {
            final int index = i;
            String name = "Input " + i;
            TableColumn<ObservableList<String>, String> newColumn = new TableColumn<>(name);
            inputsColumn.getColumns().add(newColumn);
        }
        TableView.getColumns().addAll(inputsColumn, outputColumn);
	}
	/**
	 * Evento para mover una compuerta en el panel 
	 */
	private static EventHandler<MouseEvent> RectangleOnMousePressedEventHandler = new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent t) {
                    PositionSceneX = t.getSceneX();
                    PositionSceneY = t.getSceneY();
                    PositionTranslateX = ((Rectangle)(t.getSource())).getTranslateX();
                    PositionTranslateY = ((Rectangle)(t.getSource())).getTranslateY();
                }
            };  
}