
public class FazBaz {

	public static void main(String[] args) {
	
		for(int i=1; i<=100; i++) 
		{
			if(i%15==0)
			{
				System.out.println("FazBaz");
			}
			else if (i%5==0)
			{
				System.out.println("Baz");
			}
			else if(i%3==0 )
			{
				System.out.println("Faz");
			}
			else 
			{
				System.out.println(i);
			}
		}

	}

}
