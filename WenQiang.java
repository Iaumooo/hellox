package XZA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class WenQiang {
	
	public Master master;
	 public Player player;
	 public WenQiang() {//��master��player���г�ʼ��
		 player=null;
		 master=null;
	 }
	
	public static void main(String[] args) {
		System.out.println("��ѡ��:��Ӹ���:add,���Ż�鿴:piay,����:end");
		int j=0;
		while(j==0) {
			try {
				Scanner s=new Scanner(System.in);
				String str;
				String s1="add";
				String s2="play";
				String s3="end";
				while((str=s.nextLine())!=null) {
					if(str.equals(s1)) {
						Player player=new Player();
						player.addsong();
						System.out.println("sdf");
					}
					else if(str.equals(s2)) {
						Master master=new Master();
						master.play();
					}
					else if(str.equals(s3)) {
						System.out.println("���Ž���");
						break;
					}
				}
				j=1;
				
			}
			catch(Exception e) {
				System.out.println("����������:\n���");
				JOptionPane.showMessageDialog(null,"��ѡ��:��Ӹ���:add,���Ż�鿴:play,����:end");
			}
		}
				
	}

}

 class Song{
	 private String songname;
	 private String singer;
	 private double singtime;
	 public Song(String songname,String singer,double singtime){
         //��songname��singer��singtime���г�ʼ��
		 this.songname=songname;
		 this.singer=singer;
		 this.singtime=singtime;	 
	 }
	 public String Getsongname() {//Getsongname�����õ�������
		 return songname; 	 
		 
	 }
	 public String toString() {
	 StringBuffer s=new StringBuffer("");//StringBuffer
	 
	 s.append("������:"+songname+"ԭ������:"+singer+"����ʱ��:"+singtime);
	
	 //append��һ��������ĵ�����ϵͳ�������ڱ�ѡԪ�صĽ�β����Ȼ���ڲ�������ָ�����ݡ�
	 return s.toString();
	 }
 }
 class Player{
	 
	 public boolean addsong()
	 {
		 Scanner in=new Scanner(System.in); 
		 //��������Ϣ��
		 System.out.println("���������:");
		 String songname=in.nextLine();
		 System.out.println("����ԭ��������:");
		 String player=in.nextLine();
		 System.out.println("�������ʱ��:");
		 double singtime=in.nextDouble();
		 Song song= new Song(songname,player,singtime);
		 Master.listsong.add(song);//���û���ĸ�����ӵ��赥
		 return true;
		 
	 }
	 
	 
	 
 }
 class Master{
	 static List<Song>listsong;//�����б�
	 public Master()//���캯�� ��ʼ��list
	 {
		 listsong=new ArrayList<Song>();
	 }
	 public boolean play()//���Ÿ���
	 {
		 System.out.println("�赥:"+listsong.toString());
		 System.out.println("��˳�򲥷�/n ѡ�񲥷�/n");
		 Scanner in=new Scanner(System.in);
		 int a=in.nextInt();
		 if(a==1) {
			 System.out.println(listsong);
		 }

		 else if(a==2) {
			 System.out.println("��ѡ��Ҫ���ŵĸ���:");
			 //�ж���ѡ�ĸ����Ƿ��ڸ赥��
			 String string=in.nextLine();
			for(int i=0;i<listsong.size();i++) {
				if(string.equals(listsong.get(i).Getsongname())) {
					System.out.println(listsong.get(i));
					break;	
				}
				else {
					System.out.println("�Ҳ���������,������ѡ��:");	
					String str=in.nextLine();
				}
			}		
		}	 
	 	return true;
	 }
	 
 }
 
