public class StudentDemo {

	public static void main(String[] args) {
		//����һ�������洢ѧ����Ϣ�����飬ʵ��˳��洢��
		Student[] student = new Student[4];
		//����4λѧ��������˳��洢ʵ�֡�
		student[0] = new Student("20100001", "����", 18);
		student[1] = new Student("20100002", "����", 19);
		student[2] = new Student("20100003", "����", 18);
		student[3] = new Student("20100004", "�ط�", 17);

		System.out.println("ѧ��" + "\t" + "\t" + "����" + "\t" + "����");
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].toString());
		}
	}
}
//ѧ���࣬����ѧ����������ѧ�ţ�����������
class Student {
	String sID = "";
	String sName = "";
	int sAge = 0;

	public Student(String sID, String sName, int sAge) {
		this.sID = sID;
		this.sName = sName;
		this.sAge = sAge;
	}

	@Override
	public String toString() {
		String temp = this.sID + "\t" + this.sName + "\t" + this.sAge;
		return temp;
	}

}

//ѧ������࣬��ʽ�洢ʱҪ�õ���
class StudentNode {
	Student data;
	StudentNode next;
}