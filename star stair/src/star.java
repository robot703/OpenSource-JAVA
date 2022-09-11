
public class star {

	public static void main(String[] args) {
		int i=0,o=3, q=1;
		int j=0;
		int n=0, m=1, b=6;
		
		for(i=0;i<4;i++) {
			for(j=0;j<o;j++)
				System.out.print(" ");
			
			for(n=0;n<m;n++) {
				System.out.print("*");
				
			}
			for(j=0;j<o;j++)
				System.out.print(" ");
			m=m+2;
			--o;
			System.out.print("\n");
			
		}
		
		for(i=0;i<3;i++) {
			for(j=0;j<q;j++)
				System.out.print(" ");
			
			for(n=1;n<b;n++) {
				System.out.print("*");
				
			}
			for(j=0;j<q;j++)
				System.out.print(" ");
			b=b-2;
			q=q+1;
			System.out.print("\n");
			
		}
	}
}