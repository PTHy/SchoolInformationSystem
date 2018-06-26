
public class MenuSelectException extends Exception{
	public MenuSelectException() {
		System.out.println("잘못된 입력입니다. 1~4 사이에서 입력하세요");
		return;
	}
}
