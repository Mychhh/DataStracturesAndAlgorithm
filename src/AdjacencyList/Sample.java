package AdjacencyList;

import java.util.ArrayList;

public class Sample 
{

	public static void main(String[] args) 
	{
//A list consisting of list		
		ArrayList<ArrayList> adjList = new ArrayList<>();
		
		char[] vertices =  {'A', 'B', 'C', 'D', 'E'};
		int num = 5; //number of vertices
				
		for (int i = 0; i < num; i++ ) 
		{
		adjList.add(new ArrayList<>());
		}
				
		adjList.get(0).add('B');
		adjList.get(0).add('C');
		adjList.get(1).add('A');
		adjList.get(2).add('A');
		adjList.get(2).add('D');
		adjList.get(3).add('C');
		adjList.get(3).add('E');
		adjList.get(4).add('B');
				
//for displaying letters A to E
		int v = 0; 
				
//for displaying content of each list
		for (int i = 0; i < num; i++, v++) 
		{
		System.out.println(vertices[v] + ": " + adjList.get(i));	
		}
	}

}
