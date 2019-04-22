package Instance_1;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Calculator_1 extends JFrame{
	
	JButton jButtonNum[];
	JButton jbuttonAdd,jbuttonSubtract,jbuttonMultiply,jbuttonDivide;
	JTextField jTextField;
	JButton jbuttonBack,jbuttonEqual,jubttonClear,jbuttonDot;
	JButton jbuttonFactorial;
	int choseOperate;
	private double result;
private final	int ADD=1;
private final int SUBTRACT=2;
private final int MULTIPLY=3;
private final	int DIVIDE=4;
	
public Calculator_1(){
	
	ActionListener listener=new OperateActionListener(); 
	Toolkit toolkit=Toolkit.getDefaultToolkit();
	Image image=toolkit.getImage("25739016826.jpg"); 
	this.setIconImage(image);
	
	Dimension dimension=toolkit.getScreenSize();	
	this.setSize((int)(dimension.getWidth()/5.5),(int)dimension.getHeight()/6);
	this.setTitle("Science Calculator By Sirius");
	
	//this.setLocation(400, 250);
    this.setResizable(true);	
    this.setLocation((int)dimension.getWidth()/4, (int)dimension.getHeight()/4);
   
    Container con=this.getContentPane();
	con.setLayout(new FlowLayout());
	
	jButtonNum=new JButton[10];
	jTextField=new JTextField(30);
	jTextField.setEditable(false);
	jTextField.setText("");
	jbuttonAdd=new JButton("+");
	jbuttonSubtract=new JButton("-");
	jbuttonMultiply =new JButton("*");
	jbuttonDivide=new JButton("/");
	jbuttonBack=new JButton("BackSpace");
	jbuttonEqual=new JButton("=");
	jubttonClear=new JButton("Clear");
	jbuttonDot=new JButton(".");
	jbuttonFactorial=new JButton("n!");
	
	con.add(jTextField);
	con.add(jbuttonAdd);
	con.add(jbuttonSubtract);
	con.add(jbuttonMultiply);
	con.add(jbuttonDivide);
	con.add(jbuttonBack);
	con.add(jbuttonEqual);
	con.add(jubttonClear);
	con.add(jbuttonFactorial);
	con.add(jbuttonDot);
	
for(int i=0;i<jButtonNum.length;i++){
	jButtonNum[i]=new JButton(Integer.toString(i));
	//jButtonNum[i]=new JButton(String.valueOf(i));	
	con.add(jButtonNum[i]);
	jButtonNum[i].addActionListener(listener);
	}
	

jTextField.addActionListener(listener);
jTextField.addActionListener(listener);
jTextField.addActionListener(listener);
jbuttonAdd.addActionListener(listener);
jbuttonSubtract.addActionListener(listener);
jbuttonMultiply.addActionListener(listener);
jbuttonDivide.addActionListener(listener);
jbuttonBack.addActionListener(listener);
jbuttonEqual.addActionListener(listener);
jubttonClear.addActionListener(listener);
jbuttonFactorial.addActionListener(listener);
jbuttonDot.addActionListener(listener);

    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
//设置内部类	
	class OperateActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String label=e.getActionCommand();
			Object keyButton=e.getSource();
			String text=jTextField.getText();
			//数字监听器(失效)
			/*for(int i=0;i<jButtonNum.length;i++){
				if(keyButton==jButtonNum[i]){
					jTextField.setText(text+i);
				}
				
			}*/
			//加减乘除数字运算（自定义索引方法）
			if("0123456789.".indexOf(label)>=0){
				this.numOperate(label);
			}else if("+-*/=".indexOf(label)>=0){
				this.digitOperate(label);
			}
	
			//BackSpace监听器
			if(keyButton==jbuttonBack&&text.length()!=0){
				jTextField.setText(text.substring(0, text.length()-1));
			}
			//Clear监听器
			if(keyButton==jubttonClear){
				jTextField.setText("");
			}
			//阶乘监听器
			if(keyButton==jbuttonFactorial){
				double num=Double.parseDouble(text);
				double factorialNum=1;
				for(double i=1;i<=num;i++){				
					factorialNum*=i;
				}
				jTextField.setText(Double.toString(factorialNum));
			}
			//定义加减乘除监听器
			
			
			
		
		}
		boolean isFirstDigit=true;
		//数字小数点运算设计方法
			void numOperate(String key){
				if((key.equals("."))&&(jTextField.getText().indexOf("."))<0){
					jTextField.setText(jTextField.getText()+".");
				}
				if("0123456789".indexOf(key)!=(-1)){
					jTextField.setText(jTextField.getText()+key);
				}
				if(isFirstDigit){
					jTextField.setText(key);
				}
				isFirstDigit=false;
			}
		//加减乘除运算设计方法
			String operator="=";
			double result=0.0;
          void digitOperate(String key){
				 
        	  if(operator.equals("+")){
        		  result+=Double.parseDouble(jTextField.getText());
        	  }
              if(operator.equals("-")){
            	  result-=Double.parseDouble(jTextField.getText());
        	  }
             if(operator.equals("*")){
            	 result*=Double.parseDouble(jTextField.getText());
        	  }
             if(operator.equals("/")){
            	 result/=Double.parseDouble(jTextField.getText());
}
             if(operator.equals("=")){
            	 result=Double.parseDouble(jTextField.getText());
             }
             jTextField.setText(Double.toString(result));
             operator=key;
             isFirstDigit=true;
			}
		
          
	}

	
	public static void main(String[] args){	
			new Calculator_1();

	}
	
	
	
	
}
