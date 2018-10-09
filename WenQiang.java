package XZA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class WenQiang {
	
	public Master master;
	 public Player player;
	 public WenQiang() {//对master和player进行初始化
		 player=null;
		 master=null;
	 }
	
	public static void main(String[] args) {
		System.out.println("请选择:添加歌曲:add,播放或查看:piay,结束:end");
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
						System.out.println("播放结束");
						break;
					}
				}
				j=1;
				
			}
			catch(Exception e) {
				System.out.println("请重新输入:\n添加");
				JOptionPane.showMessageDialog(null,"请选择:添加歌曲:add,播放或查看:play,结束:end");
			}
		}
				
	}

}

 class Song{
	 private String songname;
	 private String singer;
	 private double singtime;
	 public Song(String songname,String singer,double singtime){
         //对songname，singer，singtime进行初始化
		 this.songname=songname;
		 this.singer=singer;
		 this.singtime=singtime;	 
	 }
	 public String Getsongname() {//Getsongname方法得到歌曲名
		 return songname; 	 
		 
	 }
	 public String toString() {
	 StringBuffer s=new StringBuffer("");//StringBuffer
	 
	 s.append("歌曲名:"+songname+"原创歌手:"+singer+"歌曲时间:"+singtime);
	
	 //append是一个计算机文档操作系统函数，在被选元素的结尾（仍然在内部）插入指定内容。
	 return s.toString();
	 }
 }
 class Player{
	 
	 public boolean addsong()
	 {
		 Scanner in=new Scanner(System.in); 
		 //输入点歌信息；
		 System.out.println("输入歌曲名:");
		 String songname=in.nextLine();
		 System.out.println("输入原创歌手名:");
		 String player=in.nextLine();
		 System.out.println("输入歌曲时长:");
		 double singtime=in.nextDouble();
		 Song song= new Song(songname,player,singtime);
		 Master.listsong.add(song);//将用户点的歌曲添加到歌单
		 return true;
		 
	 }
	 
	 
	 
 }
 class Master{
	 static List<Song>listsong;//歌曲列表
	 public Master()//构造函数 初始化list
	 {
		 listsong=new ArrayList<Song>();
	 }
	 public boolean play()//播放歌曲
	 {
		 System.out.println("歌单:"+listsong.toString());
		 System.out.println("按顺序播放/n 选择播放/n");
		 Scanner in=new Scanner(System.in);
		 int a=in.nextInt();
		 if(a==1) {
			 System.out.println(listsong);
		 }

		 else if(a==2) {
			 System.out.println("请选择要播放的歌曲:");
			 //判断所选的歌曲是否在歌单中
			 String string=in.nextLine();
			for(int i=0;i<listsong.size();i++) {
				if(string.equals(listsong.get(i).Getsongname())) {
					System.out.println(listsong.get(i));
					break;	
				}
				else {
					System.out.println("找不到歌曲名,请重新选择:");	
					String str=in.nextLine();
				}
			}		
		}	 
	 	return true;
	 }
	 
 }
 
