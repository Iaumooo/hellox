package wages;

import java.util.Calendar;

public class Date {
	private int Month;
	private int Day;
	Date(){
		this.Month=0;
		this.Day=0;
	}
	 public static String GetDate() {
			 Calendar cal=Calendar.getInstance();
			 int month=cal.get(Calendar.MONTH);  //系统当前月份
			 int day=cal.get(Calendar.DATE);//系统当前日
			// System.out.println(month+"月"+day+"日");
			 return month+"月"+day+"日";
		}
	 public static int  GetDate(int a,int b) {
		 Calendar cal=Calendar.getInstance();
		 int month=cal.get(Calendar.MONTH);  //系统当前月份
		 int day=cal.get(Calendar.DATE);//系统当前日
		// System.out.println(month+"月"+day+"日");
		 return month;
	}
	 
	 public static int GetDate(int a) {
		 Calendar cal=Calendar.getInstance();
		 int month=cal.get(Calendar.MONTH);  //系统当前月份
		 int day=cal.get(Calendar.DATE);//系统当前日
		// System.out.println(month+"月"+day+"日");
		 return day;
		 
	}
	
//	public static void main(String[] args) {
//		 System.out.println("你好");
//		// Date date=new Date();
//		//date .GetDate();
//		GetDate();//在主函数中调用GetDate静态方法
//		
//	}

	
}
