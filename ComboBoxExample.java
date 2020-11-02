import javax.swing.*; //need this for JFrame
import java.awt.event.*; //added for actionListener
import javax.swing.*;
// These libraries are needed for image use
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
//extending JFrame
public class ComboBoxExample extends JFrame implements ActionListener {
	
	//Declare elements that all methods will use:
	JButton b;
	JLabel label;
	JComboBox cb; //had to move from method

	BufferedImage img; //need one variable per image
	ImageIcon icon; //
	 // needs to be outside to use

	//Method to run:
	ComboBoxExample() throws Exception{    
		//set image variable to files here:
		img = ImageIO.read(new File ("Java.png")); //reads file into variable
		icon = new ImageIcon(img); //sets the icon to the image


	  //Assign button and set dimensions
		b=new JButton ("Show");
		b.setBounds(200,100,75,20);
		b.addActionListener(this);

		//Setup label
		label = new JLabel();
		label.setBounds(50,200,250,30); //fix this

    //Array of string to put into combo box
		String country[]={"Canada","Aus","U.S.A","England","Newzealand"};

    //Add combo box, set dimensions, and add to frame
		cb=new JComboBox(country); //put an array in brakets for the options
    cb.setBounds(50,100,100,20);    
    add(cb); 
		add(label); //added elements to the frame
		add(b);       
    
		setLayout(null);    
    setSize(400,500);    
    setVisible(true);         
	} //end of method

	public void actionPerformed(ActionEvent e) {       
	String data = "Country Selected: "+ cb.getItemAt(cb.getSelectedIndex());
	
	
	// the data variable holds the string, and then gets the selection from the drop down list  
	label.setIcon(icon); //sets the label to the image.
	//Sets labeltext to data  
	} //end action perfromed method
}//end of class