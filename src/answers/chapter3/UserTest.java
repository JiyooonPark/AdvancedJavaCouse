package answers.chapter3;

import java.util.Scanner;


public class UserTest {
	public static void main(String args[]) {
		User[] list = new User[100];
		Scanner scanner = new Scanner(System.in);
		while (true) {
			User.show();
			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				System.out.print("id: ");
				String id = scanner.next();
				System.out.print("pw: ");
				String pw = scanner.next();
				list[User.cnt] = new User(id, pw);
				User.cnt++;
				break;
			case 2:
				for (int i=0;i<User.cnt; i++)
						System.out.println("{ " + list[i].id + ", " + list[i].pw + " }");
				System.out.println("�� ȸ������ "+User.cnt+"�� �Դϴ�.");
				break;
			case 3:
				System.out.println("Exit");
				System.exit(0);
				
			}
			
		}
			
	}
}