import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class FeedBackPanel extends JPanel {
	private JTextArea display;
	private JLabel label;
	private String feedBackMessage;

	public FeedBackPanel() {
		display = new JTextArea(2, 20);
		label = new JLabel("FeedBack");
		display.setLineWrap(true); // uses multiple lines
		display.setWrapStyleWord(true); // breaks on word boundaries
		add(label);
		add(display);

	}
	
	public void updateFeedBack(){
		display.setText(getFeedBackMessage());
	}

	public String getFeedBackMessage() {
		return feedBackMessage;
	}

	public void setFeedBackMessage(String feedBackMessage) {
		this.feedBackMessage = feedBackMessage;
		updateFeedBack();
	}
	
	
	
	
}
