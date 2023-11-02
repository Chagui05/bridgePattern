package View;

import java.util.ArrayList;
import javax.swing.SwingUtilities;
import Management.*;
import device.*;

public class Client {
	
	
	public static void main(String args[]) 
	{
		Laptop laptop = new Laptop("Laptop");
		SmartTv tv = new SmartTv("TV");
		Projector projector = new Projector("Proyector");
		ArrayList<Device> devices = new ArrayList<Device>();
		devices.add(projector);devices.add(tv);devices.add(laptop);
		
		Alexa alexa = new Alexa(laptop);
		GoogleHome google = new GoogleHome(tv);
		SmartPhone phone = new SmartPhone(projector);
		ArrayList<IManager> managers = new ArrayList<IManager>();
		managers.add(alexa);managers.add(google);managers.add(phone);
		
       	MainWindow frame = new MainWindow(devices, managers);
      	
        SwingUtilities.invokeLater(() -> {
			
	        frame.setVisible(true);
	        
	    }); 
	}
	
	
	
}
