package src;

import javax.swing.JOptionPane;

public class NumberConvert {
    public static void main(String args[])
    {                                                      
        LinkedStack<String> stack = new LinkedStack<String>(); //������ջ
        String inputstr;
        char charremainder;
        int sourcedecimalnumber,conversion,remainder,business;
 		do
 		{
 			try
 			{
 				inputstr=JOptionPane.showInputDialog("����������Ҫת����ʮ��������");
 	 	 		sourcedecimalnumber=Integer.parseInt(inputstr);
 	 	 		break;	 	 		
 			}	
 			catch (NumberFormatException exception)
 			{
 				JOptionPane.showMessageDialog(null,"���������֣�ʮ����������","��ʾ��Ϣ",0); 				
 			}		
 		}while(true);	
 	
		do
 		{
 			try
 			{
 				do
 				{
 		 	 		inputstr=JOptionPane.showInputDialog("����������Ҫת�����ƣ�2~16֮��Ľ�������:");
 		 	 		conversion=Integer.parseInt(inputstr);
 	 	 	 		if (conversion>1 && conversion<17)
 	 	 	 			break;
 	 	 	 		else
 	 	 				JOptionPane.showMessageDialog(null,"������2~16���ڵ����֣�","��ʾ��Ϣ",0); 				
				}while (true);
 				break; 	 		
 			}
 			catch (NumberFormatException exception)
 			{
	 			JOptionPane.showMessageDialog(null,"����������(��Ҫת���Ľ�����)��","��ʾ��Ϣ",0); 				
			}
 		}while(true);
		
		business=sourcedecimalnumber;
		while(business!=0)
		{
			remainder=business%conversion;
			if(remainder>9)
				remainder+=55;
			else
				remainder+=48;
			charremainder=(char)remainder;
			char [] chararray={charremainder};
			stack.push(new String(chararray));
			business/=conversion;
		}
		
		while(!stack.isEmpty())
		{
			System.out.print(stack.pop());
		
		}     
    }       
}
