package clock;

public class nursery {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int bottle=99;
		int i;
		for(i=bottle;i>=0;i--)
		{
			if(i>2)
			{
				System.out.println(i+"botlles of beer on the wall,"+i+"bottles of beer.Take one dawn.Pass it around."
						+ (i-1)+"bottles of beer on the wall.");
		}
			if(i==2)
			{
		        System.out.println(i+"botlles of beer on the wall,"+i+"bottles of beer.Take one dawn.Pass it around."
				+ (i-1)+"bottle of beer on the wall.");
		}
			if(i==1)
			{
				System.out.println(i+"botlle of beer on the wall,"+i+"bottles of beer.Take one dawn.Pass it around."
						+ (i-1)+"bottle of beer on the wall.");
		}
		    if(i==0)
			{
		    	System.out.println("No more bottles of beer on the wall");
		}
	}
		
		
		
		
		
		
		
	}

}
