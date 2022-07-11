package AdjacencyList;

import java.util.ArrayList;

public class Main 
{

	public static void main(String[] args) 
	{
//A list consisting of list		
		ArrayList<ArrayList> adjList = new ArrayList<>();
		
		char[] vertices =  {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
		int num = 7; //number of vertices
		
		for (int i = 0; i < num; i++ ) 
		{
			adjList.add(new ArrayList<>());
		}
		
		adjList.get(0).add('B');
		adjList.get(1).add('A');
		adjList.get(1).add('C');
		adjList.get(2).add('B');
		adjList.get(2).add('D');
		adjList.get(2).add('E');
		adjList.get(3).add('C');
		adjList.get(3).add('E');
		adjList.get(3).add('F');
		adjList.get(3).add('G');
		adjList.get(4).add('C');
		adjList.get(4).add('D');
		adjList.get(4).add('F');
		adjList.get(5).add('D');
		adjList.get(5).add('E');
		adjList.get(6).add('D');
		
//for displaying letters A to G
		int v = 0; 
		
//for displaying content of each list
		for (int i = 0; i < num; i++, v++) 
		{
		System.out.println(vertices[v] + ": " + adjList.get(i));	
		}
	}

}
