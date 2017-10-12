public class SortedSeqList_ex 
{	
    public static void main(String args[])
    {
    	SortedSeqList list = new SortedSeqList(10);      
    	Integer i1;
        for(int i=0;i<5;i++){
        	i1=new Integer((int)(Math.random()*100));
        	list.insert(i1);
        }
        System.out.println("list: "+list.toString());
        
		list.insert(new Integer(20));
		System.out.println(list.toString());		
		list.insert(new Integer(3));
		System.out.println(list.toString());			
		list.remove(2);
		list.remove(new Integer(20));
		System.out.println(list.toString());
		list.clear();
		System.out.println(list.isEmpty());
		System.out.println(list.size());
    
   }
}
