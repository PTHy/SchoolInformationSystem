import java.util.Scanner;

public class stuDGSW{
	public static void showMenu() {
		System.out.println("1. ������ �Է�");
		System.out.println("2. ���α׷� ����");
	}
	
	public static void readData() {
		Scanner sc = new Scanner(System.in);
		int sel, sNum;
		String sName;
		System.out.print("���� >>");
		sel = sc.nextInt();
		
		if(sel == 2) {
			System.out.println("���α׷��� ����Ǿ����ϴ�.");
			System.exit(0);
		}else if(sel == 1){
			System.out.print("�й� : ");
			sNum = sc.nextInt();
			System.out.print("�̸� : ");
			sName = sc.next();
			PersonInfo person = new PersonInfo(sNum, sName);
			System.out.println("\n");
			person.ShowPersonInfo();
		}
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("====DGSW �л������ý���====");
			showMenu();
			readData();
		}
	}
}
