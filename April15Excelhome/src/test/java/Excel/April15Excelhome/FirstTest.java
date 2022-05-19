package Excel.April15Excelhome;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class FirstTest {
@Test
public void home() throws IOException
{
	Datawork aim=new Datawork();
	ArrayList<String> home=aim.getData("Login");
	System.out.println(home.get(0));
	System.out.println(home.get(1));
	ArrayList<String> home1=aim.getData("Password");
	System.out.println(home1.get(0));
	System.out.println(home1.get(1));
	
}
}
