package test;

public class Dowhile {

	public static void main(String[] args) {
//		int i = 5;
//		do {
//			System.out.print(i);
//		} while (--i>5);
//		System.out.print("finished");
		
		
		// ����a + a*a + a*a*a + a*a*a*a + n��a���.......
		int a=2;	//������ֵ
		int n=5;	//����
		int sum=0;	//�浱ǰ���
		int temp = a;	//���N��n��a��˵Ľ��
		for(int i=1;i<=n;i++){
			sum += temp;
			temp *=a;
		}
		System.out.println(sum);
		
		// ����b + bb + bbb + bbb + n��b.......
		int b=2;	//������ֵ
		int m=5;	//����
		int sum1=0;	//�浱ǰ���
		int temp1 = b;	//���N��n��a�Ľ��
		for(int i=1;i<=m;i++){
			sum1 += temp1;
			temp1 = temp1 * 10 + b;
		}
		System.out.println(sum1);
		
		
	}
	
}
