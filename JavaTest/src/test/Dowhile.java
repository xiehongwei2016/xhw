package test;

public class Dowhile {

	public static void main(String[] args) {
//		int i = 5;
//		do {
//			System.out.print(i);
//		} while (--i>5);
//		System.out.print("finished");
		
		
		// 计算a + a*a + a*a*a + a*a*a*a + n个a相乘.......
		int a=2;	//待计算值
		int n=5;	//个数
		int sum=0;	//存当前结果
		int temp = a;	//存第N个n个a相乘的结果
		for(int i=1;i<=n;i++){
			sum += temp;
			temp *=a;
		}
		System.out.println(sum);
		
		// 计算b + bb + bbb + bbb + n个b.......
		int b=2;	//待计算值
		int m=5;	//个数
		int sum1=0;	//存当前结果
		int temp1 = b;	//存第N个n个a的结果
		for(int i=1;i<=m;i++){
			sum1 += temp1;
			temp1 = temp1 * 10 + b;
		}
		System.out.println(sum1);
		
		
	}
	
}
