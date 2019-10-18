package bit.org.Mysql;

public class Student {
	private String name;
	private int sno;
	private int age;
	private String major;
	public String getName() {
		return name;
	}
	public int getSno() {
		return sno;
	}
	public int getAge() {
		return age;
	}
	public String getMajor() {
		return major;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", sno=" + sno + ", age=" + age + ", major=" + major + "]";
	}
}
