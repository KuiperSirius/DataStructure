class Gen3 {
	private Object ob; 
	public Gen3(Object ob) {
		this.ob = ob;
	}
	public Object getOb() {
		return ob;
	}
	public void setOb(Object ob) {
		this.ob = ob;
	}
	public void showType() {
		System.out.println("成员变量ob的数据类型是:" + ob.getClass().getName());
	}
}

public class GenDemo3 {
	public static void main(String[] args) {
		Gen3 intOb = new Gen3(new Integer(88));
		intOb.showType();
		Integer i = (Integer)intOb.getOb();
//		Integer i = intOb.getOb();
		System.out.println("value= " + i.intValue());
		System.out.println("----------------------------------");
		Gen3 strOb = new Gen3("Hello Gen!");
		strOb.showType();
		String s = (String)strOb.getOb();
		System.out.println("value= " + s);
	}
} 
