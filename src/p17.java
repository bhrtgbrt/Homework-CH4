
public class p17 {

	public static void main(String[] args)
	{
		Car17 cars[];
		cars = new Car17[2];
		
		cars[0] = new Car17();
		cars[0].setCar(1234, 20.5);
		
		cars[1] = new RacingCar17();
		cars[1].setCar(4567, 30.5);
		
		for(int i = 0; i<cars.length; i++)
			cars[i].show();
	}
	
}
class Car17
{
	protected int num;
	protected double gas;
	
	public Car17()
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
	
	public void show()
	{
		System.out.println("車號是:"+this.num);
		System.out.println("汽油量是:"+this.gas);
	}
}
class RacingCar17 extends Car17
{
	private int course;
	
	public RacingCar17()
	{
		course  = 0;
		System.out.println("生產了賽車");
	}
	
	public void setCourse(int c)
	{
		course = c;
		System.out.println("將賽車號碼設為:"+this.course);
	}
	public void show()
	{
		System.out.println("賽車車號是:"+this.num);
		System.out.println("汽油量是:"+this.gas);
		System.out.println("賽車號碼是:"+this.course);
	}
}