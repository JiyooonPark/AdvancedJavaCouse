package answers.chapter4;

public class Employee {
	protected String name;	// �̸�
	protected int salary;// �޿�

	// ������ �޼ҵ�
	public Employee (String name, int salary)
	{
		this.name = name;
		this.salary = salary;
	}

	// �̸��� ��ȯ�Ѵ�
	public String getName()
	{
		return name;
	}

	// �޿��� ��ȯ�Ѵ�
	public int getSalary()
	{
		return salary;
	}

	// �޿��� �ø���
	public int raiseSalary()
	{
		int increased_salary;
		increased_salary = (int)(salary * 1.3);
		return increased_salary;
	}
	// ��ü�� �� ���¸� ��ȯ�Ѵ�.
	public String showInfo() {
		String result="\n�̸�:"+name;
		result+="\n�޿�:"+salary;
		result+="\n�λ�� �޿�:"+raiseSalary();		
		return result;
	}

}
