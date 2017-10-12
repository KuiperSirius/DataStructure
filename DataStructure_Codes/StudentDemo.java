public class StudentDemo {

	public static void main(String[] args) {
		//定义一个用来存储学生信息的数组，实现顺序存储。
		Student[] student = new Student[4];
		//创建4位学生对象并用顺序存储实现。
		student[0] = new Student("20100001", "王红", 18);
		student[1] = new Student("20100002", "张明", 19);
		student[2] = new Student("20100003", "吴宁", 18);
		student[3] = new Student("20100004", "秦风", 17);

		System.out.println("学号" + "\t" + "\t" + "姓名" + "\t" + "年龄");
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].toString());
		}
	}
}
//学生类，定义学生的属性有学号，姓名，年龄
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

//学生结点类，链式存储时要用到。
class StudentNode {
	Student data;
	StudentNode next;
}