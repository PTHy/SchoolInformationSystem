import java.util.Scanner;

public class Menu implements Menu_select{
	
	public static Scanner input = new Scanner(System.in);
	public static personManager pm = new personManager();
		
	public static void selectMenu() {
		int sel = input.nextInt();
		
		switch(sel) {
		case INSERT :
			pm.inputData();
			break;
		case SEARCH :
			pm.searchData();
			break;
		case DELETE :
			pm.deleteData();
			break;
		case EXIT :
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
