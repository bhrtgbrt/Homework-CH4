public class p6 {
	public static void main(String[] args)
	{
		RacingCar6 rccar1 = new RacingCar6(1234, 20.5, 5);
	}
	
}
class Car6
{
	private int num;
	private double gas;
	
	public Car6()
	{
		num= 0;
		gas= 0.0;
		System.out.println("車子出來了");
	}
	
	public Car6(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為:"+ this.num +"，汽油量為"+ this.gas);
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
class RacingCar6 extends Car6
{
	private int course;
	
	public RacingCar6()
	{
		course  = 0;
		System.out.println("生產了賽車");
	}
	
	public RacingCar6(int n, double g, int c)
	{
		super(n, g);
		course = c;
		System.out.println("生產了編號為"+ this.course +"的賽車");
	}
	
	public void setCourse(int c)
	{
		course = c;
		System.out.println("將賽車號號碼設為:"+this.course);
	}
}