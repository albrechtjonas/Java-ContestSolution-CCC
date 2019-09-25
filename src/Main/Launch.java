package Main;

public class Launch {
	public static void main(String[]args) {
		new Launch();
	}
	
	private Launch() {
		new GameWindow().createWindow();
	}
}
