import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main_1<T> {
	;
	
	//�������������ȫ������
     public  BinaryNode<T> creatLevelTree(String str){ 
	 int temp=0;//���������±�
	 if(str.length()==1){		 
		 return new BinaryNode(String.valueOf(str.charAt(0)));
	 }
	 BinaryNode<T> p=null;
	 BinaryNode<T> root=null;
	 //����ѭ������������������ȫ������βҶ�ӽ��ĸ�ĸ�ڵ��±�
	 while(temp<=(int)(str.length()-1)/2){
		 p=new BinaryNode(String.valueOf(str.charAt(temp)));
		 //�����ж�����
		 if((temp*2+1)<str.length()){
			 p.left=new BinaryNode(String.valueOf(str.charAt(temp*2+1)));
		 }
		 //�Һ����ж�����
		 if((temp*2+2)<str.length()){
			 p.right=new BinaryNode(String.valueOf(str.charAt(temp*2+2)));			 
		 }	
		 if(temp==0){ 
			 root=p;
			 }
		 temp++;
	 }
	return root; 
 }
     public String levelorder(BinaryNode<T> root){
    	 Queue<T> nodeQueue=new ArrayDeque<T>();	 
    	 BinaryNode<T> temp =new BinaryNode<T>(); 
    	 nodeQueue.add(root.data);
    	 int currentLevel=1;//��ǰ�ڵ���
    	 int nextLevel=0;//��һ��ڵ���
    	 String str ="";
    	 while((temp.data=nodeQueue.poll())!=null){           //Notice
    		 if(temp.left!=null){
    			 nodeQueue.add(temp.left.data);
    			 nextLevel++;
    		 }
             if(temp.right!=null){
            	 nodeQueue.add(temp.right.data);
            	 nextLevel++;
    		 }
    		 str+=nodeQueue.poll();
    		 currentLevel--;
    		 //������ڵ���Ϊ��ʱ����ʾ���иò�����Һ��ӽڵ��Ѿ�����˫�˶��С�
    		 if(currentLevel==0){
    			 str+="\n";
    			 currentLevel=nextLevel;
    			 nextLevel=0;   					 
    		 }   		    		 
    	 }
 	 
    	 return str;
     }
     
	
	public static void main(String[] args) {	 
		//�����������������ȡ���������ַ�����
		/*
		InputStreamReader stdin = new InputStreamReader(System.in);//�������� 
		BufferedReader bufin = new BufferedReader(stdin); 
        try {
			str = bufin.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		} 
        */
		String str="ABCDEFG";
        Main_1<String> main_1=new Main_1<String>();
       BinaryNode<String> node= main_1.creatLevelTree(str);
      //  String str_1=new Main_1<String>().levelorder(node);
        System.out.println(main_1.levelorder(node));
        
		
		
	}

}
