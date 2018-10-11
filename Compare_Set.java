package java_RuMen_KaiFa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Compare_Set {

	public static void main(String[] args) {
	Random random=new Random();	//����һ������������Ķ���	
	//Arraylist ���Դ洢�������ѯ	
	
	List<Integer>list=new ArrayList<>();
	for(int i=1000;i<1000000;i+=50000) 
	{
		
		for(int j=0;j<=i;j++) 
			{
				list.add(j);
			}
		long time1=System.currentTimeMillis();//��ȡ��ǰϵͳʱ��Ϊtime1�����룩
		random.nextInt(i);
		//list.contains(50000);//�жϡ����Ƿ��ڼ�������
		list.contains(random.nextInt(i));
		long time2=System.currentTimeMillis();//��ȡ��ǰϵͳʱ��time2
		long interval=time2-time1;
		System.out.println(interval);    //�������ִ������ʱ��
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
