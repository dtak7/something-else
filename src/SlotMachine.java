import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel("R1");
	JLabel label1 = new JLabel("R2");
	JLabel label2 = new JLabel("R3");
	JButton spin = new JButton();
	JLabel slotLabel = new JLabel();

	public static void main(String[] args) {
		SlotMachine sm = new SlotMachine();
	}

	// private boolean checkWin() {

	// }

	public SlotMachine() {
		spin.setText("SPIN");
		spin.addMouseListener(this);
		frame.setSize(1000, 268);
		panel.add(spin);
		label.setVisible(true);
		label1.setVisible(true);
		label2.setVisible(true);
		panel.add(label);
		panel.add(label1);
		panel.add(label2);
		panel.add(slotLabel);

		frame.add(panel);
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {

		// TODO Auto-generated method stub

		for (int i = 0; i < 3; i++) {
			int ran = new Random().nextInt(3);

			if (ran == 0) {
				String bananaImage = "banana.png";

				if (i == 0) {
					label.setText("banana");

				} else if (i == 1) {
					label1.setText("bananna");
				} else {
					label2.setText("bananna");
				}

			} else if (ran == 1) {

				String cherry2Image = "cherry2.jpg";

				if (i == 0) {
					label.setText("cherry");

				} else if (i == 1) {
					label1.setText("cherry");
				} else {
					label2.setText("cherry");
				}
			} else if (ran == 2) {

				String orangeImage = "orange.jpg";

				if (i == 0) {
					label.setText("orange");

				} else if (i == 1) {
					label1.setText("orange");
				} else {
					label2.setText("orange");
				}
			}

		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
