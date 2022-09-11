
public class for안녕하세요 {

	public static void main(String[] args) {
		int i;
		int x;
		for(i=1;i<=9;i++) {
			System.out.println(i+"단\n");
			for(x=1;x<=9;x++) {
				if(x<=i)
					System.out.println(i+"x"+x+"="+i*x);
			}
		}
	}

	
}
