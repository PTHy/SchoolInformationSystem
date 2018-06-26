import java.util.Scanner;

public class stuDGSW{
	
	public static void main(String[] args) throws MenuSelectException {
		Menu menu = new Menu();
		
		while(true) {
			menu.ShowMenu();
			menu.selectMenu();
		}
	}
}
