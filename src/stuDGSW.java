import java.util.Scanner;

public class stuDGSW{
	public static void showMenu() {
		System.out.println("1. 데이터 입력");
		System.out.println("2. 프로그램 종료");
	}
	
	public static void readData() {
		Scanner sc = new Scanner(System.in);
		int sel, sNum;
		String sName;
		System.out.print("선택 >>");
		sel = sc.nextInt();
		
		if(sel == 2) {
			System.out.println("프로그램이 종료되었습니다.");
			System.exit(0);
		}else if(sel == 1){
			System.out.print("학번 : ");
			sNum = sc.nextInt();
			System.out.print("이름 : ");
			sName = sc.next();
			PersonInfo person = new PersonInfo(sNum, sName);
			System.out.println("\n");
			person.ShowPersonInfo();
		}
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("====DGSW 학생정보시스템====");
			showMenu();
			readData();
		}
	}
}
