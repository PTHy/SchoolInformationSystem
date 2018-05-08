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
			System.out.println("프로그램을 종료합니다...");
			System.exit(0);
			break;
		default : 
			System.out.println("잘못된 입력입니다.");
			break;
		}
	}
	
	public static void ShowMenu() {
		System.out.println("====DGSW 학생정보시스템====");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.print("선택 >>");
	}
}
