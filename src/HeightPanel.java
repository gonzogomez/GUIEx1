import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class HeightPanel extends JPanel {
	private JRadioButton tallButton, shortButton, averageButton;

	public HeightPanel() {
		super();
		//Create Buttons
		tallButton = new JRadioButton("Tall");
		shortButton = new JRadioButton("Short");
		averageButton = new JRadioButton("Average");
		ButtonGroup group = new ButtonGroup();
		//Set average as default
		averageButton.setSelected(true);
		//Add buttons
		add(tallButton);
		add(shortButton);
		add(averageButton);
		group.add(tallButton);
		group.add(shortButton);
		group.add(averageButton);
		setBorder(new TitledBorder (new EtchedBorder(), "Height"));
	}
	
	

}
