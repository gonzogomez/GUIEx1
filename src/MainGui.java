import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class MainGui extends JFrame {
	private WhoAreYou whoAreYou;
	public MainGui(){
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(1050, 425));
		setTitle("Who Are You?");
		whoAreYou = new WhoAreYou();
		add(whoAreYou);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		menuBar.add(createFileMenu());

	}
	
	private JMenu createFileMenu()
	{
	  JMenu menu = new JMenu("File"); 
	  menu.add(createFileExitItem());
	  return menu;
	}
	private JMenuItem createFileExitItem()
	{
	  JMenuItem item = new JMenuItem("Exit");
	  class MenuItemListener implements ActionListener {
	    public void actionPerformed(ActionEvent e)
	    {
	       System.exit(0);
	    }
	  }
	  item.addActionListener(new MenuItemListener());
	  return item;
	}


	public static void main(String[] args) {
		MainGui mainGui = new MainGui();
		mainGui.setVisible(true);
	}

}
