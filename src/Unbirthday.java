import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String date = JOptionPane.showInputDialog("Hello, user. When is your birthdate? (mm/dd)");
			if(date.equals("5/8")){
				JOptionPane.showMessageDialog(null, "What a coincidence! Happy birthday to you good fellow :D");
	}else {
				JOptionPane.showMessageDialog(null, "Well, then, happy 'UNbirthday' to you >:(");
	}
}
}
