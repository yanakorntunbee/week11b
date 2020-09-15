package week11b;

public class student{
  int id;
  String name;
  String grade;
  String subject;
	public student(){
		super();
		System.out.println("Default");
	}
	student(int a,String b){
		id = a;
		name = b;
	}

	student(int a,String b,String g){
		id = a;
		name = b;
		grade = g;
    }
	student(int a ,String b, String g,String s){
		id = a;
		name = b;
		grade = g;
		subject=s;
	}
	student(student s){
		id=s.id;
		name=s.name;
		grade=s.grade;
		subject=s.subject;
	}
	void display() {
		System.out.println(id+name+"   | "+grade+subject);
	}
	public static void main(String[]args) {
		student st1 = new student(1,". Mr.Jame Goshib ");
		student st2 = new student(2,". Mr.Rungrot     ","A+ ");
		student st3 = new student(3,". Mr.Tontakarn   ","S+ ","C-Program");
		student st4 = new student(st3);
		st1.display();
		st2.display();
		st3.display();
		st4.display();
		
	}
}