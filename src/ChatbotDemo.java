/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *ṇ
 * @author Shreya
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

class Chatbot extends JFrame {
	
	
	//private static final long serialVersionUID = 1L;
	 JTextArea ca= new JTextArea();
	 JTextField cf=new JTextField();                                  
	 JButton b=new JButton();
	 JLabel l=new JLabel();
	
	Chatbot(){                                                                                        
		
		JFrame f=new JFrame();                                     
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);                      
		f.setVisible(true);
		f.setResizable(false);
		f.setLayout(null);
//		f.setSize(400,400);
		f.setBounds(0,150,450,450);
                f.getContentPane().setBackground(Color.white);
		f.setTitle("RaktVeer");
		f.add(ca);
		f.add(cf);
		ca.setSize(320,330);
		ca.setLocation(1, 1);
		ca.setBackground(Color.black);
		cf.setSize(320,30);
		cf.setLocation(1,350);
		f.add(b);
		l.setText("SEND");
		b.add(l);
                b.setBounds(350,350,70,30);
		//b.setSize(50,30);
		//b.setLocation(300,350);
                
		
		b.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    
				if(e.getSource()==b) {                           
					
					String text=cf.getText().toLowerCase();
					ca.setForeground(Color.GREEN);
					ca.append("You-->"+text+"\n");
					cf.setText("");
					
					if(text.contains("hi")) {                         
						replyMeth("Hi there");
					}
                                        else if(text.contains("how are you")) {
						replyMeth("I'm Good :).Thankyou for asking");
					}
                                        else if(text.contains("how to check the availability of Blood ")) {
						replyMeth("You'll have to check about it by checking out the stock details");
					}
                                        else if(text.contains("How do I addd information about a blood donor")) {
						replyMeth("You can add about a particular donor's information by going on the ADD NEW DONOR page");
					}
                                        else if(text.contains("What is this software all about?")) {
						replyMeth("This is a software that helps the ADMIN by simplifying his work of adding, updating, deleting the donor details. This software also helps the ADMIN to check the availability of stock  ");
					}
                                        else if(text.contains("What is this software all about?")) {
						replyMeth("This is a software that helps the ADMIN by simplifying his work of adding, updating, deleting the donor details. This software also helps the ADMIN to check the availability of stock  ");
					}
                                        else if(text.contains("How do you exit the application?")) {
						replyMeth("Yoou can exit the application by clicking on the Close button ");
					}
                                        else if(text.contains("How will this software benefit the Admin")) {
						replyMeth("This software will help the Admin by simplyfying the work ");
					}
                                        else if(text.contains("What role does Donor play in this software? ")) {
						replyMeth("Donor plays a very important role! Because it is the donor because of whom the software is existing");
					}
                                        else if(text.contains("bye")) {
						replyMeth("BYE!HOPE TO SEE YOU BACK SOON ");
					}
					else 
						replyMeth("This is a software that helps the ADMIN by \n simplifying his work of adding, updating, deleting \n the donor details. This software also helps the ADMIN \n to check the availability of stock  ");
					
				}
				
			}
			
		});
		
	}
	public void replyMeth(String s) {                          // Reply Method
		ca.append("RaktVeer-->"+s+"\n");         
	}
			

}



public class ChatbotDemo {                                     //Driver Class

	public static void main(String[] args) {             //main class
		
          new Chatbot();  
            System.out.println("ruuning");
// instantiation 
	}

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

//    void setVisible(boolean b) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    static class setVisible {

        public setVisible(boolean b) {
        }
    }

}
