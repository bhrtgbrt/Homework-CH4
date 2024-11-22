
public class p25 {

	public static void main(String[] args)
	{
		Car25 car1 = new Car25();
		Car25 car2 = new Car25();
		
		Car25 car3;
		car3 = car1;
		
		System.out.println("car1跟car2一樣"+ car1.equals(car2));
		System.out.println("car1跟car3一樣"+ car1.equals(car3));
	}
	
}
class Car25
{
	protected int num;
	protected double gas;
	
	public Car25()
	{
		num= 0;
		gas= 0.0;
		System.out.println("生產了車子");
	}
}
