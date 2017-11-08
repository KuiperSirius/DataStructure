public class Main {

	public static void main(String[] args) {
		 //倘若矩阵（二维数组）在main()方法外声明，则"不能对非静态字段进行静态引用"，控制台报错。
      int[][] expMatrix={{2,4,56,78,55},{41,45,77},{5,99,46,26},{46,55,15}};
      int[][] expMatrix_b={{25,25,5,78,55},{1,45,757,59},{51,92,46,26},{6,12,15}};
		//讲二维数组写入矩阵，多余丢弃，缺失补零。
		Matrix testMatrix=new Matrix(4, 4, expMatrix);
		Matrix testMatrix_b=new Matrix(4, 4, expMatrix_b);
		//检验算法是否正确
		String str_1=testMatrix.toString();
		String str_2=testMatrix_b.toString();
	/*	System.out.println("原测试矩阵为："+str_1);
		String str_2=testMatrix.transpose().toString();
		System.out.println("转置测试矩阵为："+str_2);
		if(testMatrix.isSymmetricMatrix()){
			System.out.println("测试矩阵为对称矩阵.");
		}else
			System.out.println("测试矩阵不为对称矩阵."); **/
		System.out.println("原测试矩阵一为："+str_1);
		System.out.println("原测试矩阵二为："+str_2);
		System.out.println("矩阵和为："+testMatrix.add(testMatrix_b).toString());
		System.out.println("矩阵乘积为："+testMatrix.multiply(testMatrix_b).toString());
   }
}
