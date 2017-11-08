import javax.swing.JOptionPane;

public class Matrix {
	
		protected int rows, columns;                           //��������������
	    protected int[][] element;                             //��ά���飬�洢����Ԫ��

	    public Matrix(int m, int n)                            //����m��n�������m��nΪ������Java�׳������鳤���쳣
	    {
	        this.element = new int[m][n];                      //����Ԫ�س�ֵΪ0
	        this.rows = m;
	        this.columns = n;
	    }
	    public Matrix(int n)                                   //����n��n�㷽��
	    {
	        this(n,n); 
	    }
	    public Matrix(int m, int n, int[][] value)             //����m��n������value[][]�ṩԪ��
	    {
	        this(m, n);
	        for (int i=0; i<value.length && i<m; i++)          //valueԪ�ز���ʱ��0�����Զ���Ԫ��
	            for (int j=0; j<value[i].length && j<n; j++)
	               this.element[i][j] = value[i][j];
	    }

	    public int getRows()                                   //���ؾ�������
	    {
	        return this.rows;
	    }
	    public int getColumns()                                //���ؾ�������
	    {
	        return this.columns;
	    }
	    public int get(int i, int j)                 //���ؾ����i�е�j��Ԫ�ء���i��jԽ�磬�׳����Խ���쳣
	    {
	        if (i>=0 && i<this.rows && j>=0 && j<this.columns) 
	            return this.element[i][j];
	        throw new IndexOutOfBoundsException("i="+i+"��j="+j);
	    }
	    public void set(int i, int j, int x)         //���þ����i�е�j��Ԫ��Ϊx����i��jԽ�磬�׳����Խ���쳣
	    {
	        if (i>=0 && i<this.rows && j>=0 && j<this.columns) 
	            this.element[i][j]=x;
	        else throw new IndexOutOfBoundsException("i="+i+"��j="+j);
	    }
	    
	    public String toString()                               //���ؾ�������Ԫ�ص������ַ��������������
	    {
	        String str=" ����"+this.getClass().getName()+"��"+this.rows+"��"+this.columns+"����\n";
	        for (int i=0; i<this.rows; i++)
	        {
	            for (int j=0; j<this.columns; j++)
	                str+=String.format("%6d", this.element[i][j]); //"%6d"��ʽ��ʾʮ��������ռ6��
	            str += "\n";
	        }
	        return str;
	    }
	    
	    //���þ���Ϊm��n�С�������ָ���������ϴ��򽫾������ݣ�������ԭ����Ԫ�ء�
	    //����7.2.1��ͼ���ڽӾ���洢�ṹ
	    public void setRowsColumns(int m, int n)
	    {
	        if (m>0 && n>0)
	        {
	            if (m>this.element.length || n>this.element[0].length)
	            {                                                  //����ָ���������������ϴ�ʱ�������ά��������
	                int[][] source = this.element;
	                this.element = new int[m*2][n*2];              //���������ά����ռ䣬Ԫ�س�ֵΪ0
	                for (int i=0; i<this.rows; i++)                //����ԭ��ά����Ԫ��
	                    for(int j=0; j<this.columns; j++)
	                        this.element[i][j] = source[i][j];
	            }
	            this.rows = m;
	            this.columns = n;
	        }
	        else throw new IllegalArgumentException("�������������ܡ�0��m="+m+"��n="+n);
	    }
	    
