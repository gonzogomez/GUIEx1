import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class WhoAreYou extends JFrame {

	public WhoAreYou(){
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(new Dimension(1050, 425));
		setTitle("Who Are You?");
		HeightPanel hPanel = new HeightPanel();
		WeightPanel wPanel = new WeightPanel();
		add(hPanel, BorderLayout.EAST);
		add(wPanel, BorderLayout.EAST);
	}

	public static void main(String[] args) {
		WhoAreYou whoAreYou = new WhoAreYou();
		whoAreYou.setVisible(true);
	}

}
