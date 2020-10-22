package answers.chapter6;


//���п����� ���Ѵ�

class GraduateStudent extends Student
{
	// ������
	public GraduateStudent(String name)
	{
		super(name);
	}

	// ������ ����Ѵ�
	public void computeGrade( )
	{
		if (score >= 80)
			grade = "���";
		else
			grade = "����";
	}
}