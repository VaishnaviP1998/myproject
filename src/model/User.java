package model;

public class User 
{
  String Login;
  String Password;
  String CustomerName;
  String EmailId;
  String mobileNo;
  String adrress;
  String country;
  
  
  public boolean checkLogin()
  {
	  if(Login.equals("vaishnavi") && Password.equals("vaish"))
	  {
		  return true;
	  }
	  else {
		  return false;
	  }
  }
  
  public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		this.Login = login;
	}
	
	
	
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	  
	
	 public String getCustomerName() {
			return CustomerName;
		}

		public void setCustomerName(String customerName) {
			this.CustomerName = customerName;
		}
 

public String getEmailId() {
	return EmailId;
}
public void setEmailId(String emailId) {
	this.EmailId = emailId;
}



public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}



public String getAdrress() {
	return adrress;
}
public void setAdrress(String adrress) {
	this.adrress = adrress;
}



public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

}