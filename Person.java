package wages;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import wages.Staff.Mannger;
import wages.Staff.Partner;
 
public class Person {
	  String name;
	  int pay;
	  String birthday;
	  static int money1=0;
	   static int money2;
	   static int money4;
	Person(String name ,int pay,String birthday){
		this.name=name;
		this.pay=pay;
		this.birthday=birthday;
	}
	public static boolean present() {
		if(Date.GetDate().equals(Staff.staffnumber())) {
		System.out.println("present");
		return true;
		}
		return false;
	}
	public static boolean pay() {
		
			if(Date.GetDate(Calendar.DATE)==15) {
				return true;	
			}
			//System.out.println("Ա������Ϊ1000");
			return false;
					
	}
	
	public static void main(String[] args) {
		
		
		
		Date.GetDate();
		Date.GetDate(1);
		Date.GetDate(1, 2);
		pay();
		present();
		Staff.staffnumber();
		
		Mannger.manngerpay();
		Partner.fenhong();
		

	}

}
class Staff extends Person{
		Staff(String name,int pay,String birthday){
			super(name,pay,birthday);
		  }
		public static int staffnumber() {
		  //�������Ա����ź�Ա������
		  Random random=new Random();
		  Random rndMonth=new Random();
		  Random rndDay=new Random();
		 
		  Set<String>set=new HashSet<>();
		  int number=random.nextInt();
		  for(int i=0;i<set.size();i++) {
			 int money3= (int)(Math.random()*1000+1000);
			 set.add(number+"��"); 
			int month=rndMonth.nextInt(12)+1;
			int day=rndDay.nextInt(30)+1;
			set.add(month+"��"+day+"��");
			money1=money1+money3;
			//return month+"��"+day+"��";
		  	}
		 return money1;
		  
		}

 static class Mannger extends Person{
	     
	  Mannger(String name,int pay,String birthday)
	  {
		  super(name,pay,birthday);
	  }	  
	  public static  void manngerpay() {
		  Scanner in=new Scanner(System.in); 	 
		  
		  System.out.println("�����뾭������");String name=in.nextLine();
		 
		  System.out.println("�����뾭����"); 
		  money4=in.nextInt();
		  
		  System.out.println("�����뾭����"); 
		  money2=in.nextInt();
		  
		  System.out.println("�����ʺͽ���Ϊ:"+(money2+money4));
		  //return money2+money4;//"��������"+"������"+"������";		  
	  }
	  
	  	  
}
 static class Partner extends Person{
	Partner(String name,int pay,String birthday){
		super(name,pay,birthday);
	}		
	public static void  fenhong() {
		int sum=(int)(Math.random()*1000000+1000000);
		if(Date.GetDate(1, 2)==12) {
			//Random ran=new Random();
			//Mannger b=new Mannger();
			int a=(int)((sum-money2-money4-money1)*0.1);
			System.out.println("������Ϊ"+sum);
			
			System.out.println("�ɶ��ֺ�Ϊ"+a);
			//return a;
			
		}
		//return 0;
			
		}
	}
}	

		
		
		
		
		
		
	
