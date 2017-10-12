class ComplexNumber{
	private double re;
	private double im;
	
	public ComplexNumber(double re,double im){
		this.re=re;
		this.im=im;
	}
	
	//toString方法中添加代码实现复数的成串，形式为：“a+bi”
	public String toString(){
		String s=null;
		//添加代码实现成串。
		return s;
	}
	
	//add方法中添加代码实现复数this和复数b相加。结果是复数c	
	public ComplexNumber add(ComplexNumber b){
		ComplexNumber c=null;
		//添加代码实现相加。
		return c;	
	}

	//sub方法中添加代码实现复数this减复数b。结果是复数c
	public ComplexNumber sub(ComplexNumber b){
		ComplexNumber c=null;
		//添加代码实现相减。
		return c;	
	}
	
	//mult方法中添加代码实现复数this和复数b相乘。结果是复数c
	public ComplexNumber mult(ComplexNumber b){
		ComplexNumber c=null;
		//添加代码实现相乘。
		return c;	
	}
}
public class ShiYan1{
	public static void main(String args[]){
		ComplexNumber c1=new ComplexNumber(0,-3);
		System.out.println("c1= "+c1.toString());

		ComplexNumber c2=new ComplexNumber(5,3);
		System.out.println("c2= "+c2.toString());

		System.out.println("------------------------------");

		ComplexNumber c3=c1.add(c2);
		System.out.println("c1+c2= "+c3.toString());

		ComplexNumber c4=c1.sub(c2);
		System.out.println("c1-c2= "+c4.toString());

		ComplexNumber c5=c1.mult(c2);
		System.out.println("c1*c2= "+c5.toString());		
	}			
}