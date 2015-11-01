import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener extends Frame implements ActionListener {
	
	public final int SMALL = 5, MEDIUM = 10, LARGE = 20;
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().substring(0, 1).equals("S")) {
			Frame.side = SMALL;
			Frame.userInput = true;
		} else if (e.getActionCommand().substring(0, 1).equals("M")) {
			Frame.side = MEDIUM;
			Frame.userInput = true;
		} else if (e.getActionCommand().substring(0, 1).equals("L")) {
			Frame.side = LARGE;
			Frame.userInput = true;
		} else {
			System.err.println("You fucked up!");
			System.exit(1);
		}
	}
}
