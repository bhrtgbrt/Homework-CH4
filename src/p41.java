
public class p41 {
	public static void main(String[] args)
	{
		Car41 car = new Car41(1234, 20.5);
		car.vshow();
		car.mshow();
	}
	
}
interface Vehicle41
{
	void vshow();
}

interface Material
{
	void mshow();
}

class Car41 implements Vehicle41, Material
{
	private int num;
	private double gas;
	
	
	public Car41(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為:"+ this.num +"，汽油量設為"+ this.gas);
	}
	public void vshow()
	{
		System.out.println("車號是:"+this.num);
		System.out.println("汽油量是:"+this.gas);
	}
	public void mshow()
	{
		System.out.println("材質是鐵");
	}
}