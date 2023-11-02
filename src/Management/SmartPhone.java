package Management;

import javax.swing.ImageIcon;

import device.Device;

public class SmartPhone implements IManager {
	private Device device;

	public SmartPhone(Device pDevice) {
		device = pDevice;
	}
	
	public void volumeUp() {
		System.out.println("Desde celular");
		this.device.levelUpVolume();
	}

	public void volumeDown() {
		System.out.println("Desde celular");
		this.device.levelDownVolume();
		
	}
	
	public ImageIcon showImage(String imageDir) {
		System.out.println("Desde celular");
		return this.device.showImage(imageDir);
	}

	public Device getDevice() {
		return device;
	}
}