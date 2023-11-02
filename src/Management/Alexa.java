package Management;

import javax.swing.ImageIcon;

import device.Device;

public class Alexa implements IManager{
	private Device device;
	private String tag;

	public Alexa(Device pDevice, String pTag) {
		device = pDevice;
		tag = pTag;
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

	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return tag;
	}
}
