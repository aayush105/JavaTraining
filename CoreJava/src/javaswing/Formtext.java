package javaswing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Formtext {

	
	public static void main(String[] args) {
		
		JFrame form = new JFrame();
		
			form.setSize(800,500); //(width,height)
			form.setTitle("TestForm");
			form.setLayout(null); // to place the component in your own respective area.
		
			//Create JLabel
			
			JLabel jl = new JLabel("Welcome");		
			jl.setBounds(200,100,80,20); //(horizontal(x),vertical(y),width,height)
			form.add(jl);
			
			JButton jb = new JButton("Click Me");
			jb.setBounds(200,150,400,40);
			form.add(jb);
			
			
		form.setVisible(true); // show from
		
		
	}
}
