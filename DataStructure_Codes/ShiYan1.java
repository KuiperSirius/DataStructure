class ComplexNumber{
	private double re;
	private double im;
	
	public ComplexNumber(double re,double im){
		this.re=re;
		this.im=im;
	}
	
	//toString��������Ӵ���ʵ�ָ����ĳɴ�����ʽΪ����a+bi��
	public String toString(){
		String s=null;
		//��Ӵ���ʵ�ֳɴ���
		return s;
	}
	
	//add��������Ӵ���ʵ�ָ���this�͸���b��ӡ�����Ǹ���c	
	public ComplexNumber add(ComplexNumber b){
		ComplexNumber c=null;
		//��Ӵ���ʵ����ӡ�
		return c;	
	}

	//sub��������Ӵ���ʵ�ָ���this������b������Ǹ���c
	public ComplexNumber sub(ComplexNumber b){
		ComplexNumber c=null;
		//��Ӵ���ʵ�������
		return c;	
	}
	
	//mult��������Ӵ���ʵ�ָ���this�͸���b��ˡ�����Ǹ���c
	public ComplexNumber mult(ComplexNumber b){
		ComplexNumber c=null;
		//��Ӵ���ʵ����ˡ�
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