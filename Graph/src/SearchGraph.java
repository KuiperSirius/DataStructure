import java.util.ArrayList;
import java.util.LinkedList;

public class SearchGraph<T> {
/**����ͼ���ڵ�����Ϊ����T
*/
int edgeNum;//����ͼ�ı���
int[][] edgeMatrix;//���ڽӾ��󴢴�ͼ�ı�
ArrayList<T> vertexList;//���ÿɱ�����洢ͼ�Ľڵ�	

public 	SearchGraph(int n){
	vertexList=new ArrayList<T>(n);
	edgeNum=0;
	edgeMatrix=new int[n][n];
}

//�õ�ͼ�������������
	public int getVertexNum(){
		return vertexList.size();
	}
//�õ�ͼ�еı���
	public int getEdgeNum(){
		return edgeNum;
	}
//����ָ��T���͵Ľڵ�
	public void insertVertex(T value){
		vertexList.add(vertexList.size(),value);
	}
//�õ�ָ���±�Ľ����ֵ
	public T getVertexValue(int i){
		return vertexList.get(i);
	}
//���ָ�����֮��ߵ�Ȩ
	public int getWeight(int i,int j){
		return edgeMatrix[i][j];
	}
//��ֵ���ض���Ȩ
	public void insertEdge(int i,int j,int value){
		edgeMatrix[i][j]=value;
		edgeNum++;
	}
//ɾ���ض���
	public void deletetEdge(int i,int j){
			edgeMatrix[i][j]=0;
			edgeNum--;
		}	
//���ָ�����ĵ�һ���ڽӽڵ���±�
	public int getFirstNeighbor(int vertexIndex){
		if(vertexIndex>=0&&vertexIndex<vertexList.size()){
			for(int j=0;j<vertexList.size();j++){
				if(edgeMatrix[vertexIndex][j]>0){
					return j;
				}
				return -1;
			}
		}	
		return -1;
	}
//���ָ���ڵ����һ���ڽӽڵ���±�	,indexΪָ���ڵ㣬knownNeighborΪ�ϴλ���ڽӽ���±�
	public int getNextNeighbor(int index,int knownNeighbor){
		for(int j=knownNeighbor+1;j<vertexList.size();j++){
			if(edgeMatrix[index][j]>0){
				return j;
			}
		}
		return -1;
	}
//������ȱ����㷨DFS��˽�з�������������
	private void depthFirstSearch(boolean[] visited,int v){
		System.out.println(vertexList.get(v)+"");
		visited[v]=true;//��ʾ�Ѿ����ʹ����±�
		
		int next=getFirstNeighbor(v);
		while(next!=-1){
			if(!visited[next]){
				depthFirstSearch(visited,next);
			}
			next= getNextNeighbor(v,next);
		}	
	}	
//�ɹ��ⲿ���õ���������㷨
	public void depthFirstSearch(){
		//Ĭ�ϲ�����������false
	boolean[] visited=new boolean[getVertexNum()];	
		for(int i=0;i<getVertexNum();i++){
			//δ���ʵ�Ԫ���±꣬�ж�����visited[i]==false
			if(!visited[i]){
				this.depthFirstSearch(visited,i);
			}
		}	
	}
	
	//�ɹ��ⲿ���õĹ�������㷨	
	public void boardFirstSearch(){
		//Ĭ�ϲ�����������false
		boolean[] visited=new boolean[getVertexNum()];	
			for(int i=0;i<getVertexNum();i++){
				//δ���ʵ�Ԫ���±꣬�ж�����visited[i]==false
				if(!visited[i]){
					this.depthFirstSearch(visited,i);
				}
			}	
	
	}
	
	private void boardFirstSearch(boolean[] visited,int w){
		System.out.println(vertexList.get(w)+"");
		visited[w]=true;
		LinkedList queue=new LinkedList();
		queue.addLast(w);
		int first;
		first=getFirstNeighbor(w);
		while(first!=-1){
			System.out.println(vertexList.get(first)+"");
			
			
			
			getNextNeighbor(w,first);
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
