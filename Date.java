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
			 int month=cal.get(Calendar.MONTH);  //ϵͳ��ǰ�·�
			 int day=cal.get(Calendar.DATE);//ϵͳ��ǰ��
			// System.out.println(month+"��"+day+"��");
			 return month+"��"+day+"��";
		}
	 public static int  GetDate(int a,int b) {
		 Calendar cal=Calendar.getInstance();
		 int month=cal.get(Calendar.MONTH);  //ϵͳ��ǰ�·�
		 int day=cal.get(Calendar.DATE);//ϵͳ��ǰ��
		// System.out.println(month+"��"+day+"��");
		 return month;
	}
	 
	 public static int GetDate(int a) {
		 Calendar cal=Calendar.getInstance();
		 int month=cal.get(Calendar.MONTH);  //ϵͳ��ǰ�·�
		 int day=cal.get(Calendar.DATE);//ϵͳ��ǰ��
		// System.out.println(month+"��"+day+"��");
		 return day;
		 
	}
	
//	public static void main(String[] args) {
//		 System.out.println("���");
//		// Date date=new Date();
//		//date .GetDate();
//		GetDate();//���������е���GetDate��̬����
//		
//	}

	
}
