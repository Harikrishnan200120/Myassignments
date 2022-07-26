package week2.day1;

public class AssignmentCalculator {
public void add() {
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
}
public void subraction() {
	int e=30;
	int f=15;
	int h=e-f;
	System.out.println(h);
}
public void multiple() {
	double i=10;
	double j=5;
	double m=i*j;
	System.out.println(m);
}
public void divide() {
	float x=20.67f;
	float y=13.08f;
	float z=x/y;
	System.out.println(z);
}
  public static void main(String[] args) {
	AssignmentCalculator calc=new AssignmentCalculator();
	calc.add();
	calc.subraction();
	calc.multiple();
	calc.divide();
}


}
