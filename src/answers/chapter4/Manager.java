package answers.chapter4;

public class Manager extends Employee {
	protected int bonus;  // ���ʽ�

	// ������ �޼ҵ�
	public Manager (String name, int salary, int bonus)
	{
		super(name, salary);
		this.bonus = bonus;
	}

	// ���ʽ��� ��ȯ�Ѵ�
	public int getBonus()
	{
		return bonus;
	}

	// �޿��� �ø���
	public int raiseSalary()
	{
		int increased_salary;
		increased_salary = (int)(salary * 1.2);
		return increased_salary;
	}
	// ��ü�� �� ���¸� ��ȯ�Ѵ�.	
	public String showInfo() {
		String result=super.showInfo();
		result+="\n���ʽ�:"+bonus;
		return result;
	}

}


