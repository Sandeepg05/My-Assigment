package week1.day1;

public class Mobile {

	 public void makeCall() {
		 String mobileModel = "Samsung";
		 System.out.println("mobileModel = "+ mobileModel);
		 float mobileWeight= 10.2f;
		 System.out.println(mobileWeight);
		  }
	 public void sendMsg() {
		 // boolean yes = false;
		boolean isFullCharge = true;
		System.out.println(isFullCharge);
		 int mobileCost = 50000;
		 System.out.println(mobileCost);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Mobile phone=new Mobile();
		phone.makeCall();
		phone.sendMsg();
       System.out.println("This is my mobile");
	}

}
