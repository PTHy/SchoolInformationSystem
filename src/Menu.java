import java.util.Scanner;

public class Menu {
	
	public static Scanner input = new Scanner(System.in);
	public static personManager pm = new personManager();
		
	public static void selectMenu() {
		int sel = input.nextInt();
		
		switch(sel) {
		case 1 :
			pm.inputData();
			break;
		case 2 :
			pm.searchData();
			break;
		case 3 :
			pm.deleteData();
			break;
		case 4 :
			System.out.println("���α׷��� �����մϴ�...");
			System.exit(0);
			break;
		default : 
			System.out.println("�߸��� �Է��Դϴ�.");
			break;
		}
	}
	
	public static void ShowMenu() {
		System.out.println("====DGSW �л������ý���====");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ������ �˻�");
		System.out.println("3. ������ ����");
		System.out.println("4. ���α׷� ����");
		System.out.print("���� >>");
	}
}
