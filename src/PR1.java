
//		int k =70;
//		int m = 60;
//		int e = 70;
//		int sum = k + m +e;
//		int ave = (k+m+e)/3;
//		System.out.println(sum);
//		System.out.println(ave);
//		
//		
//		int score = 80;
//		if(score>66) {
//			System.out.println("��");
//		}
//		else if((score>55) && (score<=66)) {
//			System.out.println("��");
//		}	
//		else if((score>45)&&(score<=55)) {
//			System.out.println("��");
//		}
//		else if((score>35)&&(score<=45)) {
//			System.out.println("��");
//		}
//		else {
//			System.out.println("��");
//		}
//		int num = 0;
//		int count = 0;
//		
//		while((num++) < 100) {
//			if(((num%5) !=0)|| ((num%7) !=0)) 
//				continue; //5�� 7�� ��� �ƴϸ��� ������ �ǳʶٰ� ���� �̵�
//			count++;//5�� 7�� ����� ��츸 ���ؤ���
//			System.out.println(num);//5��7�� ����� ��츸 ����
//		}
//		System.out.println("count: "+count);

//������ ����
/*for(int i=1;i<10;i++) {
			
			for(int dan =1; dan<10; dan++) {
				if(dan%2!=0) {
					continue;
					
				}System.out.print(dan+"x"+i+"="+(dan*i)+"\t");
				
			}System.out.println();
*/
//�����
/*
 * for(int i=0;i<5;i++) { for(int j=0;j<5;j++) { System.out.print("*");
 * }System.out.println(); }
 */

/*for(int i=5;i<=9;i++) {
			for(int j=5;j<=i;j++) {
				System.out.print("*");
			}System.out.println();*/
/*for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
			System.out.print("*");
		}System.out.println();*/
/*
		  for(int i=1;i<=5;i++) {
		  
		  
		  for(int k=5;k>i;k--) { System.out.print(" "); } for(int j=1; j<=i;j++) {
		  System.out.print("*"); }System.out.println(); }
 */	
/*for(int i=0;i<=4;i++) {
			  
			for(int j=1; j<=i;j++) { 
				System.out.print(" ");
			} for(int k=5;k>i;k--) {
				System.out.print("*");
			  
			}System.out.println(); }
	}
}*/
public class PR1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 1;
//		int sum = 0;
//		
//		for(;;) {
//			sum = i+sum;
//			i+=2;
//			if(sum>1000) {
//				
//				break;		
//				
//			}
//		}System.out.println(sum);
//		System.out.println(i);
//		
	
		for(int dan=2;dan<10;dan+=2) {
			for(int i = 1;i<=2;i++) {
				System.out.println(dan+"X"+i+"="+(dan*i));
			}
			for(int j = 1;j<=4;j++) {
				System.out.println(dan+"X"+j+"="+(dan*j));
			}
		}
		
		
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		