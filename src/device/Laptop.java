package device;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Laptop extends Device{
	
	public Laptop(String pTag) {
		super(pTag);
		height = 100;
		width = 400;
	}
	

	@Override
	public ImageIcon showImage(String imageName) {
		
		System.out.println("Tamaño de Laptop: "+height+"x"+width);
		return super.showImage(imageName);
	}

}
