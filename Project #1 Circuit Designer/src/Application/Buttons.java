package Application;

import java.awt.Desktop;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
/**
 * Clase que funciona para crear nuevos botones
 */
public class Buttons {
	public static int TotalEntradas = 0;
	private int Input1 = 0;
	private int Input2 = 0;
	private Button button;
	private MenuButton menuButton;
	/**
	 * Metodo para obtener un MenuButton creado 
	 * @return MenuButton
	 */
	public MenuButton getMenuButton() {
		return menuButton;
	}
	/**
	 * Metodo para establecer un MenuButton
	 * @param menuButton
	 * @param Type
	 */
	public void setMenuButton(Buttons menuButton, MenuButtonType Type) {
		MenuButton MenuButtonN = new MenuButton();
		if(Type == MenuButtonType.File){
			MenuButtonN.setText("File");
		}else if(Type == MenuButtonType.Help){
			MenuButtonN.setText("Help");
		}else {
			MenuButtonN.setText("Default");
		}
		this.menuButton = MenuButtonN;
	}
	/**
	 * Metodo para establecer un MenuButton con dos MenuItems sin Imagenes y que tiene una variable Name que identifica cual compuerta esta siendo modificada
	 * @param menuButton
	 * @param Type
	 * @param menuItem
	 * @param Type2
	 * @param menuItem2
	 * @param Type3
	 * @param Name
	 */
	public void setMenuButton(Buttons menuButton, MenuButtonType Type, 
							  Buttons menuItem, MenuItemType Type2,
							  Buttons menuItem2, MenuItemType Type3, String Name) {
		// TODO SetMenuButton con dos MenuItems sin Imagenes
		MenuButton MenuButtonN = new MenuButton();
		if(Type == MenuButtonType.File){
			MenuButtonN.setText("File");
		}else if(Type == MenuButtonType.Help){
			MenuButtonN.setText("Help");
		}else if(Type == MenuButtonType.Input){
			MenuButtonN.setText(Name+" Inputs "+TotalEntradas);
		}else {
			MenuButtonN.setText("Default");
		}
		MenuItem MenuItemN = new MenuItem();
		if(Type2 == MenuItemType.choice1) {
			MenuItemN.setText("Open Project");		
		}else if(Type2 == MenuItemType.choice2) {
			MenuItemN.setText("Save Project");
		}else if(Type2 == MenuItemType.choice3) {
			MenuItemN.setText("Save and Exit");
		}else if(Type2 == MenuItemType.about) {
			MenuItemN.setText("About");;
		}else if(Type2 == MenuItemType.wiki) {
			MenuItemN.setText("Wiki");
		}else if(Type2 == MenuItemType.Input1) {
			MenuItemN.setText("setInput1 = "+Input1);
			MenuItemN.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					if(Input1 == 0) {
						Input1 = 1;
						MenuItemN.setText("setInput1 = "+Input1);
						Events.SetInputs(Input1, Input2, Name);
					}else {
						Input1 = 0;
						MenuItemN.setText("setInput1 = "+Input1);
						Events.SetInputs(Input1, Input2, Name);
					}
				}
			});
		}else {
			MenuItemN.setText("Default");
		}
		MenuItem MenuItemN2 = new MenuItem();
		if(Type3 == MenuItemType.choice1) {
			MenuItemN2.setText("Open Project");		
		}else if(Type3 == MenuItemType.choice2) {
			MenuItemN2.setText("Save Project");
		}else if(Type3 == MenuItemType.choice3) {
			MenuItemN2.setText("Save and Exit");
		}else if(Type3 == MenuItemType.about) {
			MenuItemN2.setText("About");
		}else if(Type3 == MenuItemType.wiki) {
			MenuItemN2.setText("Wiki");
		}else if(Type3 == MenuItemType.Input2) {
			MenuItemN2.setText("setInput2 = "+Input2);
			MenuItemN2.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					if(Input2 == 0) {
						Input2 = 1;
						MenuItemN2.setText("setInput2 = "+Input2);
						Events.SetInputs(Input1, Input2, Name);
					}else {
						Input2 = 0;
						MenuItemN2.setText("setInput2 = "+Input2);
						Events.SetInputs(Input1, Input2, Name);
					}
				}
			});
		}else {
			MenuItemN2.setText("Default");
		}
		if(Name == "NOT") {
			MenuButtonN.getItems().addAll(MenuItemN);
		}else {
			MenuButtonN.getItems().addAll(MenuItemN,MenuItemN2);
		}
		this.menuButton = MenuButtonN;
	}
	/**
	 * Metodo para establecer un MenuButton con dos MenuItems
	 * @param menuButton
	 * @param Type
	 * @param ImageView
	 * @param menuItem
	 * @param Type2
	 * @param ImageView2
	 * @param menuItem2
	 * @param Type3
	 * @param ImageView3
	 */
	public void setMenuButton(Buttons menuButton, MenuButtonType Type,ImageView ImageView, 
						 	  Buttons menuItem, MenuItemType Type2,ImageView ImageView2, 
						 	  Buttons menuItem2, MenuItemType Type3,ImageView ImageView3) {
		MenuButton MenuButtonN = new MenuButton();
		if(Type == MenuButtonType.File){
			MenuButtonN.setText("File");
			MenuButtonN.setGraphic(ImageView);
		}else if(Type == MenuButtonType.Help){
			MenuButtonN.setText("Help");
			MenuButtonN.setGraphic(ImageView);
		}else {
			MenuButtonN.setText("Default");
		}
		MenuItem MenuItemN = new MenuItem();
		if(Type2 == MenuItemType.choice1) {
			MenuItemN.setText("Open Project");
			MenuItemN.setGraphic(ImageView2);
		}else if(Type2 == MenuItemType.choice2) {
			MenuItemN.setText("Save Project");
			MenuItemN.setGraphic(ImageView2);
		}else if(Type2 == MenuItemType.choice3) {
			MenuItemN.setText("Save and Exit");
			MenuItemN.setGraphic(ImageView2);
		}else if(Type2 == MenuItemType.about) {
			MenuItemN.setText("About");
			MenuItemN.setGraphic(ImageView2);
			MenuItemN.setOnAction(new EventHandler<ActionEvent>() {
				   @Override public void handle(ActionEvent e) {
				        try {
				            Desktop.getDesktop().browse(new URI("https://github.com/SkyHunter2099/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/wiki/About-%7C-Proyecto-1"));
				        } catch (IOException e1) {
				            e1.printStackTrace();
				        } catch (URISyntaxException e1) {
				            e1.printStackTrace();
				        }
				        }
				    }
				);
		}else if(Type2 == MenuItemType.wiki) {
			MenuItemN.setText("Wiki");
			MenuItemN.setGraphic(ImageView2);
		}else {
			MenuItemN.setText("Default");
		}
		MenuItem MenuItemN2 = new MenuItem();
		if(Type3 == MenuItemType.choice1) {
			MenuItemN2.setText("Open Project");
			MenuItemN2.setGraphic(ImageView3);
		}else if(Type3 == MenuItemType.choice2) {
			MenuItemN2.setText("Save Project");
			MenuItemN2.setGraphic(ImageView3);
		}else if(Type3 == MenuItemType.choice3) {
			MenuItemN2.setText("Save and Exit");
			MenuItemN2.setGraphic(ImageView3);
		}else if(Type3 == MenuItemType.about) {
			MenuItemN2.setText("About");
			MenuItemN2.setGraphic(ImageView3);
		}else if(Type3 == MenuItemType.wiki) {
			MenuItemN2.setText("Wiki");
			MenuItemN2.setGraphic(ImageView3);
			MenuItemN2.setOnAction(new EventHandler<ActionEvent>() {
				   @Override public void handle(ActionEvent e) {
				        try {
				            Desktop.getDesktop().browse(new URI("https://github.com/SkyHunter2099/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/wiki"));
				        } catch (IOException e1) {
				            e1.printStackTrace();
				        } catch (URISyntaxException e1) {
				            e1.printStackTrace();
				        }
				        }
				    }
				);
		}else {
			MenuItemN2.setText("Default");
		}
		MenuButtonN.getItems().addAll(MenuItemN,MenuItemN2);
		this.menuButton = MenuButtonN;
	}
	/**
	 * Metodo para establecer un MenuButton con tres MenuItems
	 * @param menuButton
	 * @param Type
	 * @param ImageView
	 * @param menuItem
	 * @param Type2
	 * @param ImageView2
	 * @param menuItem2
	 * @param Type3
	 * @param ImageView3
	 * @param menuItem3
	 * @param Type4
	 * @param ImageView4
	 */
	public void setMenuButton(Buttons menuButton, MenuButtonType Type,ImageView ImageView,
							  Buttons menuItem, MenuItemType Type2,ImageView ImageView2, 
							  Buttons menuItem2, MenuItemType Type3,ImageView ImageView3,
							  Buttons menuItem3, MenuItemType Type4,ImageView ImageView4,Stage PrimaryStage) {
		MenuButton MenuButtonN = new MenuButton();
		Stage Stage = new Stage();
		if(Type == MenuButtonType.File){
			MenuButtonN.setText("File");
			MenuButtonN.setGraphic(ImageView);
		}else if(Type == MenuButtonType.Help){
			MenuButtonN.setText("Help");
			MenuButtonN.setGraphic(ImageView);
		}else {
			MenuButtonN.setText("Default");
		}
		MenuItem MenuItemN = new MenuItem();
		if(Type2 == MenuItemType.choice1) {
			MenuItemN.setText("Open Project");
			MenuItemN.setGraphic(ImageView2);
			MenuItemN.setOnAction(event -> {
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Choose a Logical Gates Diagram to open");
                fileChooser.showOpenDialog(Stage);
            });
		}else if(Type2 == MenuItemType.choice2) {
			MenuItemN.setText("Save Project");
			MenuItemN.setGraphic(ImageView2);
		}else if(Type2 == MenuItemType.choice3) {
			MenuItemN.setText("Save and Exit");
			MenuItemN.setGraphic(ImageView2);
		}else if(Type2 == MenuItemType.about) {
			MenuItemN.setText("About");
			MenuItemN.setGraphic(ImageView2);
		}else if(Type2 == MenuItemType.wiki) {
			MenuItemN.setText("Wiki");
			MenuItemN.setGraphic(ImageView2);
		}else {
			MenuItemN.setText("Default");
		}
		MenuItem MenuItemN2 = new MenuItem();
		if(Type3 == MenuItemType.choice1) {
			MenuItemN2.setText("Open Project");
			MenuItemN2.setGraphic(ImageView3);
		}else if(Type3 == MenuItemType.choice2) {
			MenuItemN2.setText("Save Project");
			MenuItemN2.setGraphic(ImageView3);
		}else if(Type3 == MenuItemType.choice3) {
			MenuItemN2.setText("Save and Exit");
			MenuItemN2.setGraphic(ImageView3);
		}else if(Type3 == MenuItemType.about) {
			MenuItemN2.setText("About");
			MenuItemN2.setGraphic(ImageView3);
			MenuItemN.setText("About");
			MenuItemN.setGraphic(ImageView2);
		}else if(Type3 == MenuItemType.wiki) {
			MenuItemN2.setText("Wiki");
			MenuItemN2.setGraphic(ImageView3);
		}else {
			MenuItemN2.setText("Default");
		}
		MenuItem MenuItemN3 = new MenuItem();
		if(Type4 == MenuItemType.choice1) {
			MenuItemN3.setText("Open Project");
			MenuItemN3.setGraphic(ImageView4);
		}else if(Type4 == MenuItemType.choice2) {
			MenuItemN3.setText("Save Project");
			MenuItemN3.setGraphic(ImageView4);
		}else if(Type4 == MenuItemType.choice3) {
			MenuItemN3.setText("Save and Exit");
			MenuItemN3.setGraphic(ImageView4);
		}else if(Type4 == MenuItemType.about) {
			MenuItemN3.setText("About");
			MenuItemN3.setGraphic(ImageView4);
		}else if(Type4 == MenuItemType.wiki) {
			MenuItemN3.setText("Wiki");
			MenuItemN3.setGraphic(ImageView4);
		}else {
			MenuItemN2.setText("Default");
		}
		MenuButtonN.getItems().addAll(MenuItemN,MenuItemN2,MenuItemN3);
		this.menuButton = MenuButtonN;
	}

	/**
	 * Metodo para obtener un Button creado
	 * @return Button
	 */
	public Button getButton() {
		return button;
	}
	/**
	 * Metodo para crear un Button con Image
	 * @param button
	 * @param Type
	 * @param ImageView
	 * @throws FileNotFoundException 
	 */
	public void setButton(Buttons button, ButtonType Type) throws FileNotFoundException {
		// TODO SetButton con Image
		Button buttonN = new Button();
		if(Type == ButtonType.And){
			Images ImageAND = new Images();
	        ImageAND.setImageView(ImageAND,ImageType.And);
			buttonN.setGraphic(ImageAND.getImageView());
			buttonN.setOnDragDetected(new EventHandler<MouseEvent>() {
	            @Override
	            public void handle(MouseEvent event) {
	                Events.DragDetected(event,ImageAND.getImageView(),"AND");
	            }});	
		}else if(Type == ButtonType.Clear){
			buttonN.setText("Clear");
			Images ImageCLEAR = new Images();
	        ImageCLEAR.setImageView(ImageCLEAR,ImageType.Clear);
			buttonN.setGraphic(ImageCLEAR.getImageView());
			buttonN.setOnAction(new EventHandler<ActionEvent>(){
	             @Override
	             public void handle(ActionEvent event) {
	                 Main.Group.getChildren().clear();
	                 Events.tableView.getColumns().clear();
	                 Events.Toolbar1.getItems().clear();
	                 TotalEntradas = 0;
	             }
	         });	
		}else if(Type == ButtonType.Delete){
			buttonN.setText("Delete");
			Images ImageDELETE = new Images();
	        ImageDELETE.setImageView(ImageDELETE,ImageType.Delete);
			buttonN.setGraphic(ImageDELETE.getImageView());
			buttonN.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Information Dialog");
					alert.setHeaderText("Borrar una compuerta:");
					alert.setContentText("Tip: Puedes borrar una compuerta haciendo click derecho sobre la compuerta deseada.");
					alert.showAndWait();
				}
			});
		}else if(Type == ButtonType.Exnor){
			Images ImageEXNOR = new Images();
	        ImageEXNOR.setImageView(ImageEXNOR,ImageType.Exnor);
			buttonN.setGraphic(ImageEXNOR.getImageView());
			buttonN.setOnDragDetected(new EventHandler<MouseEvent>() {
	            @Override
	            public void handle(MouseEvent event) {
	                Events.DragDetected(event,ImageEXNOR.getImageView(),"XNOR");
	            }});
		}else if(Type == ButtonType.Exor){
			Images ImageEXOR = new Images();
		    ImageEXOR.setImageView(ImageEXOR,ImageType.Exor);
			buttonN.setGraphic(ImageEXOR.getImageView());
			buttonN.setOnDragDetected(new EventHandler<MouseEvent>() {
	            @Override
	            public void handle(MouseEvent event) {
	                Events.DragDetected(event,ImageEXOR.getImageView(),"XOR");
	            }});
		}else if(Type == ButtonType.Nand){
			Images ImageNAND = new Images();
	        ImageNAND.setImageView(ImageNAND,ImageType.Nand);
			buttonN.setGraphic(ImageNAND.getImageView());
			buttonN.setOnDragDetected(new EventHandler<MouseEvent>() {
	            @Override
	            public void handle(MouseEvent event) {
	                Events.DragDetected(event,ImageNAND.getImageView(),"NAND");
	            }});
		}else if(Type == ButtonType.Nor){
			Images ImageNOR = new Images();
	        ImageNOR.setImageView(ImageNOR,ImageType.Nor);
			buttonN.setGraphic(ImageNOR.getImageView());
			buttonN.setOnDragDetected(new EventHandler<MouseEvent>() {
	            @Override
	            public void handle(MouseEvent event) {
	                Events.DragDetected(event,ImageNOR.getImageView(),"NOR");
	            }});
		}else if(Type == ButtonType.Not){
			Images ImageNOT = new Images();
	        ImageNOT.setImageView(ImageNOT,ImageType.Not);
			buttonN.setGraphic(ImageNOT.getImageView());
			buttonN.setOnDragDetected(new EventHandler<MouseEvent>() {
	            @Override
	            public void handle(MouseEvent event) {
	                Events.DragDetected(event,ImageNOT.getImageView(),"NOT");
	            }});
		}else if(Type == ButtonType.Or){
			Images ImageOR = new Images();
	        ImageOR.setImageView(ImageOR,ImageType.Or);
			buttonN.setGraphic(ImageOR.getImageView());
			buttonN.setOnDragDetected(new EventHandler<MouseEvent>() {
	            @Override
	            public void handle(MouseEvent event) {
	                Events.DragDetected(event,ImageOR.getImageView(),"OR");
	            }});
		}else if(Type == ButtonType.Run){
			Images ImageRUN = new Images();
	        ImageRUN.setImageView(ImageRUN,ImageType.Run);
			buttonN.setText("Run");
			buttonN.setGraphic(ImageRUN.getImageView());
			buttonN.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					if(TotalEntradas==0) {
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Information Dialog");
						alert.setHeaderText("No hay compuertas en el circuito!");
						alert.setContentText("Tip: Puedes arrastrar los botones de la derecha para agregar nuevas compuertas al cicuito.");
						alert.showAndWait();
					}else if(TotalEntradas>10){
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Information Dialog");
						alert.setHeaderText("No se pueden existir mas de 10 Entradas en el circuito!");
						alert.setContentText("Tip: Puedes conectar las salidas de las compuertas con las entradas de otras compuertas para realizar un circuito.");
						alert.showAndWait();
					}else {
						Events.tableView.getColumns().clear();
						Events.AddColumns(Events.tableView);
				        Events.Window();
					}
								        
				}
			});
		}else {
			buttonN.setText("Default");
		}
		buttonN.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
            	buttonN.setCursor(Cursor.HAND);
            }
        });
		this.button = buttonN;
	}
}
