public class Test1{
	public static void main(String args[]){
		int i=4;
		int j=4;
		Integer i1=new Integer(4);
		Integer i2=new Integer(4);
		Integer i3=i1;
		System.out.println("i==j answer:  "+(i==j));
		System.out.println("i1==i2 answer:  "+(i1==i2));
		System.out.println("i1.equals(i2) answer:  "+i1.equals(i2));
		System.out.println("i1==i3 answer:  "+(i1==i3));
		System.out.println("i1.equals(i3) answer:  "+i1.equals(i3));
	}
}