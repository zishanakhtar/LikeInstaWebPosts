package insta;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class InstaMain extends BaseClass
{
	static int maxLikes;
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Instagram can block some features if bots are used regularly.");
		System.out.println("Recommended maximum like count: 50-100 in a day. Or until Instagram gives you warning. ;)");
		System.out.print("Enter maximum number of likes: ");
		maxLikes = sc.nextInt();
        try  
        {  
            //create instance of the CreateLoginForm  
            LoginForm form = new LoginForm();  
            form.setSize(600,200);  //set size of the frame  
            form.setVisible(true);  //make form visible to the user  
        }  
        catch(Exception e)  
        {     
            //handle exception   
            JOptionPane.showMessageDialog(null, e.getMessage());  
        }  
		
	}

}
