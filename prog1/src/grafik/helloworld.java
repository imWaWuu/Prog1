package grafik;
import java.awt.*;
import javax.swing.*;


public class helloworld extends JFrame{
	
	
	JLabel text= new JLabel("hello world");
	JButton knapp= new JButton("change text");
	
	
	//constructor
	public helloworld() {
		
	this.setVisible(true);
	this.setSize(new Dimension(500,500));
	this.setLayout(new FlowLayout());
	this.add(text);
	this.add(knapp);
	
	knapp.addActionListener(e->{
		text.setText("ny text");
		
	});
	//contructor
	
	
	
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		new helloworld();
		
	}

}
