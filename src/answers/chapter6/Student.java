package answers.chapter6;

//�л��� ���Ѵ�

abstract class Student
{
	protected int type; // �кλ�(1), ���п���(2)
	protected String name; 	// �̸�
	protected int score; 	// ����
	protected String grade; // ����

	// ������ ����
	public Student (String name)
	{
		setName (name) ;
	}

	// �л������� ��ȯ�Ѵ�
	public int getType( )
	{
		return type ;
	}

	// �̸��� ��ȯ�Ѵ�
	public String getName( )
	{
		return name ;
	}

	// ������ ��ȯ�Ѵ�
	public int getScore( )
	{
		return score;
	}

	// ������ ��ȯ�Ѵ�
	public String getGrade( )
	{
		return grade ;
	}
	// ������ �־��� ������ �����Ѵ�
	public void setType (int type)
	{
		this.type = type ;
	}
	// �̸��� �־��� ������ �����Ѵ�
	public void setName (String name)
	{
		this.name = name ;
	}

	// ������ �־��� ������ �����Ѵ�
	public void setScore (int score)
	{
		this.score = score ;
	}

	// �߻� �޼ҵ�: ������ ����Ѵ�
	abstract public void computeGrade();

	// ��ü �� ���� ��ȯ
	public String showInfo() {
		String result="�Ҽ�\t�̸�\t����\t����\n";
		if(type==1)
			result += "�кλ�";
		else
			result += "���п���";
		result += "\t"+getName();
		result += "\t"+getScore();
		result += "\t"+getGrade();
		return result;
	}
}
