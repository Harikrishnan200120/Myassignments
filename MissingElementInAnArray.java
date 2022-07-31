package week2.day3;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,7,6,8};
		int sumwithoutmiss=0;{
		for (int i=1;i<=8;i++) {
			sumwithoutmiss=sumwithoutmiss+i;
			
		}
		int sumwithmiss=0;

		for(int e:a) {
			sumwithmiss=sumwithmiss+e;
			
		}
		System.out.println (" The missing element in an array:"+(sumwithoutmiss-sumwithmiss));

		}
	}
}
	

