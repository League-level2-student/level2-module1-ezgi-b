package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	public static void main(String[] args) {
		GuestBook bookie = new GuestBook();
		bookie.CreateUI();
	}
	
	ArrayList<String> GuestBook = new ArrayList<String>();
	JButton plusName;
	JButton iSpyNames;
	void CreateUI() {
		GuestBook.add("Bruce Banner");
		GuestBook.add("Severus Snape");
		GuestBook.add("Gregory Goyle");
		GuestBook.add("Donald Davenport");
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		plusName = new JButton("Add Name");
		iSpyNames = new JButton("View Names");
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(3);
		frame.add(panel);
		
		panel.add(plusName);
		panel.add(iSpyNames);
		
		plusName.addActionListener(this);
		
		iSpyNames.addActionListener(this);
		
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(iSpyNames)) {
			String s = "Guest Book: " + "\n";
			for(int i = 0; i < GuestBook.size(); i++) {
				s = s + "Guest #" + (i+1) + ": " + GuestBook.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, s);
		}
		if(e.getSource().equals(plusName)) {
			GuestBook.add(JOptionPane.showInputDialog("What name would you like to add to the Guest Book?"));
		}
		
	}

}

