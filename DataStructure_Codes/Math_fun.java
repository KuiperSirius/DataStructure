import javax.swing.JOptionPane;

public class Math_fun{
	public static void main(String args[]){
	float x,y;
	String str;
	str=JOptionPane.showInputDialog("input x:");
	x=Float.parseFloat(str);
	System.out.print("x="+x+"   ");
	str=JOptionPane.showInputDialog("input y:");
	y=Float.parseFloat(str);
	System.out.println("y="+y);
	System.out.println("max(x,y)="+Math.max(x,y));
	System.out.println("minx,y)="+Math.min(x,y));
	System.out.println("abs(x)="+Math.abs(x));
	System.out.println("random()="+Math.random());
	System.out.println("sin(Math.PI/2)="+Math.sin(Math.PI/2));
	System.out.println("round(y)="+Math.round(y));
	}
}