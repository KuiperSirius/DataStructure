
public class Main {

	public static void main(String[] args) {	
      int[][] expMatrix={{2,4,56,78,55},{41,45,77},{5,99,46,26},{46,55,15}}; //"不能对非静态字段进行静态引用"
		Matrix testMatrix=new Matrix(4, 4, expMatrix);
		//检验算法是否正确
	/*	String str_1=testMatrix.toString();
		System.out.println("原测试矩阵为："+str_1);
		String str_2=testMatrix.transpose().toString();
		System.out.println("转置测试矩阵为："+str_2); **/
	}

}
