import javax.swing.JOptionPane; 
 public class NumberConvert { 
  
	static String str="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	 
 	
	
	 
	 
	 
	 public static void main(String[] args) { 
  
         LinkedStack<String> stack = new LinkedStack<String>(); //������ջ 
         String inputstr; 
         double resourceNumber = 0,conversion= 0; 
        int remainder,business;	 
  			
  			
  				inputstr=JOptionPane.showInputDialog("����������Ҫת����ʮ��������"); 
  				resourceNumber=Double.parseDouble(inputstr); 
 			 		 
  			 
  			
  			
  			//	JOptionPane.showMessageDialog(null,"���������֣�ʮ����������","��ʾ��Ϣ",0); 				 
  					 		 
  			//������������ݣ������������֡� 
  			int temResourceNumber=(int) resourceNumber; 
  			inputstr=JOptionPane.showInputDialog("����������Ҫת�����ƣ�2~16֮��Ľ�������:"); 
  			 
 	        conversion=Double.parseDouble(inputstr); 
 	         
 	        
 	        //������������������������Ҵ�����ʱ�� 
  			if((resourceNumber-temResourceNumber)==0&&temResourceNumber>0){ 
  				try 
  				{ 
  		 	 		 
  	 	 	 		if (conversion>1 && conversion<37){ 
  	 	 	 		business=temResourceNumber; 
  	 	 			while(business!=0) 
  	 	 			{ 
  	 	 				remainder=(int) (business%conversion); 
  	 	 				char temp=str.charAt(remainder);
  	 	 				String result; 
  	 	 				result=String.valueOf(temp); 
  	 	 			/*if(remainder>9) 
  	 	 					remainder+=55; 
  	 	 				else 
  	 	 					remainder+=48; 
  	 	 				charremainder=(char)remainder; 
  	 	 				char [] chararray={charremainder}; */ 
  	 	 				stack.push(result); 
  	 	 				business/=conversion; 
  	 	 			} 
  	 	 			 
  	 	 			while(!stack.isEmpty()) 
  	 	 			{ 
  	 	 				System.out.print(stack.pop()); 
  	 	 			 
  	 	 			} 	 	 	 			 
  	 	 	 		}	 	 	 			 
  	 	 	 		else 
  	 	 				JOptionPane.showMessageDialog(null,"������2~36���ڵ����֣�","��ʾ��Ϣ",0); 				 
 				}		 
  			catch (NumberFormatException exception) 
  			{ 
 	 			JOptionPane.showMessageDialog(null,"����������(��Ҫת���Ľ�����)��","��ʾ��Ϣ",0); 				 
 			}	 
  				 
  			} 
  			 
  			 
  			 
  			//��������������Ǵ��ڵ������С��ʱ�� 
  			if((resourceNumber-temResourceNumber)>0&&resourceNumber>=0){ 
  				String number=""; 
  				//��С�����ֽ��д��� 
  				double littleNumber=resourceNumber-(double)temResourceNumber; 
  				String a="."; 
  				while(littleNumber-(int)littleNumber!=0.0){ 
  					littleNumber*=conversion; 
  					int getNumber=(int) littleNumber; 
  					a+=String.valueOf(getNumber); 
  					littleNumber-=getNumber; 
  				} 
  			/*	int getNumber=(int) littleNumber; 
  				a+=String.valueOf(getNumber); 
 				*/ 
  				//�����������ִ����������ַ���number�С� 
  				try{	 
  				if (conversion>1 && conversion<17){ 
  	 	 	 		business=temResourceNumber; 
  	 	 			while(business!=0) 
  	 	 			{ 
  	 	 				
  	 	 			remainder=(int) (business%conversion); 
	 	 				char temp=str.charAt(remainder);
	 	 				String result; 
	 	 				result=String.valueOf(temp); 
  	 	 			/*if(remainder>9) 
  	 	 					remainder+=55; 
  	 	 				else 
  	 	 					remainder+=48; 
  	 	 				charremainder=(char)remainder; 
  	 	 				char [] chararray={charremainder}; */ 
  	 	 				stack.push(result); 
  	 	 				business/=conversion; 
  	 	 			}	 
  	 	 			String str=""; 
  	 	 			while(!stack.isEmpty()) 
  	 	 			{ 
  	 	 				 
  	 	 			//	System.out.print(stack.pop()); 		 
  	 	 				str+=stack.pop(); 
  	 	 				 
  	 	 			} 	 
  	 	 			System.out.print(str);  
  	 	 	 		}	 	 	 			 
  	 	 	 		else 
  	 	 				{JOptionPane.showMessageDialog(null,"������2~16���ڵ����֣�","��ʾ��Ϣ",0); 				 
 				 
  	 	 				} 		 
  				} 
  			catch (NumberFormatException exception) 
  			{ 
 	 			JOptionPane.showMessageDialog(null,"����������(��Ҫת���Ľ�����)��","��ʾ��Ϣ",0); 				 
 			}	 
  				 
  				System.out.println(a); 
  			} 
  			 
  			 
 	        //�������������������������С����ʱ�� 
  			if((resourceNumber-temResourceNumber)==0&&temResourceNumber<0){ 
  				try 
  				{ 
  		 	 		 int littleTemp=Math.abs(temResourceNumber);
  	 	 	 		if (conversion>1 && conversion<37){ 
  	 	 	 		business=littleTemp; 
  	 	 	 	
  	 	 			while(business!=0) 
  	 	 			{ 
  	 	 				remainder=(int) (business%conversion); 
  	 	 				char temp=str.charAt(remainder);
  	 	 				String result; 
  	 	 				result=String.valueOf(temp); 
  	 	 			/*if(remainder>9) 
  	 	 					remainder+=55; 
  	 	 				else 
  	 	 					remainder+=48; 
  	 	 				charremainder=(char)remainder; 
  	 	 				char [] chararray={charremainder}; */ 
  	 	 				stack.push(result); 
  	 	 				business/=conversion; 
  	 	 			} 
  	 	 		    stack.push("-");
  	 	 			while(!stack.isEmpty()) 
  	 	 			{ 
  	 	 				System.out.print(stack.pop()); 
  	 	 			 
  	 	 			} 	 	 	 			 
  	 	 	 		}	 	 	 			 
  	 	 	 		else 
  	 	 				JOptionPane.showMessageDialog(null,"������2~36���ڵ����֣�","��ʾ��Ϣ",0); 				 
 				}		 
  			catch (NumberFormatException exception) 
  			{ 
 	 			JOptionPane.showMessageDialog(null,"����������(��Ҫת���Ľ�����)��","��ʾ��Ϣ",0); 				 
 			}	 
  				 
  			}
  
  			
  			//���������������С�ڵ������С��ʱ�� 
  			if((resourceNumber-temResourceNumber)<0&&resourceNumber<=0){ 
  				
  				String number=""; 
  				//��С�����ֽ��д��� 
  				double littleNumber=Math.abs(resourceNumber-(double)temResourceNumber);
  				String a="."; 
  				while(littleNumber-(int)littleNumber!=0.0){ 
  					littleNumber*=conversion; 
  					int getNumber=(int) littleNumber; 
  					a+=String.valueOf(getNumber); 
  					littleNumber-=getNumber; 
  				} 
  			/*	int getNumber=(int) littleNumber; 
  				a+=String.valueOf(getNumber); 
 				*/ 
  				//�����������ִ����������ַ���number�С� 
  				try{	 
  				if (conversion>1 && conversion<17){ 
  	 	 	 		business=Math.abs(temResourceNumber);
  	 	 			while(business!=0) 
  	 	 			{ 	
  	 	 			remainder=(int) (business%conversion); 
	 	 				char temp=str.charAt(remainder);
	 	 				String result; 
	 	 				result=String.valueOf(temp); 
  	 	 			/*if(remainder>9) 
  	 	 					remainder+=55; 
  	 	 				else 
  	 	 					remainder+=48; 
  	 	 				charremainder=(char)remainder; 
  	 	 				char [] chararray={charremainder}; */ 
  	 	 				stack.push(result); 
  	 	 				business/=conversion; 
  	 	 			}	 
  	 	 		stack.push("-"); 
  	 	 			String str=""; 
  	 	 			while(!stack.isEmpty()) 
  	 	 			{ 
  	 	 				 
  	 	 			//	System.out.print(stack.pop()); 		 
  	 	 				str+=stack.pop(); 
  	 	 				 
  	 	 			} 	 
  	 	 			System.out.print(str);  
  	 	 	 		}	 	 	 			 
  	 	 	 		else 
  	 	 				{JOptionPane.showMessageDialog(null,"������2~16���ڵ����֣�","��ʾ��Ϣ",0); 				 
 				 
  	 	 				} 		 
  				} 
  			catch (NumberFormatException exception) 
  			{ 
 	 			JOptionPane.showMessageDialog(null,"����������(��Ҫת���Ľ�����)��","��ʾ��Ϣ",0); 				 
 			}	 
  				 
  				System.out.println(a); 
  			}
		
 	} 
  
 } 
