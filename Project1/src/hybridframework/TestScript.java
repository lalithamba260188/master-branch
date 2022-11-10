package hybridframework;

import org.testng.annotations.Test;

public class TestScript extends Base_class
{

	@Test(dataProvider="signupdata",dataProviderClass=DataProviderclass.class)
	public void signup(String fn,String ln, String mail,String pass)
	{
		Pomclass pmc=new Pomclass(driver);
		pmc.reg_link();
		pmc.gender();
		pmc.firstname(fn);
		pmc.lastname(ln);
		pmc.mail(mail);
		pmc.password(pass);
		pmc.con_pass(pass);
		pmc.regbtn();
	}
	
	
}
