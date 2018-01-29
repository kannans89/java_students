
public class Test {
	
	public static void main(String[] args) {
		if(args.length==0)
		{
			System.out.println("Pass commandline arguments");
			return;
		}
            for(String name:args)
            {   
            	System.out.println(args.length);
            	
            	System.out.println("Hello " + name);
            }
	}

}


