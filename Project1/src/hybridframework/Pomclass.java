package hybridframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclass extends Base_class
{

	@FindBy(xpath="//a[.='Register']")
	 private WebElement reg;
	
	@FindBy(xpath="//input[@id='gender-male']")
	private WebElement maleRadio;
	
	@FindBy(id="FirstName")
	private WebElement first_Name;
	
	
	@FindBy(id="LastName")
	private WebElement last_Name;
	
	@FindBy(id="Email")
	private WebElement Email;
	
	@FindBy(id="Password")
	private WebElement passw;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirm;
	
	@FindBy(id="register-button")
	private WebElement reg_btn;


	public Pomclass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void reg_link()
	{
		reg.click();
	}
	
	public void gender()
	{
		maleRadio.click();
	}
	
	public void firstname(String first)
	{
		first_Name.sendKeys(first);
	}
	
	public void lastname(String last)
	{
		last_Name.sendKeys(last);
	}
	
	public void mail(String email)
	{
		Email.sendKeys(email);
	
	}
	
	public void password(String pass)
	{
		passw.sendKeys(pass);
	}
	
	public void con_pass(String cpass)
	{
		confirm.sendKeys(cpass);
	}
	
	public void regbtn()
	{
		reg_btn.click();
	}
}
