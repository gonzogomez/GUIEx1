import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class WeightPanel extends JPanel {
	private JRadioButton thinButton, heftyButton, averageButton;
	
	public WeightPanel() {
		super();
		//Create Buttons
		thinButton = new JRadioButton("Thin");
		heftyButton = new JRadioButton("Hefy");
		averageButton = new JRadioButton("Average");
		ButtonGroup group = new ButtonGroup();
		//Set average as default
		averageButton.setSelected(true);
		//Add buttons
		add(thinButton);
		add(heftyButton);
		add(averageButton);
		group.add(thinButton);
		group.add(heftyButton);
		group.add(averageButton);
		setBorder(new TitledBorder (new EtchedBorder(), "Weight"));
	}
	

}
