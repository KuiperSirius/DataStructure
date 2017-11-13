import javax.swing.JOptionPane;

public class Matrix {
		protected int rows, columns;                           //矩阵行数、列数
	    protected int[][] element;                             //二维数组，存储矩阵元素

	    public Matrix(int m, int n)                            //构造m×n零矩阵。若m或n为负数，Java抛出负数组长度异常
	    {
	        this.element = new int[m][n];                      //数组元素初值为0
	        this.rows = m;
	        this.columns = n;
	    }
	    public Matrix(int n)                                   //构造n×n零方阵
	    {
	        this(n,n); 
	    }
	    public Matrix(int m, int n, int[][] value)             //构造m×n矩阵，由value[][]提供元素
	    {
	        this(m, n);
	        for (int i=0; i<value.length && i<m; i++)          //value元素不足时补0，忽略多余元素
	            for (int j=0; j<value[i].length && j<n; j++)
	               this.element[i][j] = value[i][j];
	    }

	    public int getRows()                                   //返回矩阵行数
	    {
	        return this.rows;
	    }
	    public int getColumns()                                //返回矩阵列数
	    {
	        return this.columns;
	    }
	    public int get(int i, int j)                 //返回矩阵第i行第j列元素。若i、j越界，抛出序号越界异常
	    {
	        if (i>=0 && i<this.rows && j>=0 && j<this.columns) 
	            return this.element[i][j];
	        throw new IndexOutOfBoundsException("i="+i+"，j="+j);
	    }
	    public void set(int i, int j, int x)         //设置矩阵第i行第j列元素为x。若i、j越界，抛出序号越界异常
	    {
	        if (i>=0 && i<this.rows && j>=0 && j<this.columns) 
	            this.element[i][j]=x;
	        else throw new IndexOutOfBoundsException("i="+i+"，j="+j);
	    }
	    
	    public String toString()                               //返回矩阵所有元素的描述字符串，行主序遍历
	    {
	        String str=" 矩阵"+this.getClass().getName()+"（"+this.rows+"×"+this.columns+"）：\n";
	        for (int i=0; i<this.rows; i++)
	        {
	            for (int j=0; j<this.columns; j++)
	                str+=String.format("%6d", this.element[i][j]); //"%6d"格式表示十进制整数占6列
	            str += "\n";
	        }
	        return str;
	    }
	    
	    //设置矩阵为m行n列。若参数指定行列数较大，则将矩阵扩容，并复制原矩阵元素。
	    //用于7.2.1节图的邻接矩阵存储结构
	    public void setRowsColumns(int m, int n)
	    {
	        if (m>0 && n>0)
	        {
	            if (m>this.element.length || n>this.element[0].length)
	            {                                                  //参数指定的行数或列数较大时，扩充二维数组容量
	                int[][] source = this.element;
	                this.element = new int[m*2][n*2];              //重新申请二维数组空间，元素初值为0
	                for (int i=0; i<this.rows; i++)                //复制原二维数组元素
	                    for(int j=0; j<this.columns; j++)
	                        this.element[i][j] = source[i][j];
	            }
	            this.rows = m;
	            this.columns = n;
	        }
	        else throw new IllegalArgumentException("矩阵行列数不能≤0，m="+m+"，n="+n);
	    }	    
	    //求一个矩阵的转置矩阵
		public Matrix transpose() {
			Matrix tranMatrix=new Matrix(columns,rows);
			
			 for (int i=0; i<this.element.length&&i<this.rows;i++)          //value元素不足时补0，忽略多余元素
		            for (int j=0; j<this.element[i].length&&j<this.columns;j++)
		            	tranMatrix.element[j][i]=this.element[i][j];
			return tranMatrix;
		}
	//判断一个矩阵是否为上三角矩阵
		public boolean isUpperTriangularMatrix() {
			for (int i=0; i<this.element.length&& i<this.rows; i++) {
	            for (int j=0; j<this.element[i].length && j<this.columns; j++){
	           if(i<=j) continue;
	else{
	if(this.element[i][j]==0)
	;
	else
	return false;
	}
	}
			}return true;

		}
	//判断一个矩阵是否为下三角矩阵
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
	//判断一个矩阵是否为对称矩阵
		public boolean isSymmetricMatrix() {
			if(this.rows!=this.columns)
				//JOptionPane.showMessageDialog(null,"两个矩阵不同型，无法运算！","消息", JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(null,"该矩阵不为方阵，无法判断是否为对称矩阵","提示信息",JOptionPane.WARNING_MESSAGE);
				else{

				for (int i=0; i<this.element.length&& i<this.rows; i++) {
				            for (int j=0; j<this.element[i].length && j<this.columns; j++){
				if(this.element[i][j]==this.element[j][i])break;
				else return false;
				}
					}
				}return true;

		}
	//比较两个矩阵是否相等
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
		
	  //矩阵this+b
		public Matrix add(Matrix b) {
			Matrix subMatrix=new Matrix(this.rows,this.columns);    
			if(this.rows==b.rows&&this.columns==b.columns){
				
				for (int i=0; i<b.element.length&& i<rows; i++)          //value元素不足时补0，忽略多余元素
		            for (int j=0; j<b.element[i].length&& j<columns;j++)
		            	subMatrix.element[i][j]=(this.element[i][j]+b.element[i][j]);	
			}else{
				JOptionPane.showMessageDialog(null,"两个矩阵不同型，无法运算！","消息", JOptionPane.WARNING_MESSAGE);
			}
			return subMatrix;
		}  
	    //矩阵this-b
		public Matrix sub(Matrix b) {
			Matrix subMatrix=new Matrix(this.rows,this.columns);    
			if(this.rows==b.rows&&this.columns==b.columns){
				
				for (int i=0; i<b.element.length&& i<rows; i++)          //value元素不足时补0，忽略多余元素
		            for (int j=0; j<b.element[i].length&& j<columns;j++)
		            	subMatrix.element[i][j]=(this.element[i][j]-b.element[i][j]);	
			}else{
				JOptionPane.showMessageDialog(null,"两个矩阵不同型，无法运算！","消息", JOptionPane.WARNING_MESSAGE);
			}
			return subMatrix;
		}   		
		//矩阵this*b
		public Matrix multiply(Matrix b){
			Matrix mulMatrix=new Matrix(this.rows,b.columns);  
			//判断运算的可行性
			if(this.columns!=b.rows){				
				JOptionPane.showMessageDialog(null,"两个矩阵类型不匹配，无法进行乘法运算！","消息", JOptionPane.WARNING_MESSAGE);
				return null;
			}
			else{		
				//定义两个矩阵行列下标。
			 int i,j,k,l;
        	 //遍历乘积二维数组，定义行列下标m_i,m_j.
        	 for (int m_i=0;m_i<mulMatrix.element.length&& m_i<rows; m_i++)    {
		            for (int m_j=0;m_j<mulMatrix.element[m_i].length&&m_j<columns;m_j++){
		            //	mulMatrix.element[m_i][m_j]
		            	int number=0;
		            	i=0;j=0;k=0;l=0;
		            	while(j<this.columns&&k<b.rows){
		            number+=(this.element[m_i][j++]*b.element[k++][m_j]);  }		            	
		            	mulMatrix.element[m_i][m_j]=number;	  		            	
	  }//内层for循环:遍历某一行中各个元素
       	 }//外层for循环:遍历二维数组所有行
         
			} //else作用域
			return mulMatrix;
		}
}
