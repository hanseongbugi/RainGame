import java.awt.*;
import javax.swing.*;
public class ScorePanel extends JPanel{
	private int score=0;
	private int value=10;
	private JLabel scoreLabel=new JLabel(Integer.toString(score));
	private JLabel la=new JLabel("����: ");
	public ScorePanel() {
		this.setBackground(Color.CYAN);
		setLayout(new BorderLayout());
		la.setFont(new Font("���",Font.ITALIC,20));
		scoreLabel.setFont(new Font("���",Font.ITALIC,30));
		add(la,BorderLayout.WEST);
		add(scoreLabel,BorderLayout.CENTER);
	}
	public void setScore() {
		score+=value;
		scoreLabel.setText(Integer.toString(score));
	}
	public void increaseScoreValue() {
		value+=10;
	}
	public void totalScore() {
		JOptionPane.showMessageDialog(null,"�� ����: "+score,"��������",JOptionPane.INFORMATION_MESSAGE);
		
	}
}
