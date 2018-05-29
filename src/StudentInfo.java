
public class StudentInfo extends PersonInfo{
	
	private String major;
	private int year;
	
	public StudentInfo(int sNum,String sName,String major,int year) {
		super(sNum,sName);
		this.major = major;
		this.year = year;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void ShowPersonInfo() {
		super.ShowPersonInfo();
		System.out.println("전공 : "+this.major);
		System.out.println("학년 : "+this.year);
	}
}
