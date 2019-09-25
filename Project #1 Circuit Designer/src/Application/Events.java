package Application;

import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 * Clase usada para organizar los eventos 
 */
public class Events {
	private static Rectangle rectangle;
	private static Circle Output, Input1, Input2;
	private static double PositionSceneX,PositionSceneY;
    private static double PositionTranslateX,PositionTranslateY;
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
	public static void OnDragDropped(DragEvent e,ImageView ImageView, String Name){
	       rectangle=new Rectangle(140,50);
	       rectangle.setFill(new ImagePattern(ImageView.getImage()));
	       rectangle.setCursor(Cursor.HAND);
	       rectangle.setX(e.getSceneX());
	       rectangle.setY(e.getSceneY());
	       rectangle.setOnMousePressed(RectangleOnMousePressedEventHandler);
	       rectangle.setOnMouseDragged(RectangleOnMouseDraggedEventHandler);
	       rectangle.setId(Name);
	       Main.Group.getChildren().add(rectangle);
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


