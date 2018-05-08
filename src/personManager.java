import java.util.Scanner;

public class personManager {
	final int MAX_CNT = 100;
	static Scanner sc = new Scanner(System.in);
	PersonInfo[] personInfos = new PersonInfo[MAX_CNT];
	//배열의 길이
	int cnt = 0;

	public int search(int sNum) {
		for (int i = 0; i < cnt; i++) {
			if (personInfos[i].sNum == sNum) {
				return i;
			}
		}
		return -1;
	}

	public void inputData() {
		String sName;
		int sNum;

		System.out.print("학번 : ");
		sNum = sc.nextInt();
		System.out.print("이름 : ");
		sName = sc.next();
		personInfos[cnt] = new PersonInfo(sNum, sName);
		personInfos[cnt].ShowPersonInfo();
		System.out.println("데이터 입력 완료");
		cnt++;
	}

	public void searchData() {
		System.out.print("검색할 신입생의 학번을 입력하세요 : ");
		int sNum = sc.nextInt();
		
		int chk = search(sNum);

		if (chk == -1) {
			System.out.println("해당 데이터가 존재하지 않습니다..!");
			return;
		}
		else {
			personInfos[chk].ShowPersonInfo();
			System.out.println("데이터 검색이 완료되었습니다...");
		}
	}

	public void deleteData() {
		System.out.println("삭제할 학번을 입력하세요 : ");
		int sNum = sc.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			if(personInfos[i].getsNum() == sNum) {
				personInfos[i] = null;
				for(int j = i+1; j < cnt; j ++) {
					personInfos[j-1] = personInfos[j];
				}
				System.out.println("삭제");
				System.out.println("데이터 삭제 완료 "+sNum);
				cnt--;
			}
		}
	}
}
