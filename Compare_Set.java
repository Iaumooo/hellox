package java_RuMen_KaiFa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Compare_Set {

	public static void main(String[] args) {
	Random random=new Random();	//建立一个生成随机数的对象	
	//Arraylist 线性存储，随机查询	
	
	List<Integer>list=new ArrayList<>();
	for(int i=1000;i<1000000;i+=50000) 
	{
		
		for(int j=0;j<=i;j++) 
			{
				list.add(j);
			}
		long time1=System.currentTimeMillis();//获取当前系统时间为time1（毫秒）
		random.nextInt(i);
		//list.contains(50000);//判断“”是否在集合里面
		list.contains(random.nextInt(i));
		long time2=System.currentTimeMillis();//获取当前系统时间time2
		long interval=time2-time1;
		System.out.println(interval);    //输出程序执行所需时间
	}
			
	Set<Integer>set=new HashSet<>();
	for(int i=1000;i<1000000;i+=50000)
	{
		
		for(int j=0;j<=i;j++)
		{
			set.add(j);
		}
		long time3=System.currentTimeMillis();
		random.nextInt(i);
		set.contains(random.nextInt(i));
		long time4=System.currentTimeMillis();
		long interval=time4-time3;
		System.out.println(interval);
	}

	
	
	Set<Integer>set1=new TreeSet<>();
	
for(int i=1000;i<1000000;i+=50000)
	
	{
		
		for(int j=0;j<=i;j++){
		
			set1.add(i);
			}
		long time5=System.currentTimeMillis();
	
		random.nextInt(i);
		set1.contains(random.nextInt(i));
		long time6=System.currentTimeMillis();
		long interval=time6-time5;
		System.out.println(interval);
	}
		
		
		
	}

}
