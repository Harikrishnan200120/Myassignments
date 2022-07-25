package week1.day2;

public class Car {
    public void startCar() {
    	System.out.println("starCar");
    }
    	public void applyGear() {
    		System.out.println("applyGear");
    	}
    	public void switchOnAc(){
    		System.out.println("switchOnAc");
    	}
    	public void applyAccelete() {
    		System.out.println("applyAccelete");
    	}
        
        public static void main(String[] args) {
			Car car=new Car ();
			car.startCar();
			car.applyGear();
			car.switchOnAc();
			car.applyAccelete();
		}
		

}


    

