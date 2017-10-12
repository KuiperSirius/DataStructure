class Gen<T> {
	private T ob; 
  	public Gen(T ob) {
		this.ob = ob;
	}
	public T getOb() {
		return ob;
	}
	public void setOb(T ob) {
		this.ob = ob;
	}
	public void showTyep() {
		System.out.println("成员变量ob的数据类型是:" + ob.getClass().getName());
	}
}

public class GenDemo {
	public static void main(String[] args){
		Gen<Integer> intOb=new Gen<Integer>(new Integer(88));
		intOb.showTyep();
		Integer i= intOb.getOb();
		System.out.println("value= " + i.intValue());
		System.out.println("----------------------------------");
		Gen<String> strOb=new Gen<String>("Hello Gen!");
		strOb.showTyep();
		String s=strOb.getOb();
		System.out.println("value= " + s);	
	}
} 
