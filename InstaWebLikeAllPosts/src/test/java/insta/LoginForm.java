package insta;

//import required classes and packages  
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.lang.Exception;  

//create CreateLoginForm class to create login form  
//class extends JFrame to create a window where our component add  
//class implements ActionListener to perform an action on button click  
@SuppressWarnings("serial")
class LoginForm extends JFrame implements ActionListener  
{  
	//initialize button, panel, label, and text field  
	static JButton b1;  
	JPanel newPanel;  
	JLabel userLabel, passLabel, likeLabel;  
	static JTextField  textField1;
	static JTextField textField2 = new JTextField();  

	//calling constructor  
	LoginForm()  
	{     

		//create label for username   
		userLabel = new JLabel();  
		userLabel.setText("Email / Username");      //set label value for textField1  

		//create text field to get username from the user  
		textField1 = new JTextField(15);    //set length of the text  

		//create label for password  
		passLabel = new JLabel();  
		passLabel.setText("Password");      //set label value for textField2  

		//create text field to get password from the user  
		textField2 = new JPasswordField(15);    //set length for the password  

		//create submit button  
		b1 = new JButton("SUBMIT"); //set label to button  

		//create panel to put form elements  
		newPanel = new JPanel(new GridLayout(3, 1));  
		newPanel.add(userLabel);    //set username label to panel  
		newPanel.add(textField1);   //set text field to panel  
		newPanel.add(passLabel);    //set password label to panel  
		newPanel.add(textField2);   //set text field to panel  
		newPanel.add(b1);           //set button to panel  

		//set border to panel   
		add(newPanel, BorderLayout.CENTER);  

		//perform action on button click   
		b1.addActionListener(this);     //add action listener to button  
		setTitle("Enter Your Instagram Credentials");         //set title to the login form  
	}  

	
	//define abstract method actionPerformed() which will be called on button click   
	public void actionPerformed(ActionEvent ae)     //pass action listener as a parameter  
	{  
		String email = textField1.getText();        //get user entered username from the textField1  
		String pwd = textField2.getText();        //get user entered pasword from the textField2  
		try
		{
			BaseClass.setup();
			Login.login(email, pwd);
			HomePage.clickNotNow();
			HomePage.likeAllPosts();
			
			setVisible(false);
			dispose();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	} 
}  