	    //��һ�������ת�þ���
		public Matrix transpose() {
			Matrix tranMatrix=new Matrix(columns,rows);
			
			 for (int i=0; i<this.element.length&&i<this.rows;i++)          //valueԪ�ز���ʱ��0�����Զ���Ԫ��
		            for (int j=0; j<this.element[i].length&&j<this.columns;j++)
		            	tranMatrix.element[j][i]=this.element[i][j];
			return tranMatrix;
		}
	//�ж�һ�������Ƿ�Ϊ�����Ǿ���
		public boolean isUpperTriangularMatrix() {
			for (int i=0; i<this.element.length&& i<this.rows; i++) {
	            for (int j=0; j<this.element[i].length && j<this.columns; j++){
	           if(i<=j)break;
	else{
	if(this.element[i][j]==0)
	break;
	else
	return false;
	}
	}
			}return true;

		}
	//�ж�һ�������Ƿ�Ϊ�����Ǿ���
		public boolean isLowerTriangularMatrix() {
			for (int i=0; i<this.element.length&& i<this.rows; i++) {
	            for (int j=0; j<this.element[i].length && j<this.columns; j++){
	           if(i>=j)break;
	else{
	if(this.element[i][j]==0)
	break;
	else
	return false;
	}
	}
			}return true;
		}
	//�ж�һ�������Ƿ�Ϊ�Գƾ���
		public boolean isSymmetricMatrix () {
			if(this.rows!=this.columns)
				//JOptionPane.showMessageDialog(null,"��������ͬ�ͣ��޷����㣡","��Ϣ", JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(null,"�þ���Ϊ�����޷��ж��Ƿ�Ϊ�Գƾ���","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
				else{

				for (int i=0; i<this.element.length&& i<this.rows; i++) {
				            for (int j=0; j<this.element[i].length && j<this.columns; j++){
				if(this.element[i][j]==this.element[j][i])break;
				else return false;
				}
					}
				}return true;

		}
	//�Ƚ����������Ƿ����
		public boolean equals(Matrix a) {
		if(this.rows!=a.rows||this.columns!=a.columns){
				return false;
			}
		if(this.rows==a.rows&&this.columns==a.columns){
			for (int i=0; i<this.element.length&&i<this.rows;i++){      
		            for (int j=0;j<this.element[i].length&&j<this.columns;j++){
		            	if(a.element[i][j]==this.element[i][j]){
		            		break;	      	
		            	}else
		            		return false;	
		            }
			}
			}
		return true;
		}
		
	    //����this+b
		public Matrix add(Matrix b) {
			Matrix subMatrix=new Matrix(this.rows,this.columns);    
			if(this.rows==b.rows&&this.columns==b.columns){
				
				for (int i=0; i<b.element.length&& i<rows; i++)          //valueԪ�ز���ʱ��0�����Զ���Ԫ��
		            for (int j=0; j<b.element[i].length&& j<columns;j++)
		            	subMatrix.element[i][j]=(this.element[i][j]+b.element[i][j]);	
			}else{
				JOptionPane.showMessageDialog(null,"��������ͬ�ͣ��޷����㣡","��Ϣ", JOptionPane.WARNING_MESSAGE);
			}
			return subMatrix;
		}  
	    //����this-b
		public Matrix sub(Matrix b) {
			Matrix subMatrix=new Matrix(this.rows,this.columns);    
			if(this.rows==b.rows&&this.columns==b.columns){
				
				for (int i=0; i<b.element.length&& i<rows; i++)          //valueԪ�ز���ʱ��0�����Զ���Ԫ��
		            for (int j=0; j<b.element[i].length&& j<columns;j++)
		            	subMatrix.element[i][j]=(this.element[i][j]-b.element[i][j]);	
			}else{
				JOptionPane.showMessageDialog(null,"��������ͬ�ͣ��޷����㣡","��Ϣ", JOptionPane.WARNING_MESSAGE);
			}
			return subMatrix;
		}   
		
		//����this*b
		public Matrix multiply(Matrix b){
			Matrix subMatrix=new Matrix(this.rows,this.columns);    
			if(this.rows==b.rows&&this.columns==b.columns){
				
				for (int i=0; i<b.element.length&& i<rows; i++)          //valueԪ�ز���ʱ��0�����Զ���Ԫ��
		            for (int j=0; j<b.element[i].length&& j<columns;j++)
		            	subMatrix.element[i][j]=(this.element[i][j]*b.element[i][j]);	
			}else{
				JOptionPane.showMessageDialog(null,"��������ͬ�ͣ��޷����㣡","��Ϣ", JOptionPane.WARNING_MESSAGE);
			}
			return subMatrix;
		}
}
