package basics;

public class evenodd {

	public static void main(String[] args) {
		int num=678;
		boolean flag=((num&1)==0)?true:false;
		if(flag)
		{
			System.out.println(+num+"is even number");
		}
		else
		{
			System.out.println(+num+"is odd number");
		}
	}

}
