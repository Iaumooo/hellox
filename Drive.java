package traffic;

import java.util.Scanner;

public class Drive {
	public static void main (String[] args) {	
		 Scanner in=new Scanner(System .in);
		 System.out.println("�����������:");
		 String beginplace=in.nextLine();
		 System .out.println("������Ŀ�ĵ�");
		 String overplace=in.nextLine();
		 Car a=new Car(overplace, 0, 0);
		 a.time();
		 a.price();
		Highway b=new Highway(overplace, 0, 0);
		b.time();
		b.price();
		Plane c=new Plane(overplace, 0, 0);
		c.time();
		c.price();
		
	}
}
