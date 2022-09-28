package com.log4j.lib;
import org.openqa.selenium.WebDriver;

public class Global 
{
	//stdrules:To Provide TestData & Objects related to whole application
	public WebDriver driver;
	//*************TestData*******
	
	public String url = "http://183.82.103.245//nareshit/login.php";
	public String un  = "nareshit";
	public String pw  = "nareshit";
	public String FN  = "selenium";
	public String LN  = "suresh";
	
	//*************Objects
	
	public String txt_loginname = "txtUserName";
	public String txt_password  = "txtPassword";
	public String btn_Login     = "Submit";
	public String link_logout   = "Logout";
	public String frm_empInf    = "rightMenu";
	public String btn_Add       = "//input[@value='Add']";
	public String txt_FN        = "txtEmpFirstName";
	public String txt_LN        = "txtEmpLastName";
	public String btn_Save      = "btnEdit";
	
	public String anyempClick="//*[@id=\"standardView\"]/table/tbody/tr[5]/td[3]/a";
	public String edit_btn="EditMain";
	public String first_name="Mahesh";
	public String last_name="Kumar";
	public String clicksave_btn="btnEditPers";
	
	public String select_empId="loc_code";
	public String enter_empId="loc_name";
	public String select_anyid="0012";
	public String click_searchbtn="//input[@value='Search']";
	public String click_checkedbox="chkLocID[]";
	public String delete_btn="//input[@value='Delete']";
	
	
	
	
	

	
	}
