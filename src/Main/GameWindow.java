package Main;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class GameWindow {
	
	private String title="GameEngine";
	
	private Dimension dimension=new Dimension(600,600);
	
	private JFrame frame;
	
	private Canvas canvas;
	
	public GameWindow() {
		createWindow();
	}
	
	public GameWindow(Dimension dimension) {
		this.dimension=dimension;
		createWindow();
	}
	
	public GameWindow(String title,Dimension dimension) {
		this.title=title;
		this.dimension=dimension;
		createWindow();
	}
	
	private void createWindow() {
		frame=new JFrame();
		frame.setTitle(title);
		frame.setSize(dimension);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		canvas=new Canvas();
		canvas.setPreferredSize(dimension);
		canvas.setMaximumSize(dimension);
		canvas.setMinimumSize(dimension);
		
		frame.add(canvas);
		frame.pack();
	}
	
	public Dimension getDimension() {
		return dimension;
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	public Canvas getCanvas() {
		return canvas;
	}
}
