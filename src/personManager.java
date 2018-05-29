import java.util.Scanner;

public class personManager {
	final int MAX_CNT = 100;
	static Scanner sc = new Scanner(System.in);
	PersonInfo[] personInfos = new PersonInfo[MAX_CNT];
	//�迭�� ����
	int cnt = 0;

	public int search(int sNum) {
		for (int i = 0; i < cnt; i++) {
			if (personInfos[i].getsNum() == sNum) {
				return i;
			}
		}
		return -1;
	}
	
	public PersonInfo inputDataInfo() {
		String sName = null;
		int sNum = 0;
		System.out.print("�й� : ");
		sNum = sc.nextInt();
		System.out.print("�̸� : ");
		sName = sc.next();
		
		return new PersonInfo(sNum, sName);
	}
	
	public PersonInfo SchoolInputInfo() {
		String sName = null;
		int sNum = 0;
		String major;
		int year;
		System.out.print("�й� : ");
		sNum = sc.nextInt();
		System.out.print("�̸� : ");
		sName = sc.next();
		System.out.print("���� : ");
		major = sc.next();
		System.out.print("�г� : ");
		year = sc.nextInt();
		return new StudentInfo(sNum, sName, major, year);
		
	}
	
	public PersonInfo CompanyInputInfo() {
		String sName = null;
		int sNum = 0;
		String company;
		
		System.out.print("�й� : ");
		sNum = sc.nextInt();
		System.out.print("�̸� : ");
		sName = sc.next();
		System.out.print("ȸ�� : ");
		company = sc.next();
		return new CompanyInfo(sNum, sName,company);
	}
	
	public void inputData() {
		
		System.out.println("1.�Ϲ�	2.�б�	3.ȸ��");
		System.out.print("����>>");
		int sel = sc.nextInt();
		
		switch(sel) {
		case 1 :
			personInfos[cnt] = inputDataInfo();
			break;
		case 2 :
			personInfos[cnt] = SchoolInputInfo();
			break;
		case 3 :
			personInfos[cnt] = CompanyInputInfo();
			break;
		}
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
