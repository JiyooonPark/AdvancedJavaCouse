package answers.chapter4;

public class InheritanceTest {

	public static void main(String[] args) {
		// ��ü���� �����Ѵ�.
		Employee emp = new Employee("���浿", 100000);
		Manager mng = new Manager("��浿", 200000, 50000);
		Executive exc = new Executive("ȫ�浿", 400000, 100000, 100000);

		// �� ��ü�� �޿��� �ø���
		emp.raiseSalary();
		mng.raiseSalary();
		exc.raiseSalary();
		
		// ����� ����Ѵ�
		System.out.println("===Employee(����)===");
		System.out.println(emp.showInfo());
		System.out.println();
		
		System.out.println("===Manager(�Ŵ���)===");
		System.out.println(mng.showInfo());
		System.out.println();
	
		System.out.println("===Executive(�ӿ�)===");
		System.out.println(exc.showInfo());
		System.out.println();
	}
}


