import javax.swing.JOptionPane; 
 public class NumberConvert { 
  
	static String str="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	 
 	
	
	 
	 
	 
	 public static void main(String[] args) { 
  
         LinkedStack<String> stack = new LinkedStack<String>(); //创建空栈 
         String inputstr; 
         double resourceNumber = 0,conversion= 0; 
        int remainder,business;	 
  			
  			
  				inputstr=JOptionPane.showInputDialog("请输入你需要转换的十进制数："); 
  				resourceNumber=Double.parseDouble(inputstr); 
 			 		 
  			 
  			
  			
  			//	JOptionPane.showMessageDialog(null,"请输入数字（十进制数）！","提示信息",0); 				 
  					 		 
  			//处理输入的数据，保留整数部分。 
  			int temResourceNumber=(int) resourceNumber; 
  			inputstr=JOptionPane.showInputDialog("请输入你需要转换进制（2~16之间的进制数）:"); 
  			 
 	        conversion=Double.parseDouble(inputstr); 
 	         
 	        
 	        //对于输入的数字是整数，并且大于零时。 
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
  	 	 				JOptionPane.showMessageDialog(null,"请输入2~36以内的数字！","提示信息",0); 				 
 				}		 
  			catch (NumberFormatException exception) 
  			{ 
 	 			JOptionPane.showMessageDialog(null,"请输入数字(所要转换的进制数)！","提示信息",0); 				 
 			}	 
  				 
  			} 
  			 
  			 
  			 
  			//对于输入的数字是大于等于零的小数时。 
  			if((resourceNumber-temResourceNumber)>0&&resourceNumber>=0){ 
  				String number=""; 
  				//对小数部分进行处理 
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
  				//对于整数部分处理，保存在字符串number中。 
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
  	 	 				{JOptionPane.showMessageDialog(null,"请输入2~16以内的数字！","提示信息",0); 				 
 				 
  	 	 				} 		 
  				} 
  			catch (NumberFormatException exception) 
  			{ 
 	 			JOptionPane.showMessageDialog(null,"请输入数字(所要转换的进制数)！","提示信息",0); 				 
 			}	 
  				 
  				System.out.println(a); 
  			} 
  			 
  			 
 	        //对于输入的数字是整数，并且小于零时。 
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
  	 	 				JOptionPane.showMessageDialog(null,"请输入2~36以内的数字！","提示信息",0); 				 
 				}		 
  			catch (NumberFormatException exception) 
  			{ 
 	 			JOptionPane.showMessageDialog(null,"请输入数字(所要转换的进制数)！","提示信息",0); 				 
 			}	 
  				 
  			}
  
  			
  			//对于输入的数字是小于等于零的小数时。 
  			if((resourceNumber-temResourceNumber)<0&&resourceNumber<=0){ 
  				
  				String number=""; 
  				//对小数部分进行处理 
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
  				//对于整数部分处理，保存在字符串number中。 
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
  	 	 				{JOptionPane.showMessageDialog(null,"请输入2~16以内的数字！","提示信息",0); 				 
 				 
  	 	 				} 		 
  				} 
  			catch (NumberFormatException exception) 
  			{ 
 	 			JOptionPane.showMessageDialog(null,"请输入数字(所要转换的进制数)！","提示信息",0); 				 
 			}	 
  				 
  				System.out.println(a); 
  			}
		
 	} 
  
 } 
