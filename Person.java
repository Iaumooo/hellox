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
			//System.out.println("员工工资为1000");
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
		  //随机生成员工编号和员工生日
		  Random random=new Random();
		  Random rndMonth=new Random();
		  Random rndDay=new Random();
		 
		  Set<String>set=new HashSet<>();
		  int number=random.nextInt();
		  for(int i=0;i<set.size();i++) {
			 int money3= (int)(Math.random()*1000+1000);
			 set.add(number+"号"); 
			int month=rndMonth.nextInt(12)+1;
			int day=rndDay.nextInt(30)+1;
			set.add(month+"月"+day+"日");
			money1=money1+money3;
			//return month+"月"+day+"日";
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
		  
		  System.out.println("请输入经理姓名");String name=in.nextLine();
		 
		  System.out.println("请输入经理工资"); 
		  money4=in.nextInt();
		  
		  System.out.println("请输入经理奖金"); 
		  money2=in.nextInt();
		  
		  System.out.println("经理工资和奖金为:"+(money2+money4));
		  //return money2+money4;//"经理姓名"+"经理工资"+"经理奖金";		  
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
			System.out.println("总收入为"+sum);
			
			System.out.println("股东分红为"+a);
			//return a;
			
		}
		//return 0;
			
		}
	}
}	

		
		
		
		
		
		
	
