
public class p32 {
	public static void main(String[] args)
	{
		Vehicle32[] vc = new Vehicle32[2];
		
		vc[0] = new Car32(1234, 20.5);
		vc[1] = new Plane32(232);
		
		for(int i = 0; i < vc.length; i++)
		{
			if(vc[i]instanceof Car32)
				System.out.println("第"+ (i + 1) +"個物件是Car類別");
			else
				System.out.println("第"+ (i + 1) +"個物件不是Car類別");
		}
	}
	
}
abstract class Vehicle32
{
	protected int speed;
	
	public void setSpeed(int s)
	{
		speed = s;
		System.out.println("將速度設成"+ speed);
	}
	abstract void show();
}
class Car32 extends Vehicle32
{
	private int num;
	private double gas;
	
	
	public Car32(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為:"+ this.num +"，汽油量設為"+ this.gas);
	}
	public void show()
	{
		System.out.println("車號是:"+this.num);
		System.out.println("汽油量是:"+this.gas);
		System.out.print("速度是"+ this.speed);
	}
}

class Plane32 extends Vehicle32
{
	private int flight;
	
	
	public Plane32(int f)
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