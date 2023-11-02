package device;

import java.awt.Image;
import javax.swing.ImageIcon;

public class SmartTv extends Device {
	
	public SmartTv(String pTag) {
		super(pTag);
		height = 200;
		width = 200;
	}
	

	public ImageIcon showImage(String imageName) {
		System.out.println("Tamaño de tele: "+height+"x"+width);
		return super.showImage(imageName);
	}

}
