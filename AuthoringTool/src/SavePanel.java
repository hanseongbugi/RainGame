import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SavePanel extends JPanel{
	private JTextField filePath=new JTextField(20);
	private String path=null;
	public SavePanel(String fileName) {
		setLayout(new BorderLayout());
		if(fileName!=null) {
			path=fileName;
			filePath.setText(fileName);
		}
		add(new JLabel("���� �̸��� �Է��Ͻÿ�."),BorderLayout.NORTH);
		add(filePath,BorderLayout.CENTER);
		filePath.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				path=filePath.getText();
				filePath.setText("");
				JOptionPane.getRootFrame().dispose();
			}
		});
	}
	public void setFilePath() {
		path=filePath.getText();
	}
	public String getFilePath() {
		return path;
	}
}
