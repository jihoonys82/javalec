package event;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class EventEx_03_ComponentEvent extends JFrame implements ComponentListener {
	
	public EventEx_03_ComponentEvent() {
		setBounds(100, 100, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		addComponentListener(this);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new EventEx_03_ComponentEvent();
	}

	@Override
	public void componentResized(ComponentEvent e) {
		System.out.println("Resized!!");
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		System.out.println("Moved!!");		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		System.out.println("Visible : ture!!");
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		System.out.println("Visible : false!!");
	}
	
}
