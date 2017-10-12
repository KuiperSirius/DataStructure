public class AddRemoveIntoSinglyList{
	public static void main(String args[])
	{
		SinglyList<Integer> list=new SinglyList<Integer>();
		System.out.println(list.toString());
		
		list.insert(0,new Integer(20));
		System.out.println(list.toString());		
		list.insert(100,new Integer(200));
		System.out.println(list.toString());		
		list.insert(new Integer(2000));
		System.out.println(list.toString());	
			
		System.out.println(list.remove(0).toString());
		System.out.println(list.toString());
		System.out.println(list.isEmpty());
		list.set(0,new Integer(10));
		System.out.println(list.toString());	
		System.out.println(list.get(1));	
		System.out.println(list.size());
		list.clear();
		System.out.println(list.isEmpty());
		System.out.println(list.toString());
		System.out.println(list.size());
	}
}