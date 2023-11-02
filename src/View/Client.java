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
		
		ArrayList<IManager> managers = new ArrayList<IManager>();
		//laptop Remote
		Alexa alexaL = new Alexa(laptop,"alexa");
		GoogleHome googleL = new GoogleHome(laptop,"google");
		SmartPhone phoneL = new SmartPhone(laptop,"phone");
		managers.add(alexaL);managers.add(googleL);managers.add(phoneL);
		//TV remote
		Alexa alexaTV = new Alexa(tv,"alexa");
		GoogleHome googleTV = new GoogleHome(tv,"google");
		SmartPhone phoneTV = new SmartPhone(tv,"phone");
		managers.add(alexaTV);managers.add(googleTV);managers.add(phoneTV);
		//projector remote
		Alexa alexaP = new Alexa(projector,"alexa");
		GoogleHome googleP = new GoogleHome(projector,"google");
		SmartPhone phoneP = new SmartPhone(projector,"phone");
		managers.add(alexaP);managers.add(googleP);managers.add(phoneP);
		
		
       	MainWindow frame = new MainWindow(devices, managers);
      	
        SwingUtilities.invokeLater(() -> {
			
	        frame.setVisible(true);
	        
	    }); 
	}
	
	
	
}
