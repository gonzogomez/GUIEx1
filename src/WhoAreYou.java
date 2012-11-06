import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class WhoAreYou extends JPanel {
	private CommentPanel cpanel;
	private DescriptionComment dcomment;
	private FunPanel fpanel;
	private PreferredPanel ppanel;
	private FeedBackPanel fb;
	
	public WhoAreYou() {
		super();
		fb = new FeedBackPanel();
		cpanel = new CommentPanel(fb);
		dcomment = new DescriptionComment(fb);
		fpanel = new FunPanel(fb);
		ppanel = new PreferredPanel(fb);
		setLayout(new BorderLayout());
		add(ppanel, BorderLayout.NORTH);
		add(cpanel, BorderLayout.WEST);
		add(fpanel, BorderLayout.EAST);
		add(dcomment, BorderLayout.CENTER);
		add(fb, BorderLayout.SOUTH);
	}
	
	

}
