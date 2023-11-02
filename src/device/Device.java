package device;
import java.awt.Image;

import javax.swing.ImageIcon;

public abstract class Device {

    private int volumeLevel;
    protected ImageIcon image;
    protected int width;
    protected int height;
    protected String tag;
    
    public Device(String pTag) {
    	tag = pTag;
    }

    public void levelUpVolume() {
        volumeLevel++;
        System.out.println("Aumentar volumen");
    }

    public void levelDownVolume() {
    	
    	if(volumeLevel > 0) {
    		--volumeLevel;
            System.out.println("Disminuir volumen");
    	}
    }

    public ImageIcon showImage(String imageDir){
		ImageIcon imageIcon = new ImageIcon(imageDir);
		Image image = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
		ImageIcon resizedIcon = new ImageIcon(image);
		
		this.image = resizedIcon;
		
		return resizedIcon;
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public String getTag() {
		return tag;
	};
	
}
