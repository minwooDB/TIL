package Day6;

class Student {
	String name;
	String project;
	int age;

	void study() {
		System.out.println(name + "�л���" + project + "�� �н��մϴ�.");
	}

	String getStudentInfo() {
		return "�̸�: " + name + ",����:" + age;
	}
}

public class Object01 {
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "�Ѹ�";
		st1.project = "����";
		st1.age = 10;
		st1.study();
		System.out.println(st1.getStudentInfo());
		Student st2 = new Student();
		st2.name = "��ũ";
		st2.project = "����";
		st2.age = 24;
		st2.study();
		System.out.println(st2.getStudentInfo());
		System.out.println(st1);
		System.out.println(st2);

	}
}