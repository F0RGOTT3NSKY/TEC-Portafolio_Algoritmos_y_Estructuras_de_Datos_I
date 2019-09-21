package Application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Clase para establecer y obtener las imagenes
 */
public class Images {
	private ImageView ImageView;
	private Image Image;
	
	/**
	 * Metodo para obtener una Image ya establecida
	 * @return Image
	 */
	public Image getImage() {
		return Image;
	}
	/**
	 * Metodo para establecer una Image 
	 * @param Image
	 * @param Type
	 * @throws FileNotFoundException
	 */
	public void setImage(Images Image, ImageType Type) throws FileNotFoundException {
		if(Type == ImageType.Icon) {
			FileInputStream inputFileN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/ICONimage.png");
			Image imagenN = new Image(inputFileN);       
			this.Image = imagenN;
		}else if(Type == ImageType.And) {
			FileInputStream inputFileN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/ANDimage.png");
			Image imagenN = new Image(inputFileN);       
			this.Image = imagenN;
		}else if(Type == ImageType.Exnor) {
			FileInputStream inputFileN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/EXNORimage.png");
			Image imagenN = new Image(inputFileN);       
			this.Image = imagenN;
		}else if(Type == ImageType.Exor) {
			FileInputStream inputFileN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/EXORimage.png");
			Image imagenN = new Image(inputFileN);       
			this.Image = imagenN;
		}else if(Type == ImageType.Nand) {
			FileInputStream inputFileN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/NANDimage.png");
			Image imagenN = new Image(inputFileN);       
			this.Image = imagenN;
		}else if(Type == ImageType.Nor) {
			FileInputStream inputFileN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/NORimage.png");
			Image imagenN = new Image(inputFileN);       
			this.Image = imagenN;
		}else if(Type == ImageType.Not) {
			FileInputStream inputFileN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/NOTimage.png");
			Image imagenN = new Image(inputFileN);       
			this.Image = imagenN;
		}else if(Type == ImageType.Or) {
			FileInputStream inputFileN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/ORimage.png");
			Image imagenN = new Image(inputFileN);       
			this.Image = imagenN;
		}
	}
	/**
	 * Metodo para obtener una ImageView ya establecida
	 * @return ImageView
	 */
	public ImageView getImageView() {
		return ImageView;
	}
	/**
	 * Metodo para establecer una ImageView
	 * @param ImageView
	 * @param Type
	 * @throws FileNotFoundException
	 */
	public void setImageView(Images ImageView, ImageType Type) throws FileNotFoundException {
		if(Type == ImageType.About) {
			FileInputStream inputFileN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/ABOUTimage.png");
			Image imagenN = new Image(inputFileN);       
			ImageView imageViewN = new ImageView(imagenN);
			this.ImageView = imageViewN;
		}else if(Type == ImageType.Add) {
			FileInputStream inputFileN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/ADDimage.png");
			Image imagenN = new Image(inputFileN);       
			ImageView imageViewN = new ImageView(imagenN);
			this.ImageView = imageViewN;
		}else if(Type == ImageType.And) {
			FileInputStream inputFileN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/ANDimage.png");
			Image imagenN = new Image(inputFileN);       
			ImageView imageViewN = new ImageView(imagenN);
			this.ImageView = imageViewN;
		}else if(Type == ImageType.Clear) {
			FileInputStream inputFileN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/CLEARimage.png");
			Image imagenN = new Image(inputFileN);       
			ImageView imageViewN = new ImageView(imagenN);
			this.ImageView = imageViewN;
		}else if(Type == ImageType.Delete) {
			FileInputStream inputFileN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/DELETEimage.png");
			Image imagenN = new Image(inputFileN);       
			ImageView imageViewN = new ImageView(imagenN);
			this.ImageView = imageViewN;
		}else if(Type == ImageType.ExitSave) {
			FileInputStream inputFileN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/EXITSAVEimage.png");
			Image imagenN = new Image(inputFileN);       
			ImageView imageViewN = new ImageView(imagenN);
			this.ImageView = imageViewN;
		}else if(Type == ImageType.Exnor) {
			FileInputStream inputFileN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/EXNORimage.png");
			Image imagenN = new Image(inputFileN);       
			ImageView imageViewN = new ImageView(imagenN);
			this.ImageView = imageViewN;
		}else if(Type == ImageType.Exor) {
			FileInputStream inputFileN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/EXORimage.png");
			Image imagenN = new Image(inputFileN);       
			ImageView imageViewN = new ImageView(imagenN);
			this.ImageView = imageViewN;
		}else if(Type == ImageType.File) {
			FileInputStream inputFileN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/FILEimage.png");
			Image imagenN = new Image(inputFileN);       
			ImageView imageViewN = new ImageView(imagenN);
			this.ImageView = imageViewN;
		}else if(Type == ImageType.Help) {
			FileInputStream inputFileN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/HELPimage.png");
			Image imagenN = new Image(inputFileN);       
			ImageView imageViewN = new ImageView(imagenN);
			this.ImageView = imageViewN;
		}else if(Type == ImageType.Nand) {
			FileInputStream inputFileN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/NANDimage.png");
			Image imagenN = new Image(inputFileN);       
			ImageView imageViewN = new ImageView(imagenN);
			this.ImageView = imageViewN;
		}else if(Type == ImageType.Nor) {
			FileInputStream inputFileN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/NORimage.png");
			Image imagenN = new Image(inputFileN);       
			ImageView imageViewN = new ImageView(imagenN);
			this.ImageView = imageViewN;
		}else if(Type == ImageType.Not) {
			FileInputStream inputFileN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/NOTimage.png");
			Image imagenN = new Image(inputFileN);       
			ImageView imageViewN = new ImageView(imagenN);
			this.ImageView = imageViewN;
		}else if(Type == ImageType.Or) {
			FileInputStream inputFileN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/ORimage.png");
			Image imagenN = new Image(inputFileN);       
			ImageView imageViewN = new ImageView(imagenN);
			this.ImageView = imageViewN;
		}else if(Type == ImageType.Run) {
			FileInputStream inputFileN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/RUNimage.png");
			Image imagenN = new Image(inputFileN);       
			ImageView imageViewN = new ImageView(imagenN);
			this.ImageView = imageViewN;
		}else if(Type == ImageType.Save) {
			FileInputStream inputFileN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/SAVEimage.png");
			Image imagenN = new Image(inputFileN);       
			ImageView imageViewN = new ImageView(imagenN);
			this.ImageView = imageViewN;
		}else if(Type == ImageType.Wiki) {
			FileInputStream inputFileN = new FileInputStream("C://Users//ADRIAN/Documents/GitHub/TEC-Portafolio_Algoritmos_y_Estructuras_de_Datos_I/Project #1 Circuit Designer/src/Images/WIKIimage.png");
			Image imagenN = new Image(inputFileN);       
			ImageView imageViewN = new ImageView(imagenN);
			this.ImageView = imageViewN;
		}
	}
	
}