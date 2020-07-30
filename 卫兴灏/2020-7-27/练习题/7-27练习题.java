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
		一个&、|和两个&&、||有什么区别？
		1）& | 位与、位或 
			&& || 逻辑与、逻辑或 
		2）位与和位或可以用来计算数值的二进制位数运算
			也可以计算true和false的运算
			System.out.println(true|false);
			逻辑与和逻辑或只能进行true和false的运算。
			System.out.println( 10 && 3); // 错误的
		3）逻辑运算符/短路运算符
			逻辑运算符具有短路功能的。
			短路：直接提前结束，不执行后面的判断过程。
			当第一个表达式的结果可以决定整个计算结果的时候，
			不会执行第二个表达式的判断过程。
			&& ： 如果第一个表达式结果为false，则跳过后面所有的判断，直接返回false
			|| ： 如果第一个表达式结果为true，则跳过后面所有判断，直接返回true
	*/
	
	
	
	
	//求出1-100之间的偶数之和和奇数之和（使用for循环和while循环）
	public static  void test1() {
		int num1 = 0;
		int num2 = 0;
		/*
		 * //1.求出1-100之间的偶数之和和奇数之和（使用for循环和while循环）
	      // 1.遍历1-100 2.求出其中的偶数和奇数 3.求出偶数和奇数之和
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
		System.out.println("偶数之和为" + num1);
		System.out.println("奇数之和为" + num2);
	}
	
	//4!等于4×3×2×1=24。
	public static  void test2(int x) {
		System.out.print(x+"!"+"的阶乘是：");
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
	
	//有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
	public static  void test3() {
		System.out.print("互不重复的三位数字有：");
		int num=0;
		for(int i=1;i<=4;i++){          //百位上可取的数字
			for(int j=1;j<=4;j++){      //十位上可取的数字
				for(int k=1;k<=4;k++){  //个位上可取的数字
					//判断互不重复的三位数的条件
					if(i!=j && i!=k && j!=k){
						num++;
						int number= i*100+j*10+k;
						System.out.print(number+"\t");
					}

				}
			}
		}
		System.out.println("共有："+num+"个");
	}
	
	//水仙花数
	public static  void test4() {
		int a=0;//百位上的数字
		int b=0;//十位上的数字
		int c=0;//个位上的数字
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
		
		System.out.println("水仙花数共有："+num);
	}
	
	//九九乘法表
	//形式一
	public static  void test5() {
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
	//形式二
	public static  void test6() {
		for(int i = 9; i > 0; i-- ) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
	
	//形式三
	public static  void test7() {
		for(int i=1;i<=9;i++){
	
			for(int k=1;k<=9-i;k++){
				//打印空白格
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
	
	//形式四
	public static  void test8() {
		for(int i=9;i>=0;i--){
	
			for(int k=1;k<=9-i;k++){
				//打印空白格
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
	
	//判断101-200之间有多少个素数，并输出所有素数。
	public static  void test9() {
		int num=0;//统计有多少因数
		int num1=0;//统计共有多少素数
		for(int i=101;i<=200;i++){
			//除以1到它本身
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					num++;
				}
			}
			//当num等于0的时候就是一个素数
			if(num==0){
				num1++;
				System.out.println(i);
			}
			//将num值0，进行下一个数字的因数统计
			num=0;
			
		}
		System.out.println("素数共有："+num1);
	}
	
	//求1000以内的完全数
	public static  void test10() {
		int temp=0;
		int num=0;
		//1.遍历2-1000
		for(int i=2;i<=1000;i++){
			for(int j=1;j<i;j++){
				//2.求它的因数
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
		System.out.println("1000以内完全数共有："+num+"个");

	}
}
