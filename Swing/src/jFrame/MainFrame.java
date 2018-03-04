package jFrame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.*;

public class MainFrame extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainFrame(String title)
	{
		super(title);
		
		// set layout manager
		setLayout(new BorderLayout());
		
		//create Swing component
		JTextArea textArea = new JTextArea();
		JButton button = new JButton("Click");
		// add swing components to content pane 
		Container c = getContentPane();
		c.add(textArea,BorderLayout.CENTER);
		c.add(button,BorderLayout.SOUTH);
		button.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						textArea.append("Hello\n");
						
					}
			
				});
	}

}
