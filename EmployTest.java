class Employee {
	String name;
	String no;
	String dept;

	public Employee() {
		name = "�̸�����";
		no = "�ӽû��";
		dept = "�ӽúμ�";
		System.out.println("���ھ��� ������ ȣ���!!!");
	}

	public Employee(String na, String n, String d) {
		name = na;
		no = n;
		dept = d;
	}

	public String toString() {

		return name + "," + no + "," + dept;
	}
}

public class EmployTest {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee("ȫ�浿", "101", "��ȹ");

		System.out.println(e1);
		System.out.println(e2);
	}
}
