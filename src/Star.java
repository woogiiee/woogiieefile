
public class Star {
	public static void main(String[] args) {
		star(0);
		starfour(0);
	}
	public static void star(int num) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	public static void starfour(int num2) {
		for(int s=1;s<=4;s++) {
			for(int t=1;t<=s;t++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
}	
