package ProjetJava;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import ProjetJava.VoteController;
import ProjetJava.Vote;
import ProjetJava.VoteVue;
import javax.swing.UIManager;
import com.jgoodies.forms.factories.DefaultComponentFactory;


public class VoteVueGUI extends VoteVue implements ActionListener {

	private JFrame voteJFrame;
	private JLabel message = new JLabel(" ");
	private JTable table;
	JPanel textContent = new JPanel();
	private final JTextField textField = new JTextField();
	private final JLabel lblApplicationVote = DefaultComponentFactory.getInstance().createTitle("Application Vote");
	

	public VoteVueGUI(Vote model,
			VoteController controller, Object posX, Object posY) {
		
		super(model, controller);
		textField.setBackground(UIManager.getColor("Button.background"));
		textField.setColumns(10);
		
		//Construction de la fenêtre
		voteJFrame = new JFrame("votethèque MVC");	
		textContent.setLayout(new BoxLayout(textContent, BoxLayout.Y_AXIS));
		updateTable();
		textContent.add(table.getTableHeader());
		textContent.add(table);
		
		textContent.add(lblApplicationVote);
		textContent.add(message);
		
		
		voteJFrame.getContentPane().add(textContent, BorderLayout.NORTH);
		
		JPanel fieldZone = new JPanel();
		fieldZone.setLayout(new BoxLayout(fieldZone, BoxLayout.X_AXIS));
		JLabel fieldLabel = new JLabel("Combien de Participants?");
		fieldZone.add(fieldLabel);
		
		fieldZone.add(textField);
		voteJFrame.getContentPane().add(fieldZone, BorderLayout.CENTER);
		JPanel panelbuttons = new JPanel();
		
		voteJFrame.getContentPane().add(panelbuttons, BorderLayout.SOUTH);
		voteJFrame.pack();
		voteJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		voteJFrame.setSize(500, 400);
		voteJFrame.setLocation(300, 400);
		voteJFrame.setVisible(true);
		voteJFrame.pack();
		
		
		
	}


	private void updateTable() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void affiche(String string) {
		// TODO Auto-generated method stub
		
	}


}
