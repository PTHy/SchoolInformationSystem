
public class PersonInfo {
	int sNum;
	String sName;
	public int getsNum() {
		return sNum;
	}
	public void setsNum(int sNum) {
		this.sNum = sNum;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	public PersonInfo(int sNum,String sName) {
		this.setsNum(sNum);
		this.setsName(sName);
	}
	
	public void ShowPersonInfo() {
		System.out.println("�й� : "+this.getsNum());
		System.out.println("�̸� : "+this.getsName());
	}
}
