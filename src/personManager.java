import java.util.Scanner;

public class personManager {
	final int MAX_CNT = 100;
	static Scanner sc = new Scanner(System.in);
	PersonInfo[] personInfos = new PersonInfo[MAX_CNT];
	//�迭�� ����
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

		System.out.print("�й� : ");
		sNum = sc.nextInt();
		System.out.print("�̸� : ");
		sName = sc.next();
		personInfos[cnt] = new PersonInfo(sNum, sName);
		personInfos[cnt].ShowPersonInfo();
		System.out.println("������ �Է� �Ϸ�");
		cnt++;
	}

	public void searchData() {
		System.out.print("�˻��� ���Ի��� �й��� �Է��ϼ��� : ");
		int sNum = sc.nextInt();
		
		int chk = search(sNum);

		if (chk == -1) {
			System.out.println("�ش� �����Ͱ� �������� �ʽ��ϴ�..!");
			return;
		}
		else {
			personInfos[chk].ShowPersonInfo();
			System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�...");
		}
	}

	public void deleteData() {
		System.out.println("������ �й��� �Է��ϼ��� : ");
		int sNum = sc.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			if(personInfos[i].getsNum() == sNum) {
				personInfos[i] = null;
				for(int j = i+1; j < cnt; j ++) {
					personInfos[j-1] = personInfos[j];
				}
				System.out.println("����");
				System.out.println("������ ���� �Ϸ� "+sNum);
				cnt--;
			}
		}
	}
}
