import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class CommentPanel extends JPanel {
	private JTextField movie1, movie2, movie3;
	private FeedBackPanel fb;
	
	public CommentPanel(FeedBackPanel fb){
		super();
		this.fb = fb;
		JLabel label = new JLabel("Enter your three favorite movies: ");
		JLabel label1 = new JLabel("1 ");
		JLabel label2 = new JLabel("2 ");
		JLabel label3 = new JLabel("3 ");
		movie1 = new JTextField(20);
		movie2 = new JTextField(20);
		movie3 = new JTextField(20);
		add(label);
		setLayout(new GridLayout(0,1));
		add(label1);
		add(movie1);
		add(label2);
		add(movie2);
		add(label3);
		add(movie3);
		setBorder(new TitledBorder (new EtchedBorder(), "Movies"));
	}
}
