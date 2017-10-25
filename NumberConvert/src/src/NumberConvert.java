package src;

import javax.swing.JOptionPane;

public class NumberConvert {
    public static void main(String args[])
    {                                                      
        LinkedStack<String> stack = new LinkedStack<String>(); //创建空栈
        String inputstr;
        char charremainder;
        int sourcedecimalnumber,conversion,remainder,business;
 		do
 		{
 			try
 			{
 				inputstr=JOptionPane.showInputDialog("请输入你需要转换的十进制数：");
 	 	 		sourcedecimalnumber=Integer.parseInt(inputstr);
 	 	 		break;	 	 		
 			}	
 			catch (NumberFormatException exception)
 			{
 				JOptionPane.showMessageDialog(null,"请输入数字（十进制数）！","提示信息",0); 				
 			}		
 		}while(true);	
 	
		do
 		{
 			try
 			{
 				do
 				{
 		 	 		inputstr=JOptionPane.showInputDialog("请输入你需要转换进制（2~16之间的进制数）:");
 		 	 		conversion=Integer.parseInt(inputstr);
 	 	 	 		if (conversion>1 && conversion<17)
 	 	 	 			break;
 	 	 	 		else
 	 	 				JOptionPane.showMessageDialog(null,"请输入2~16以内的数字！","提示信息",0); 				
				}while (true);
 				break; 	 		
 			}
 			catch (NumberFormatException exception)
 			{
	 			JOptionPane.showMessageDialog(null,"请输入数字(所要转换的进制数)！","提示信息",0); 				
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
