package com.javaws.client;
import java.awt.Color ;
import java.awt.GridLayout ;
import java.awt.event.ActionListener;
import java.awt.BorderLayout ;
import javax.swing.BoxLayout ;
import java.awt.FlowLayout ;
import javax.swing.JFrame ;
import javax.swing.JLabel;
import javax.swing.JPanel ;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AuthUI extends JFrame {
	private JPanel pan = new JPanel();
    private JPanel header = new JPanel();
    private JPanel content = new JPanel();
    private JPanel groupButton = new JPanel();
    private JPanel formLogin = new JPanel();
    private JPanel formPassword = new JPanel();
    private JTextField login = new JTextField(15);
    private JTextField password = new JTextField(15);
    //Composant boutton
    private JButton validerBtn = new JButton("Valider");
    private JButton quitterBtn = new JButton("Quitter");
    public AuthUI(){
        this.setVisible(true) ;
        this.setSize(400, 200);
        this.setTitle("Connexion");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//        pan.setLayout(new BoxLayout(pan, BoxLayout.Y_AXIS));
        this.setContentPane(content);
        this.content.setLayout(new BorderLayout());
        
        this.header.add(new JButton("Connectez-vous"));
        
        this.groupButton.add(validerBtn);
        this.groupButton.add(quitterBtn);
        
        formPassword.setLayout(new FlowLayout());
        formLogin.setLayout(new FlowLayout());
        formLogin.add(new JLabel("Login : "));
        formLogin.add(login);
     
        formPassword.add(new JLabel("Password : "));
        formPassword.add(password);
      
        this.content.add(header, BorderLayout.NORTH);
        this.content.add(groupButton, BorderLayout.SOUTH);
        this.pan.add(formLogin);
        this.pan.add(formPassword);
        this.content.add(pan, BorderLayout.CENTER);
        
    }
	public void display() {
		// TODO Auto-generated method stub
		this.setVisible(true);	
	}

	public void setAddActionListener(ActionListener listener) {
        this.validerBtn.addActionListener(listener);
    }

	public String getLogin() {
		return this.login.getText();
	}
//	password
	public String getPassword() {
		return this.password.getText();
	}

	public void setClearListener(ActionListener listener) {
		this.quitterBtn.addActionListener(listener);
	}
	public void setQuiterActionListener(ActionListener quiterActioner) {
		// TODO Auto-generated method stub
		this.quitterBtn.addActionListener(quiterActioner);
		
	}
	
	
	
}
