import java.util.Scanner;

public class Menu implements Menu_select{
	
	public static Scanner input = new Scanner(System.in);
	public static personManager pm = new personManager();
	
	public static int MenuInput() throws MenuSelectException{
		int sel = input.nextInt();
		if(sel > 4 || sel < 1) {
			new MenuSelectException();
			
		}
		return sel;
	}
	
	public static void selectMenu() throws MenuSelectException {
		int sel = MenuInput();
		
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
