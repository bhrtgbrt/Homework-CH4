

public class p24 {

	public static void main(String[] args)
	{
		Car24 car = new Car24();
		
		car.setCar(1234, 20.5);
		System.out.println(car);
	}
	
}
class Car24
{
	protected int num;
	protected double gas;
	
	public Car24()
	{
		num= 0;
		gas= 0.0;
		System.out.println("生產了車子");
	}
	
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為:"+ this.num +"，汽油量設為"+ this.gas);
	}
	
	public String toString()
	{
		String str = "車號為"+ num +"汽油量:"+ gas;
		return str;
	}
}
