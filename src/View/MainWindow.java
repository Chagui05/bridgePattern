package View;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Management.IManager;
import device.Device;
import extra.Iter;

public class MainWindow extends JFrame{
	private ArrayList<Device> devices;
	private Iter managers;
	private IManager activeManager;
	
	public MainWindow(ArrayList<Device> d, ArrayList<IManager> m) {
		devices = d;
		Iter managers = new Iter(m);
		
		setTitle("Vista de Dispositivos");
		setSize(600, 400);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(400, 20);
		setLayout(new BorderLayout());
		
		JPanel mainPanel = new JPanel(new GridLayout(2, 2));
		
		//BOTONES
		JPanel gridPanel = new JPanel(new GridLayout(2, 2));
        JButton subir = new JButton("Subir Volumen ");
        JButton bajar = new JButton("Bajar Volumen ");
        JButton cambiar = new JButton("Cambio Manager ");
        JButton mostrar = new JButton("Mostrar Imagen");
        gridPanel.add(cambiar); 
        gridPanel.add(subir);
        gridPanel.add(bajar);
        gridPanel.add(mostrar);
        
        JPanel labelPanel = new JPanel();
        JLabel tipoDeDispositivo = new JLabel("Tipo");
        tipoDeDispositivo.setFont(new Font("Monospaced", Font.BOLD, 38)); 
		tipoDeDispositivo.setForeground(Color.BLACK);
		labelPanel.add(tipoDeDispositivo);
		
		JPanel labelPanel2 = new JPanel();
        JLabel volumeLevel = new JLabel("Volumen: ");
        volumeLevel.setFont(new Font("Monospaced", Font.BOLD, 22)); 
        volumeLevel.setForeground(Color.BLACK);
        labelPanel2.add(volumeLevel);
        
        JPanel imagePanel = new JPanel();
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\santi\\OneDrive\\Desktop\\TEC-UCR\\TEC\\II-Semestre\\POO\\bridgePattern\\noSignal.jpeg");
		Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
		ImageIcon resizedIcon = new ImageIcon(image);
		JLabel imageLabel = new JLabel(resizedIcon);
		imagePanel.add(imageLabel);
   
        mainPanel.add(labelPanel);
        mainPanel.add(labelPanel2);
        mainPanel.add(imagePanel);
        mainPanel.add(gridPanel);
        
        add(mainPanel, BorderLayout.CENTER);
        

        //FUNCION DE BOTONES
        cambiar.addActionListener(new ActionListener() {//cambiar manager
            public void actionPerformed(ActionEvent e) {
            	activeManager = (IManager) managers.getNext();
            	tipoDeDispositivo.setText(activeManager.getDevice().getTag());
            	imageLabel.setIcon(null);
            	volumeLevel.setText("Volumen: "+activeManager.getDevice().getVolumeLevel());
            	System.out.println("Manager activo: "+activeManager);
;            }
        });
        
        
        subir.addActionListener(new ActionListener() {//subir Volumen
            public void actionPerformed(ActionEvent e) {
            	volumeLevel.setText("Volumen: "+activeManager.getDevice().getVolumeLevel());
            	activeManager.volumeUp();
            }
        });
        
        bajar.addActionListener(new ActionListener() {//bajar Volumen
            public void actionPerformed(ActionEvent e) {
            	volumeLevel.setText("Volumen: "+activeManager.getDevice().getVolumeLevel());
            	activeManager.volumeDown();
            }
        });
        
        mostrar.addActionListener(new ActionListener() {//mostrar imagen
            public void actionPerformed(ActionEvent e) {
            	ImageIcon resizedPic = activeManager.showImage("C:\\Users\\santi\\OneDrive\\Desktop\\TEC-UCR\\TEC\\II-Semestre\\POO\\bridgePattern\\todd.jpg");
            	imageLabel.setIcon(resizedPic);
            }
        });
        

	}
}
