
public class CompanyInfo extends PersonInfo{

	private String company;
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public CompanyInfo(int sNum,String sName,String company) {
		super(sNum,sName);
		this.company = company;
	}
	
	public void ShowPersonInfo() {
		super.ShowPersonInfo();
		System.out.println("È¸»ç : "+this.company);
	}
}
