public class ShiYan5{
	public static void main(String args[])
	{
		CirSinglyList<String> s=new CirSinglyList<String>();
		//�ɴ����󳤶ȡ��ж��Ƿ�Ϊ��
		System.out.println("s.toString()="+s.toString());
		System.out.println("s.size()="+s.size());	
		System.out.println("s.isEmpty()="+s.isEmpty());		
				
		System.out.println("--------------------");
		//����3���ַ������ɴ����󳤶ȡ��ж��Ƿ�Ϊ��		
		s.insert("BeiJing");
		System.out.println("s.toString()="+s.toString());		
		s.insert(0,"ShangHai");
		System.out.println("s.toString()="+s.toString());		
		s.insert(100,"TianJin");
		System.out.println("s.toString()="+s.toString());	
		System.out.println("s.size()="+s.size());	
		System.out.println("s.isEmpty()="+s.isEmpty());
				
		System.out.println("----------------------");
		//ȡֵ����ֵ���ɴ����󳤶ȡ��ж��Ƿ�Ϊ��		
		System.out.println("s.get(1)="+s.get(1));
		s.set(1,"ChongQing");		
		System.out.println("s.toString()="+s.toString());	
		System.out.println("s.size()="+s.size());	
		System.out.println("s.isEmpty()="+s.isEmpty());
		
		System.out.println("----------------------");
		//ɾ�����ɴ����󳤶ȡ��ж��Ƿ�Ϊ��						
		System.out.println("s.remove(1)="+s.remove(1));
		System.out.println("s.toString()="+s.toString());
		System.out.println("s.size()="+s.size());	
		System.out.println("s.isEmpty()="+s.isEmpty());							
		
		System.out.println("----------------------");
		//��ա��ɴ����󳤶ȡ��ж��Ƿ�Ϊ��		
		s.clear();	
		System.out.println("s.toString()="+s.toString());
		System.out.println("s.size()="+s.size());	
		System.out.println("s.isEmpty()="+s.isEmpty());
	}
}