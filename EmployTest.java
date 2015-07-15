class Employee {
	String name;
	String no;
	String dept;

	public Employee() {
		name = "이름없음";
		no = "임시사번";
		dept = "임시부서";
		System.out.println("인자없는 생성자 호출됨!!!");
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
		Employee e2 = new Employee("홍길동", "101", "기획");

		System.out.println(e1);
		System.out.println(e2);
	}
}
