package Finals;
//I implements every course so that it will make me easier to access them 
//also to not forget all the attributes needed before i start in creating an machine learning algorithm
public class InfoAndRequirements implements BSHM, BHCM, BSTM, BSCpE
{ 
	void requiremets() 
	{
		System.out.println("-Health Insurance\n" + "-Vaccinated\n" + "-Facemask and Alcohol\n");
	}
	
	void availableCourse() 
	{
		System.out.println("-BS in Hospitality Management(BSHM)\n" + "-BS in Culinary Management(BHCM)\n"
	                     + "-BS in Tourism and Management(BSTM)\n" + "-BS in in Computer Engineering(BSCpE)\n");
	}	

}
