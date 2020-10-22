package answers.chapter3;

class User {
	String id, pw;
	static int cnt;

	User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	static void show() {
		System.out.println("====================================");
		System.out.println("1. ȸ������");
		System.out.println("2. ȸ����ȸ");
		System.out.println("3. ����");
		System.out.println("====================================");
		System.out.print("��ȣ�� �Է��Ͻÿ�: ");

	}
}