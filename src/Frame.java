import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Frame {

	public static final String TITLE = "Shitty Minesweeper";

	public static final int windowSide = 500;

	public static int side = 0;

	public static boolean userInput = false;
	
	public static String rawInput = "";

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		getDifficulty();
		while (!userInput) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		JFrame frame = new JFrame();
		frame.setForeground(Color.WHITE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(new Dimension(windowSide, windowSide));
		frame.setTitle(TITLE);

		ImageIcon MrPB = new ImageIcon("MrPB.jpg", "The one and only Mr.PoopyButthole!");
		ImageIcon Grass = new ImageIcon("Grass.jpg", "Regular grass.");
		ImageIcon Hitler = new ImageIcon("Hitler.jpg", "The one and only Mr.Hitler!");
		ImageIcon Bomb = new ImageIcon("Bomb.png", "Boom!");

		frame.setLayout(new GridLayout(side, side));
		for (int i = 0; i < side * side; i++) {
			JButton square = new JButton(new ImageIcon(((Bomb).getImage())
					.getScaledInstance(windowSide / side, windowSide / side, java.awt.Image.SCALE_SMOOTH)));
			frame.add(square);
		}
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public static void getDifficulty() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle(TITLE);

		JButton small = new JButton("Small (5x5)");
		small.setBackground(Color.GREEN);
		ActionListener listener = new MyActionListener();
		small.addActionListener(listener);
		frame.add(small);

		JButton medium = new JButton("Medium (10x10)");
		medium.setBackground(Color.YELLOW);
		listener = new MyActionListener();
		medium.addActionListener(listener);
		frame.add(medium);

		JButton large = new JButton("Large (20x20)");
		large.setBackground(Color.RED);
		listener = new MyActionListener();
		large.addActionListener(listener);
		frame.add(large);
		
		frame.setLayout(new FlowLayout());
		frame.pack();
		frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	}
}