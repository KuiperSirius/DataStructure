public class ShiYan8
{
    public static void main(String args[])
    {
        int m1[][]={{1,2,3},
                    {4,5,6}};
        Matrix a=new Matrix(2,3,m1); 
        
        int m2[][]={{1,0,0},
                    {0,1,0}};
        Matrix b=new Matrix(2,3,m2);
         
        int m3[][]={{1,0,6},
        			{0,2,0},
                    {0,0,3}};
        Matrix c=new Matrix(3,3,m3);
    
        System.out.print("a  "+a.toString());
        System.out.print("b  "+b.toString());
        System.out.print("c  "+c.toString());
        
        Matrix d1=a.add(b);
        System.out.print("a+b= "+d1.toString());

        Matrix d2=a.sub(b);
        System.out.print("a-b= "+d2.toString());
    
        Matrix d3=a.multiply(c);
        System.out.print("a*c= "+d3.toString()); 
        
        Matrix d4=a.transpose();
        System.out.print("a的转置矩阵为：\n"+d4.toString());
          
        System.out.println("c是对称阵吗？  "+c.isSymmetricMatrix()); 
        
        System.out.println("c是上三角阵吗？  "+c.isUpperTriangularMatrix()); 
        
        System.out.println("c是下三角阵吗？  "+c.isLowerTriangularMatrix()); 
        
        System.out.println("a和b矩阵相等吗？  "+a.equals(b));
    }
}
