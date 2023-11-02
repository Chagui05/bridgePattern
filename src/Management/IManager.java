package Management;

import javax.swing.ImageIcon;

import device.Device;

public interface IManager {

	public void volumeUp();
	public void volumeDown();
	public ImageIcon showImage(String imageDir);
	public Device getDevice();
	public String getTag();
}
