package Management;

import javax.swing.ImageIcon;

import device.Device;

public class GoogleHome implements IManager {
	private Device device;

	public GoogleHome(Device pDevice) {
		device = pDevice;
	}
	
	public void volumeUp() {
		System.out.println("Google!");
		this.device.levelUpVolume();
	}

	public void volumeDown() {
		System.out.println("Google!");
		this.device.levelDownVolume();
		
	}
	
	public ImageIcon showImage(String imageDir) {
		System.out.println("Google!");
		return this.device.showImage(imageDir);
	}
	public Device getDevice() {
		
		return device;
	}
}
