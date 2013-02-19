package view.client;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import link.client.Observable;
import link.client.Observer;

public class ClientWindow extends JFrame implements Observable {

	private JButton Login = new JButton("Login");
	private JButton Exit = new JButton ("Exit");
	private int choice = 0;
	private ArrayList<Observer> listObserver = new ArrayList<Observer>();

	public ClientWindow(){
		this.setTitle("Client");
		this.setSize(300, 75);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
		this.setVisible(true);
		this.setLayout(new GridLayout(1, 2));
		this.getContentPane().add(Login);
		this.getContentPane().add(Exit);
		Login.addActionListener(new LoginListener());
		Exit.addActionListener(new ExitListener());
	}

	public void addObserver(Observer obs) {
		this.listObserver.add(obs);
	}

	public void delObserver() {
		this.listObserver = new ArrayList<Observer>();
	}

	public void updateObserver() {
		for(Observer obs : this.listObserver )
			obs.update(this.choice);
	}


	class LoginListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0){
			choice = 1;
			//this.updateObserver();
		}
	}

	class ExitListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0){
			choice = 2;
			//this.updateObserver();
		}
	}




}
