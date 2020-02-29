package ard.lamp;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class InterComp extends JFrame{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private OpenConnection arduino = null;
	private String port = null;
	public JButton conn = null;
	 
	public static void main(String[] args){
		InterComp lm = new InterComp();
		lm.setVisible(true);
	}
	
	public InterComp(){
		
		this.setBounds(300, 300, 400, 300);
		this.setLocationRelativeTo(null);
		this.setTitle("Interruptor Computacional");
		
		ImageIcon icon;
		icon = new ImageIcon(getClass().getResource("/img/lampPC.png"));
		this.setIconImage(icon.getImage());
		
		JPanel panel = new JPanel();
		this.add(panel);
		
		
		JLabel label = new JLabel();
		label.setText("<html><div width='400' height='300'></div></html>");
		label.setBounds(0, 0, 400, 300);
		panel.add(label);
		
		JLabel labelGreen = new JLabel();
		labelGreen.setText("Verde: ");
		labelGreen.setBounds(10, 10, 70, 20);
		label.add(labelGreen);

		
		JLabel labelLampada = new JLabel();
		labelLampada.setText("Lampada");
		labelLampada.setForeground(Color.black);
		labelLampada.setBounds(310, 10, 100, 20);
		label.add(labelLampada);
		
		
		JLabel labelRed = new JLabel();
		labelRed.setText("Vermelho:");
		labelRed.setBounds(10, 50, 70, 20);
		label.add(labelRed);
		
		JLabel labelOrange = new JLabel();
		labelOrange.setText("Laranja:");
		labelOrange.setBounds(10, 90, 70, 20);
		label.add(labelOrange);
		
		
		JButton lampButton = new JButton();
		lampButton.setBounds(290, 30, 100, 30);
		lampButton.setText("Ligar");
		lampButton.setForeground(Color.blue);
		lampButton.setBorder(null);
		label.add(lampButton);
		
		JButton piscLamp = new JButton();
		piscLamp.setBounds(290, 70, 100, 30);
		piscLamp.setForeground(Color.blue);
		piscLamp.setText("Piscar");
		piscLamp.setBorder(null);
		label.add(piscLamp);
		
		JButton green = new JButton();
		green.setBounds(80, 10, 100, 30);
		green.setForeground(Color.blue);
		green.setText("Ligar");
		green.setBorder(null);
		label.add(green);
		
		JButton red = new JButton();
		red.setBounds(80, 50, 100, 30);
		red.setForeground(Color.blue);
		red.setText("Ligar");
		red.setBorder(null);
		label.add(red);
		
		JButton orange = new JButton();
		orange.setBounds(80, 90, 100, 30);
		orange.setForeground(Color.blue);
		orange.setText("Ligar");
		orange.setBorder(null);
		label.add(orange);
		
		JButton piscarGreen = new JButton();
		piscarGreen.setBounds(180, 10, 100, 30);
		piscarGreen.setForeground(Color.blue);
		piscarGreen.setText("Piscar");
		piscarGreen.setBorder(null);
		label.add(piscarGreen);
		
		JButton piscarRed = new JButton();
		piscarRed.setBounds(180, 50, 100, 30);
		piscarRed.setForeground(Color.blue);
		piscarRed.setText("Piscar");
		piscarRed.setBorder(null);
		label.add(piscarRed);
		
		JButton piscarOrange = new JButton();
		piscarOrange.setBounds(180, 90, 100, 30);
		piscarOrange.setForeground(Color.blue);
		piscarOrange.setText("Piscar");
		piscarOrange.setBorder(null);
		label.add(piscarOrange);
		
		conn = new JButton();
		conn.setBounds(140, 200, 120, 30);
		conn.setForeground(Color.blue);
		conn.setText("Connect");
		conn.setBorder(null);
		label.add(conn);
		
		JLabel labelCom3 = new JLabel();
		labelCom3.setText("COM3");
		labelCom3.setBounds(40, 150, 50, 20);
		label.add(labelCom3);
		
		JRadioButton COM3 = new JRadioButton();
		COM3.setBounds(20, 150, 20, 20);
		label.add(COM3); 
		

		JLabel labelCom4 = new JLabel();
		labelCom4.setText("COM4");
		labelCom4.setBounds(110, 150, 50, 20);
		label.add(labelCom4);
		
		JRadioButton COM4 = new JRadioButton();
		COM4.setBounds(90, 150, 20, 20);
		label.add(COM4);
		

		JLabel labelCom5 = new JLabel();
		labelCom5.setText("COM5");
		labelCom5.setBounds(180, 150, 50, 20);
		label.add(labelCom5);
		
		JRadioButton COM5 = new JRadioButton();
		COM5.setBounds(160, 150, 20, 20);
		label.add(COM5); 
		
		COM3.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				port = "COM3";
				COM4.setSelected(false);
				COM5.setSelected(false);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				COM3.setCursor(null);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				COM3.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		COM4.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				port = "COM4";
				COM3.setSelected(false);
				COM5.setSelected(false);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				COM4.setCursor(null);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				COM4.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		COM5.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				port = "COM5";
				COM4.setSelected(false);
				COM3.setSelected(false);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				COM5.setCursor(null);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				COM5.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		conn.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				if(port != null){
				if(conn.getText().equals("Connect")){
					conn.setCursor(new Cursor(Cursor.WAIT_CURSOR));
					arduino = new OpenConnection(port, 9600);
					if(arduino.notFound == false){
						conn.setText("Desconnect");
						conn.setForeground(Color.red);
					}
					conn.setCursor(null);
				}else{
					arduino.close();
					conn.setText("Connect");
					conn.setForeground(Color.blue);
					arduino = null;
					
					JOptionPane.showMessageDialog(null, "A conexão foi fechada!",
			                  "Arduino", JOptionPane.PLAIN_MESSAGE);
				}
				}else{
					JOptionPane.showMessageDialog(null, "Escolha uma porta!",
		                  "Arduino", JOptionPane.PLAIN_MESSAGE);
				}
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				conn.setCursor(null);
				conn.setBorder(null);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				conn.setCursor(new Cursor(Cursor.HAND_CURSOR));
				conn.setBorder(BorderFactory.createLineBorder(Color.blue));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		lampButton.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				if(arduino != null){
				if(lampButton.getText().equals("Ligar")){
					lampButton.setCursor(new Cursor(Cursor.WAIT_CURSOR));
					label.setCursor(new Cursor(Cursor.WAIT_CURSOR));
					arduino.sendString("onlamp");
					lampButton.setText("Desligar");
					lampButton.setForeground(Color.red);
					
					JOptionPane.showMessageDialog(null, "A lampada foi ligada!",
			                  "Arduino", JOptionPane.PLAIN_MESSAGE);
					label.setCursor(null);
					lampButton.setCursor(null);
				}else{
					arduino.sendString("offlamp");
					lampButton.setText("Ligar");
					lampButton.setForeground(Color.blue);
					
					JOptionPane.showMessageDialog(null, "A lampada foi desligada!",
			                  "Arduino", JOptionPane.PLAIN_MESSAGE);
				}
				
				for(int i = 0; i <= 1; i++){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {}
				}
				}else{
					 JOptionPane.showMessageDialog(null, "Conecte-se ao dispositivo!",
			                  "Arduino", JOptionPane.PLAIN_MESSAGE);
				}
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lampButton.setBackground(null);
				lampButton.setCursor(null);
				lampButton.setBorder(null);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				if(lampButton.getText().equals("Ligar")){
					lampButton.setBackground(Color.white);
				}else{
					lampButton.setBackground(Color.black);
				}
				
				lampButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				lampButton.setBorder(BorderFactory.createLineBorder(Color.blue));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		piscLamp.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				if(arduino != null){
				if(piscLamp.getText().equals("Piscar")){
					piscLamp.setCursor(new Cursor(Cursor.WAIT_CURSOR));
					label.setCursor(new Cursor(Cursor.WAIT_CURSOR));
					arduino.sendString("piscLamp");
					piscLamp.setText("Parar");
					piscLamp.setForeground(Color.red);
					
					JOptionPane.showMessageDialog(null, "A lampada está piscando!",
			                  "Arduino", JOptionPane.PLAIN_MESSAGE);
					piscLamp.setCursor(null);
					label.setCursor(null);
				}else{
					arduino.sendString("stopLamp");
					piscLamp.setText("Piscar");
					piscLamp.setForeground(Color.blue);
					
					JOptionPane.showMessageDialog(null, "A lampada parou de piscar!",
			                  "Arduino", JOptionPane.PLAIN_MESSAGE);
				}
				
				for(int i = 0; i <= 1; i++){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {}
				}
				}else{
					 JOptionPane.showMessageDialog(null, "Conecte-se ao dispositivo!",
			                  "Arduino", JOptionPane.PLAIN_MESSAGE);
				}
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				piscLamp.setBackground(null);
				piscLamp.setCursor(null);
				piscLamp.setBorder(null);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				if(piscLamp.getText().equals("Piscar")){
					piscLamp.setBackground(Color.white);
				}else{
					piscLamp.setBackground(Color.black);
				}
				piscLamp.setCursor(new Cursor(Cursor.HAND_CURSOR));
				piscLamp.setBorder(BorderFactory.createLineBorder(Color.blue));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});

		green.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				if(arduino != null){
				if(green.getText().equals("Ligar")){
					green.setCursor(new Cursor(Cursor.WAIT_CURSOR));
					label.setCursor(new Cursor(Cursor.WAIT_CURSOR));
					arduino.sendString("ongreen");
					green.setText("Desligar");
					green.setForeground(Color.red);
					green.setCursor(null);
					label.setCursor(null);
				}else{
					arduino.sendString("offgreen");
					green.setText("Ligar");
					green.setForeground(Color.blue);
				}
				
				for(int i = 0; i <= 1; i++){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {}
				}
				}else{
					 JOptionPane.showMessageDialog(null, "Conecte-se ao dispositivo!",
			                  "Arduino", JOptionPane.PLAIN_MESSAGE);
				}
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				green.setBackground(null);
				green.setCursor(null);
				green.setBorder(null);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				green.setBackground(Color.green);
				green.setCursor(new Cursor(Cursor.HAND_CURSOR));
				green.setBorder(BorderFactory.createLineBorder(Color.blue));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		red.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				if(arduino != null){
				if(red.getText().equals("Ligar")){
					red.setCursor(new Cursor(Cursor.WAIT_CURSOR));
					label.setCursor(new Cursor(Cursor.WAIT_CURSOR));
					arduino.sendString("onred");
					red.setText("Desligar");
					red.setForeground(Color.red);
					red.setCursor(null);
					label.setCursor(null);
				}else{
					arduino.sendString("offred");
					red.setText("Ligar");
					red.setForeground(Color.blue);
				}
				
				for(int i = 0; i <= 1; i++){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {}
				}
				}else{
					 JOptionPane.showMessageDialog(null, "Conecte-se ao dispositivo!",
			                  "Arduino", JOptionPane.PLAIN_MESSAGE);
				}
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				red.setBackground(null);
				red.setCursor(null);
				red.setBorder(null);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				red.setBackground(Color.red);
				red.setCursor(new Cursor(Cursor.HAND_CURSOR));
				red.setBorder(BorderFactory.createLineBorder(Color.blue));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		orange.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				if(arduino != null){
				if(orange.getText().equals("Ligar")){
					orange.setCursor(new Cursor(Cursor.WAIT_CURSOR));
					label.setCursor(new Cursor(Cursor.WAIT_CURSOR));
					arduino.sendString("onorange");
					orange.setText("Desligar");
					orange.setForeground(Color.red);
					orange.setCursor(null);
					label.setCursor(null);
				}else{
					arduino.sendString("offorange");
					orange.setText("Ligar");
					orange.setForeground(Color.blue);
				}
				
				for(int i = 0; i <= 1; i++){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {}
				}
				}else{
					 JOptionPane.showMessageDialog(null, "Conecte-se ao dispositivo!",
			                  "Arduino", JOptionPane.PLAIN_MESSAGE);
				}
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				orange.setBackground(null);
				orange.setCursor(null);
				orange.setBorder(null);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				orange.setBackground(Color.orange);
				orange.setCursor(new Cursor(Cursor.HAND_CURSOR));
				orange.setBorder(BorderFactory.createLineBorder(Color.blue));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		piscarGreen.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				if(arduino != null){
				if(piscarGreen.getText().equals("Piscar")){
					piscarGreen.setCursor(new Cursor(Cursor.WAIT_CURSOR));
					label.setCursor(new Cursor(Cursor.WAIT_CURSOR));
					arduino.sendString("piscGreen");
					piscarGreen.setText("Parar");
					piscarGreen.setForeground(Color.red);
					piscarGreen.setCursor(null);
					label.setCursor(null);
				}else{
					arduino.sendString("stopGreen");
					piscarGreen.setText("Piscar");
					piscarGreen.setForeground(Color.blue);
				}
				
				for(int i = 0; i <= 1; i++){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {}
				}
				}else{
					 JOptionPane.showMessageDialog(null, "Conecte-se ao dispositivo!",
			                  "Arduino", JOptionPane.PLAIN_MESSAGE);
				}
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				piscarGreen.setBackground(null);
				piscarGreen.setCursor(null);
				piscarGreen.setBorder(null);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				piscarGreen.setBackground(Color.green);
				piscarGreen.setCursor(new Cursor(Cursor.HAND_CURSOR));
				piscarGreen.setBorder(BorderFactory.createLineBorder(Color.blue));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		piscarRed.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				if(arduino != null){
				if(piscarRed.getText().equals("Piscar")){
					piscarRed.setCursor(new Cursor(Cursor.WAIT_CURSOR));
					label.setCursor(new Cursor(Cursor.WAIT_CURSOR));
					arduino.sendString("piscRed");
					piscarRed.setText("Parar");
					piscarRed.setForeground(Color.red);
					piscarRed.setCursor(null);
					label.setCursor(null);
				}else{
					arduino.sendString("stopRed");
					piscarRed.setText("Piscar");
					piscarRed.setForeground(Color.blue);
				}
				
				for(int i = 0; i <= 1; i++){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {}
				}
				}else{
					 JOptionPane.showMessageDialog(null, "Conecte-se ao dispositivo!",
			                  "Arduino", JOptionPane.PLAIN_MESSAGE);
				}
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				piscarRed.setBackground(null);
				piscarRed.setCursor(null);
				piscarRed.setBorder(null);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				piscarRed.setBackground(Color.red);
				piscarRed.setCursor(new Cursor(Cursor.HAND_CURSOR));
				piscarRed.setBorder(BorderFactory.createLineBorder(Color.blue));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		piscarOrange.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				if(arduino != null){
				if(piscarOrange.getText().equals("Piscar")){
					piscarOrange.setCursor(new Cursor(Cursor.WAIT_CURSOR));
					label.setCursor(new Cursor(Cursor.WAIT_CURSOR));
					arduino.sendString("piscOrange");
					piscarOrange.setText("Parar");
					piscarOrange.setForeground(Color.red);
					piscarOrange.setCursor(null);
					label.setCursor(null);
				}else{
					arduino.sendString("stopOrange");
					piscarOrange.setText("Piscar");
					piscarOrange.setForeground(Color.blue);
				}
				
				for(int i = 0; i <= 1; i++){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {}
				}
				}else{
					 JOptionPane.showMessageDialog(null, "Conecte-se ao dispositivo!",
			                  "Arduino", JOptionPane.PLAIN_MESSAGE);
				}
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				piscarOrange.setBackground(null);
				piscarOrange.setCursor(null);
				piscarOrange.setBorder(null);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				piscarOrange.setBackground(Color.orange);
				piscarOrange.setCursor(new Cursor(Cursor.HAND_CURSOR));
				piscarOrange.setBorder(BorderFactory.createLineBorder(Color.blue));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
