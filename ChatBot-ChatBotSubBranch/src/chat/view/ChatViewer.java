package chat.view;

import javax.swing.JOptionPane;

public class ChatViewer
{

	public String collectResponse(String Question)
	{
		String response = "";
		
		response = JOptionPane.showInputDialog(null, Question);
		
		return response;
	}
	
	public int collectUserOption(String question)
	{
		int response = 0;
		
		response = JOptionPane.showConfirmDialog(null, question);
		
		return response; 
	}
	
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null,  message);
	}
}
