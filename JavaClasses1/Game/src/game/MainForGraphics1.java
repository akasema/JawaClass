package game;
	
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	public class MainForGraphics1
	{
	public static void main(String[] args)
	{

	JFrame frame = new JFrame();


	frame.setSize(1920,1080);


	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	Panel00 panel = new Panel00();
	   

	frame.add(panel);

	frame.setVisible(true);
	}
	}

//	FOR ALL USERS WONDERING, ADD THIS CODE IN A FOLDER THE SAME AS THE PINBALL CODE AND IT WILL RUN

