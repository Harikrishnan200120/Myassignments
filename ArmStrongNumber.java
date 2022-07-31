package week2.day2;

public class ArmStrongNumber {
public static void main(String[] args) {
	int number=153;
	int r=0,sum=0;
	int temp=number;
	
	while(temp>0) {
		r=temp%10;
		
		sum=sum+(r*r*r);
		temp=temp/10;
	}
	if(sum==number) {
		System.out.println("  Arm strong number:"+number);
	}
	else {
		System.out.println(" not an Arm strong number:"+number);
	}
}
}
