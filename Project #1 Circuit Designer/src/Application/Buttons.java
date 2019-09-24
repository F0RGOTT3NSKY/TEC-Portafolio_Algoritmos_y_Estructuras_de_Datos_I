package Application;

import java.io.FileNotFoundException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
/**
 * 
 * Clase para la creacion de botones
 *
 */
public class Buttons {
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
	 * Metodo para establecer un MenuButton con un MenuItem
	 * @param menuButton
	 * @param Type
	 * @param menuItem
	 * @param Type2
	 */
	public void setMenuButton(Buttons menuButton, MenuButtonType Type, 
							  Buttons menuItem, MenuItemType Type2) {
		MenuButton MenuButtonN = new MenuButton();
		if(Type == MenuButtonType.File){
			MenuButtonN.setText("File");
		}else if(Type == MenuButtonType.Help){
			MenuButtonN.setText("Help");
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
		}else {
			MenuItemN.setText("Default");
		}
		MenuButtonN.getItems().add(MenuItemN);
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
							  Buttons menuItem3, MenuItemType Type4,ImageView ImageView4) {
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
	             }
	         });
		}else if(Type == ButtonType.Delete){
			buttonN.setText("Delete");
			Images ImageDELETE = new Images();
	        ImageDELETE.setImageView(ImageDELETE,ImageType.Delete);
			buttonN.setGraphic(ImageDELETE.getImageView());
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
		}else {
			buttonN.setText("Default");
		}
		this.button = buttonN;
	}



}
