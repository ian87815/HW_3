package test_27;

public class p27 {
	public static void main(String[] args)
	{
		Car car1;
		car1=new Car();
		car1.show();
		
		Car car2;
		car2=new Car(1234,20.5);
		car2.show();
	}
}

class Car
{
	private int num;
	private double gas;
	
	public Car()
	{
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public Car(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+",�N�T�o�q�]��"+gas);
	}
	
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}
