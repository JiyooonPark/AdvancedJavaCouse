package answers.chapter4;
//�ӿ��� �𵨸��Ѵ�.
public class Executive extends Manager{
	private int stockOption;  // ���� �ɼ�

	// ������ �޼ҵ�
	public Executive (String name, int salary, int bonus, int stockOption)
	{
		super(name, salary, bonus);
		this.stockOption = stockOption;
	}

	// ���� �ɼ��� ��ȯ�Ѵ�
	public int getStockOption()
	{
		return stockOption;
	}

	// �޿��� �ø���
	public int raiseSalary()
	{
		int increased_salary;
		increased_salary = (int)(salary * 1.1);
		return increased_salary;
	}
	// ��ü�� �� ���¸� ��ȯ�Ѵ�.	
	public String showInfo() {
		String result=super.showInfo();
		result+="\n����ɼ�:"+stockOption;
		return result;
	}	

}
