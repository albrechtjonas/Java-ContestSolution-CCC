package Main;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class GameWindow {
	
	private String title="GameEngine";
	
	private int width=600;
	
	private int height=600;
	
	private JFrame frame;
	
	private Canvas canvas;
	
	public GameWindow() {
		
	}
	
	public GameWindow(int width,int height) {
		this.width=width;
		this.height=height;
	}
	
	public GameWindow(String title,int width,int height) {
		this.title=title;
		this.width=width;
		this.height=height;
	}
	
	public void createWindow() {
		frame=new JFrame();
		frame.setTitle(title);
		frame.setSize(width,height);
		
		canvas=new Canvas();
		canvas.setPreferredSize(new Dimension(width,height));
		canvas.setMaximumSize(new Dimension(width,height));
		canvas.setMinimumSize(new Dimension(width,height));
		frame.getContentPane().add(canvas,BorderLayout.CENTER);
		
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	public Canvas getCanvas() {
		return canvas;
	}
	
}
