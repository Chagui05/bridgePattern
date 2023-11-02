package Management;

import javax.swing.ImageIcon;

import device.Device;

public class Alexa implements IManager{
	private Device device;

	public Alexa(Device pDevice) {
		device = pDevice;
	}
	
	public void volumeUp() {
		System.out.println("Alexa!");
		this.device.levelUpVolume();
	}

	public void volumeDown() {
		System.out.println("Alexa!");
		this.device.levelDownVolume();
		
	}
	
	public ImageIcon showImage(String imageDir) {
		System.out.println("Alexa!");
		return this.device.showImage(imageDir);
	}

	public Device getDevice() {
		return device;
	}
}
