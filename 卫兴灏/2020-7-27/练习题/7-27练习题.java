package Test;


public class Test {
	public static void main(String[] args) {
		//test1();
		//test2(4);
		//test3();
		//test4();
		//test5();
//		test6();
		//test7();
		//test8();
//		test9();
		test10();
	}
	/*
		һ��&��|������&&��||��ʲô����
		1��& | λ�롢λ�� 
			&& || �߼��롢�߼��� 
		2��λ���λ���������������ֵ�Ķ�����λ������
			Ҳ���Լ���true��false������
			System.out.println(true|false);
			�߼�����߼���ֻ�ܽ���true��false�����㡣
			System.out.println( 10 && 3); // �����
		3���߼������/��·�����
			�߼���������ж�·���ܵġ�
			��·��ֱ����ǰ��������ִ�к�����жϹ��̡�
			����һ�����ʽ�Ľ�����Ծ���������������ʱ��
			����ִ�еڶ������ʽ���жϹ��̡�
			&& �� �����һ�����ʽ���Ϊfalse���������������е��жϣ�ֱ�ӷ���false
			|| �� �����һ�����ʽ���Ϊtrue�����������������жϣ�ֱ�ӷ���true
	*/
	
	
	
	
	//���1-100֮���ż��֮�ͺ�����֮�ͣ�ʹ��forѭ����whileѭ����
	public static  void test1() {
		int num1 = 0;
		int num2 = 0;
		/*
		 * //1.���1-100֮���ż��֮�ͺ�����֮�ͣ�ʹ��forѭ����whileѭ����
	      // 1.����1-100 2.������е�ż�������� 3.���ż��������֮��
		for(int i=1;i<=100;i++){
			if(i%2==0){
				num1+=i;
			}else{
				num2+=i;
			}
		}
		 * 
		 * */
		int j = 1;
		while(j <= 100) {
			if(j % 2 == 0) 
				num1 += j;
			if(j % 2 != 0)
				num2 += j;
			j++;
		}
		System.out.println("ż��֮��Ϊ" + num1);
		System.out.println("����֮��Ϊ" + num2);
	}
	
	//4!����4��3��2��1=24��
	public static  void test2(int x) {
		System.out.print(x+"!"+"�Ľ׳��ǣ�");
		int num=1;
		for(int i=x;i>=1;i--){
			num*=i;
			if(i!=1){
				System.out.print(i+"*");
			}else{
				System.out.print(i);
			}
				
		}
		System.out.print("="+num);
	}
	
	//��1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�
	public static  void test3() {
		System.out.print("�����ظ�����λ�����У�");
		int num=0;
		for(int i=1;i<=4;i++){          //��λ�Ͽ�ȡ������
			for(int j=1;j<=4;j++){      //ʮλ�Ͽ�ȡ������
				for(int k=1;k<=4;k++){  //��λ�Ͽ�ȡ������
					//�жϻ����ظ�����λ��������
					if(i!=j && i!=k && j!=k){
						num++;
						int number= i*100+j*10+k;
						System.out.print(number+"\t");
					}

				}
			}
		}
		System.out.println("���У�"+num+"��");
	}
	
	//ˮ�ɻ���
	public static  void test4() {
		int a=0;//��λ�ϵ�����
		int b=0;//ʮλ�ϵ�����
		int c=0;//��λ�ϵ�����
		int num=0;
		for(int i=100;i<1000;i++){
			a = i/100;
			b = i/10%10;
			c = i%10;
			if(i==Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)){
				num++;
				System.out.println(i);
			}
		}
		
		System.out.println("ˮ�ɻ������У�"+num);
	}
	
	//�žų˷���
	//��ʽһ
	public static  void test5() {
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
	//��ʽ��
	public static  void test6() {
		for(int i = 9; i > 0; i-- ) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
	
	//��ʽ��
	public static  void test7() {
		for(int i=1;i<=9;i++){
	
			for(int k=1;k<=9-i;k++){
				//��ӡ�հ׸�
				System.out.print("\t");
			}
	
			for(int j=1;j<=i;j++){
				if(i*j>=10){
					System.out.print(j+"*"+i+"="+i*j+"\t");
				}else{
					System.out.print(j+"*"+i+"= "+i*j+"\t");
				}
				
			}
			System.out.println();
		}
	}
	
	//��ʽ��
	public static  void test8() {
		for(int i=9;i>=0;i--){
	
			for(int k=1;k<=9-i;k++){
				//��ӡ�հ׸�
				System.out.print("\t");
			}
	
			for(int j=1;j<=i;j++){
				if(i*j>=10){
					System.out.print(j+"*"+i+"="+i*j+"\t");
				}else{
					System.out.print(j+"*"+i+"= "+i*j+"\t");
				}
				
			}
			System.out.println();
		}
	}
	
	//�ж�101-200֮���ж��ٸ����������������������
	public static  void test9() {
		int num=0;//ͳ���ж�������
		int num1=0;//ͳ�ƹ��ж�������
		for(int i=101;i<=200;i++){
			//����1��������
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					num++;
				}
			}
			//��num����0��ʱ�����һ������
			if(num==0){
				num1++;
				System.out.println(i);
			}
			//��numֵ0��������һ�����ֵ�����ͳ��
			num=0;
			
		}
		System.out.println("�������У�"+num1);
	}
	
	//��1000���ڵ���ȫ��
	public static  void test10() {
		int temp=0;
		int num=0;
		//1.����2-1000
		for(int i=2;i<=1000;i++){
			for(int j=1;j<i;j++){
				//2.����������
				if(i%j==0){
					temp+=j;
				}
	
			}
			if(i==temp){
				num++;
				System.out.println(i);
			}
			temp=0;

		}
		System.out.println("1000������ȫ�����У�"+num+"��");

	}
}
