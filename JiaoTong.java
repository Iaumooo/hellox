package traffic;

import java.util.Scanner;

public abstract class JiaoTong {
	String vehicle;
	static double distance;
	static int arrivetime=10;
	static int backtime=10;
	static int  tickettime=10;
	static int cheaktime=10;
	static int waittime=10;
	public  JiaoTong(double distance,int arrivetime,int backtime,int tickettime,int cheaktime,int waittime) {
		this.arrivetime=arrivetime;
		this.backtime=backtime;
		this.tickettime=tickettime;
		this.cheaktime=cheaktime;
		this.waittime=waittime;
		this.distance=distance;	
		}

	double speed;
	double price;
	public JiaoTong(int speed,double price) {		
		this.speed=speed;
		this.price=price;
	}
		public JiaoTong(String vehicle){
		this.vehicle=vehicle;	
	}
	public abstract double time();//�����෽���������ĵ�ʱ��ͼ۸�
	public abstract double price();
	
//	public int Time() //ʵ�����������ó����෽�����
//	{
//		return time();
//	}
//	public double Price()
//	{
//		return price();
//	}
		
}

 class Car extends JiaoTong{
	
	Car(String vehicle,int speed,double price){
		super ( speed,price);
		this.speed=80.0;
		this.price=0.32;	
		}
		 public  double time() {
			 Scanner in =new Scanner (System.in);
			 System.out.println("���������");
			  distance=in.nextDouble();
			  System.out.println("��������Ҫ��ʱ��Ϊ:"+(arrivetime+backtime+tickettime+cheaktime+waittime+distance/speed));
			return arrivetime+backtime+tickettime+cheaktime+waittime+(distance/speed);
			
			
		}
		
		public double price() {
			System.out.println("����ҪǮΪ:"+distance*price);
			return distance*price;
			
		}
		
}
 class Highway extends JiaoTong{
		
	 Highway(String vehicle,int speed,double price){
			super ( speed,price);
			this.speed=200.0;
			this.price=0.45;	
			}
			 public  double time() {
				 Scanner in =new Scanner (System.in);
				 System.out.println("���������");
				  distance=in.nextDouble();
				  System.out.println("��������Ҫ��ʱ��Ϊ:"+(arrivetime+backtime+tickettime+cheaktime+waittime+distance/speed));
				return arrivetime+backtime+tickettime+cheaktime+waittime+(distance/speed);
				
				
			}
			
			public double price() {
				System.out.println("����ҪǮΪ:"+distance*price);
				return distance*price;
				
			}
			
	}	
 class Plane extends JiaoTong{
		
	 Plane(String vehicle,int speed,double price){
			super ( speed,price);
			this.speed=400.0;
			this.price=0.75;	
			}
			 public  double time() {
				 Scanner in =new Scanner (System.in);
				 System.out.println("���������");
				  distance=in.nextDouble();
				  System.out.println("�ɻ�����Ҫ��ʱ��Ϊ:"+(arrivetime+backtime+tickettime+cheaktime+waittime+distance/speed));
				return arrivetime+backtime+tickettime+cheaktime+waittime+(distance/speed);
				
				
			}
			
			public double price() {
				System.out.println("����ҪǮΪ:"+distance*price);
				return distance*price;
				
			}
			
	}	


