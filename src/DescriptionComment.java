import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class DescriptionComment extends JPanel {
	private JTextField comment;
	private FeedBackPanel fb;

	public DescriptionComment(FeedBackPanel fb){
		super();
		this.fb = fb;
		JLabel label = new JLabel("Enter a description of yourself: ");
		comment = new JTextField(20);
		comment.setFont(new Font("SansSerif", Font.BOLD, 28));
		comment.setText("You, in a Box");
		add(label);
		add(comment);
		setBorder(new TitledBorder (new EtchedBorder(), "Free Format Description"));
	}
	
	public void setMessage(String message)
	{
		comment.setText(message);
	}
}
