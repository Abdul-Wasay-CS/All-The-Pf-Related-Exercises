import javax.swing.JFrame;

public class DrawRainbowsTest
{
	public static void main(String[] args) {
		DrawingRainbows panel = new DrawingRainbows();

		JFrame application = new JFrame();

		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		application.add( panel );
		application.setSize( 400, 250);
		application.setVisible( true );
	}
}