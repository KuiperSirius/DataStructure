
public class TestMain {

	public static void main(String[] args) {
		
		SearchGraph<String> graph=new SearchGraph<String>(8);
		String str="ABCDEFGH";
		for(int i=0;i<str.length();i++){
			graph.insertVertex(String.valueOf(str.charAt(i)));
			
		}
		graph.insertEdge(0,1,15);
		graph.insertEdge(1,0,15);
		graph.insertEdge(1,3,20);
		graph.insertEdge(3,1,20);
		graph.insertEdge(0,2,60);
		graph.insertEdge(2,0,60);
		graph.insertEdge(1,4,1);
		graph.insertEdge(4,1,1);
		graph.insertEdge(2,5,1);
		graph.insertEdge(5,2,1);
		graph.insertEdge(2,6,1);
		graph.insertEdge(6,2,1);
		graph.insertEdge(3,4,1);
		graph.insertEdge(4,3,1);
		graph.insertEdge(5,7,1);
		graph.insertEdge(7,5,1);
		graph.depthFirstSearch();	
	}

}
