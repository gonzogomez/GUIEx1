import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PreferredPanel extends JPanel {
	private JCheckBox waterBox, coffeeBox, teaBox, sodaBox;
	private FeedBackPanel fb;

	public PreferredPanel(FeedBackPanel fb){
		super();
		this.fb = fb;
		JLabel label = new JLabel("Select your preferred beverages: ");
		add(label);
		waterBox = new JCheckBox("Water");
		coffeeBox = new JCheckBox("Coffee");
		teaBox = new JCheckBox("Tea");
		sodaBox = new JCheckBox("Soda");
		add(waterBox);
		add(coffeeBox);
		add(teaBox);
		add(sodaBox);
		CheckboxListener cbl = new CheckboxListener();
		waterBox.addActionListener(cbl);
		coffeeBox.addActionListener(cbl);
		teaBox.addActionListener(cbl);
		sodaBox.addActionListener(cbl);
	}
	
	private class CheckboxListener implements ActionListener
	{
	  public void actionPerformed(ActionEvent e){
		  JCheckBox checkbox = (JCheckBox) e.getSource();
		  if (!checkbox.isSelected()){
			  fb.setFeedBackMessage("Changed your mind, huh?");
		  }
		  else{
			  if (e.getSource() == waterBox){
				  fb.setFeedBackMessage("Share some with the plants...");
			  }
			  if(e.getSource() == coffeeBox){
				  fb.setFeedBackMessage("Too much blood in your caffeine system?");
			  }
			  if(e.getSource() == teaBox){
				  fb.setFeedBackMessage("You're invited to the Boston Tea Party");
			  }
			  if(e.getSource() == sodaBox){
				  fb.setFeedBackMessage("The Dr (Pepper) is in!");
			  }
		  }
	  }
	}
}