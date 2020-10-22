package answers.chapter6;


//�кλ��� ���Ѵ�

class UndergraduateStudent extends Student
{
	// ������ 
	public UndergraduateStudent(String name)
	{
		super(name);
	}

	// ������ ����Ѵ�
	public void computeGrade( )
	{
		if (score >= 70)
			grade = "���";
		else
			grade = "����";
	}
}

