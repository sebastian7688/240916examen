package controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class list_controller {
	@GetMapping("number/{id}")
    public String list_random(@PathVariable Long id) {
		int[] lista= generate();
		
		for(int i=0;i<lista.length;i++)
		{
			if(lista[i]==id)
			{
				return lista+"SI existe el identificador"+String.valueOf(id);
			}
		}
		return lista+"NO existe el identificador"+String.valueOf(id);
	}
	
	
	
	
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
