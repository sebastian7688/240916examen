package java.service;
import java.util.Random;

public class service_list {
	public int[] generate(){
	      Random rand = new Random(); 
	      int[] list = new int[5];
	      for(int i=0;i<list.length;i++)
	      {
	    	  list[i]=rand.nextInt();
	      }
	      return list;
	}

}

