import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class FunPanel extends JPanel {
	private HeightPanel hpanel;
	private WeightPanel wpanel;
	private SmokePanel spanel;
	private FeedBackPanel fb;
	
	public FunPanel(FeedBackPanel fb) {
		super();
		this.fb = fb;
		hpanel = new HeightPanel(fb);
		wpanel = new WeightPanel(fb);
		spanel = new SmokePanel(fb);
		setLayout(new GridLayout(0,1));
		add(hpanel);
		add(wpanel);
		add(spanel);
	}

	public class HeightPanel extends JPanel {
		private JRadioButton tallButton, shortButton, averageHeightButton;

		public HeightPanel(FeedBackPanel fb){
			super();
			//Create Buttons
			tallButton = new JRadioButton("Tall");
			shortButton = new JRadioButton("Short");
			averageHeightButton = new JRadioButton("Average");
			ButtonGroup group = new ButtonGroup();
			//Set average as default
			averageHeightButton.setSelected(true);
			//Add buttons
			add(tallButton);
			add(shortButton);
			add(averageHeightButton);
			group.add(tallButton);
			group.add(shortButton);
			group.add(averageHeightButton);
			RadioListener listener = new RadioListener();
			tallButton.addActionListener(listener);
			shortButton.addActionListener(listener);
			averageHeightButton.addActionListener(listener);

			setBorder(new TitledBorder (new EtchedBorder(), "Height"));
		}
		
		private class RadioListener implements ActionListener {
			public void actionPerformed(ActionEvent e)
			{
				if (tallButton.isSelected()){
					fb.setFeedBackMessage("Do you know the Jolly Green Giant?");
				}
				else if(shortButton.isSelected()){
					fb.setFeedBackMessage("Have you met Snow White?");
				}
				else{
					fb.setFeedBackMessage("Who are your friends?");
				}
			}
			}

	}


	public class WeightPanel extends JPanel {
		private JRadioButton thinButton, heftyButton, averageWeightButton;

		public WeightPanel(FeedBackPanel fb){
			super();
			//Create Buttons
			thinButton = new JRadioButton("Thin");
			heftyButton = new JRadioButton("Hefy");
			averageWeightButton = new JRadioButton("Average");
			ButtonGroup group = new ButtonGroup();
			//Set average as default
			averageWeightButton.setSelected(true);
			//Add buttons
			add(thinButton);
			add(heftyButton);
			add(averageWeightButton);
			group.add(thinButton);
			group.add(heftyButton);
			group.add(averageWeightButton);
			RadioListener listener = new RadioListener();
			heftyButton.addActionListener(listener);
			thinButton.addActionListener(listener);
			averageWeightButton.addActionListener(listener);
			setBorder(new TitledBorder (new EtchedBorder(), "Weight"));
		}
		
		private class RadioListener implements ActionListener {
			public void actionPerformed(ActionEvent e)
			{
				if (heftyButton.isSelected()){
					fb.setFeedBackMessage("You could have a good career as a bouncer");
				}
				else if(thinButton.isSelected()){
					fb.setFeedBackMessage("Have an oreo");
				}
				else{
					fb.setFeedBackMessage("Mediocrity is the key to life");
				}
			}
			}
	}
	
	public class SmokePanel extends JPanel {
		private JRadioButton smokesButton, noSmokeButton;
		
		public SmokePanel(FeedBackPanel fb){
			super();
			//Create Buttons
			smokesButton = new JRadioButton("Smokes");
			noSmokeButton = new JRadioButton("Doesn't Smoke");
			ButtonGroup group = new ButtonGroup();
			//Set average as default
			noSmokeButton.setSelected(true);
			//Add buttons
			add(smokesButton);
			add(noSmokeButton);
			group.add(smokesButton);
			group.add(noSmokeButton);
			RadioListener listener = new RadioListener();
			smokesButton.addActionListener(listener);
			noSmokeButton.addActionListener(listener);
			setBorder(new TitledBorder (new EtchedBorder(), "Smokes"));
			
		}
		
		private class RadioListener implements ActionListener {
			public void actionPerformed(ActionEvent e)
			{
				if (smokesButton.isSelected()){
					fb.setFeedBackMessage("The surgeon general would not be pleased");
				}
			
				else{
					fb.setFeedBackMessage("Good, you would look silly on a camel");
				}
			}
			}
	}
}
