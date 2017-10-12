class Gen1 {
	private Integer ob;
	public Gen1(Integer ob) {
		this.ob = ob;
	}
	public Integer getOb() {
		return ob;
	}
	public void setOb(Integer ob) {
		this.ob = ob;
	}
	public void showType() {
		System.out.println("成员变量ob的数据类型是: " +ob.getClass().getName());
	}
}

class Gen2 {
	private String ob; 
	public Gen2(String ob) {
		this.ob = ob;
	}
	public String getOb() {
		return ob;
	}
	public void setOb(String ob) {
		this.ob = ob;
	}
	public void showType() {
		System.out.println("成员变量ob的数据类型是:" +ob.getClass().getName());
	}
}

public class GenDemo12 {
	public static void main(String[] args) {
	Gen1 intOb = new Gen1(new Integer(88));
	intOb.showType();
	Integer i = intOb.getOb();
	System.out.println("value= "+ i.intValue());
    System.out.println("----------------------------------");
	Gen2 strOb = new Gen2("Hello Gen!");
	strOb.showType();
	String s = strOb.getOb();
	System.out.println("value= " + s);
	}
} 

