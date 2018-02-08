import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4LIfe {
public static void main(String[] args) {
	Code4LIfe c4l = new Code4LIfe();
	String Q1 =JOptionPane.showInputDialog("how many hours have you spent coding this week??");
	int Qu1 = Integer.parseInt(Q1);
	if(Qu1==3||Qu1==4) {
		JOptionPane.showMessageDialog(null, "You're a coding Ninja");
	}
	else if(Qu1>=5) {
		c4l.playBatmanTheme();
	}
	else {
		JOptionPane.showMessageDialog(null, "stop watching YouTub");
	}
	
}
private static void playBatmanTheme() {
	try {
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/batman.wav"));
		Clip clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		clip.start();
		Thread.sleep(60002);
	} catch (Exception ex) {
		ex.printStackTrace();
	}
}


}
