
public class p29 {

	public static void main(String[] args)
	{
		Vehicle[] vc = new Vehicle[2];
		vc[0] = new Car29(1234, 20.5);
		vc[0].setSpeed(60);
		
		vc[1] = new Plane(232);
		vc[1].setSpeed(500);
		
		for(int i = 0; i < vc.length; i++)
			vc[i].show();
	}
	
}
abstract class Vehicle
{
	protected int speed;
	public void setSpeed(int s)
	{
		speed = s;
		System.out.println("將速度設成"+ speed);
	}
	abstract void show();
}
class Car29 extends Vehicle
{
	private int num;
	private double gas;
	
	
	public Car29(int n, double g)
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

class Plane extends Vehicle
{
	private int flight;
	
	
	public Plane(int f)
	{
		flight = f;
		System.out.println("出現了班次為"+ this.flight +"的飛機");
	}
	public void show()
	{
		System.out.println("班次是:"+this.flight);
		System.out.println("速度是:"+this.speed);
	}
}