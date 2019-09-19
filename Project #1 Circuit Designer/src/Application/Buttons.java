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

public class Buttons {
	private Button button;
	private MenuButton menuButton;
	
	public MenuButton getMenuButton() {
		return menuButton;
	}
	
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

	public Button getButton() {
		return button;
	}

	public void setButton(Buttons button, ButtonType Type) {
		Button buttonN = new Button();
		if(Type == ButtonType.And){
			buttonN.setText("And");
		}else if(Type == ButtonType.Clear){
			buttonN.setText("Clear");
		}else if(Type == ButtonType.Delete){
			buttonN.setText("Delete");
		}else if(Type == ButtonType.Exnor){
			buttonN.setText("Exnor");
		}else if(Type == ButtonType.Exor){
			buttonN.setText("Exor");
		}else if(Type == ButtonType.Nand){
			buttonN.setText("Nand");
		}else if(Type == ButtonType.Nor){
			buttonN.setText("Nor");
		}else if(Type == ButtonType.Not){
			buttonN.setText("Not");
		}else if(Type == ButtonType.Or){
			buttonN.setText("Or");
		}else if(Type == ButtonType.Run){
			buttonN.setText("Run");
		}else {
			buttonN.setText("Default");
		}
		this.button = buttonN;
	}
	public void setButton(Buttons button, ButtonType Type,
						  ImageView ImageView) {
		Button buttonN = new Button();
		if(Type == ButtonType.And){
			buttonN.setGraphic(ImageView);
		}else if(Type == ButtonType.Clear){
			buttonN.setText("Clear");
			buttonN.setGraphic(ImageView);
			buttonN.setOnAction(new EventHandler<ActionEvent>(){
	             @Override
	             public void handle(ActionEvent event) {
	                 Main.Group.getChildren().clear();
	             }
	         });
		}else if(Type == ButtonType.Delete){
			buttonN.setText("Delete");
			buttonN.setGraphic(ImageView);
		}else if(Type == ButtonType.Exnor){
			buttonN.setGraphic(ImageView);
		}else if(Type == ButtonType.Exor){
			buttonN.setGraphic(ImageView);
		}else if(Type == ButtonType.Nand){
			buttonN.setGraphic(ImageView);
		}else if(Type == ButtonType.Nor){
			buttonN.setGraphic(ImageView);
		}else if(Type == ButtonType.Not){
			buttonN.setGraphic(ImageView);
		}else if(Type == ButtonType.Or){
			buttonN.setGraphic(ImageView);
		}else if(Type == ButtonType.Run){
			buttonN.setText("Run");
			buttonN.setGraphic(ImageView);
		}else {
			buttonN.setText("Default");
		}
		buttonN.setOnDragDetected(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Events.DragDetected(event,ImageView,"AND");
            }});
		this.button = buttonN;
	}

	public void setText(String string) {
		// TODO Auto-generated method stub
		
	}

}
