package device;

import javax.swing.ImageIcon;

public class Projector extends Device{
	
	
	public Projector(String pTag) {
		super(pTag);
		height = 500;
		width = 500;
	}
	

	public ImageIcon showImage(String imageName) {
		System.out.println("Tamaño de proyetor: "+height+"x"+width);
		return super.showImage(imageName);
	}
}
