public class ShiYan5{
	public static void main(String args[])
	{
		CirSinglyList<String> s=new CirSinglyList<String>();
		//成串、求长度、判断是否为空
		System.out.println("s.toString()="+s.toString());
		System.out.println("s.size()="+s.size());	
		System.out.println("s.isEmpty()="+s.isEmpty());		
				
		System.out.println("--------------------");
		//插入3个字符串、成串、求长度、判断是否为空		
		s.insert("BeiJing");
		System.out.println("s.toString()="+s.toString());		
		s.insert(0,"ShangHai");
		System.out.println("s.toString()="+s.toString());		
		s.insert(100,"TianJin");
		System.out.println("s.toString()="+s.toString());	
		System.out.println("s.size()="+s.size());	
		System.out.println("s.isEmpty()="+s.isEmpty());
				
		System.out.println("----------------------");
		//取值、置值、成串、求长度、判断是否为空		
		System.out.println("s.get(1)="+s.get(1));
		s.set(1,"ChongQing");		
		System.out.println("s.toString()="+s.toString());	
		System.out.println("s.size()="+s.size());	
		System.out.println("s.isEmpty()="+s.isEmpty());
		
		System.out.println("----------------------");
		//删除、成串、求长度、判断是否为空						
		System.out.println("s.remove(1)="+s.remove(1));
		System.out.println("s.toString()="+s.toString());
		System.out.println("s.size()="+s.size());	
		System.out.println("s.isEmpty()="+s.isEmpty());							
		
		System.out.println("----------------------");
		//清空、成串、求长度、判断是否为空		
		s.clear();	
		System.out.println("s.toString()="+s.toString());
		System.out.println("s.size()="+s.size());	
		System.out.println("s.isEmpty()="+s.isEmpty());
	}
}