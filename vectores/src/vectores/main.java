package vectores;
import java.util.Iterator;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        
		ArrayList<String> Lista =new ArrayList<String>();
		
		Lista.add("Papel Higenico");
		Lista.add("Leche");
		Lista.add("Cafe");
		Lista.add("Manteca");
		Lista.get(1);
		 
		
		Iterator<String> elQueItera=Lista.iterator();
		while(elQueItera.hasNext())
		{
			String elemento= elQueItera.next();
			
			if(elemento.equals("Manteca"))
			{
				// elQueItera.remove();
			}
			
		} 
      for(String elemento:Lista)
      {
    	  if(elemento.equals("Mnateca"))
    	  {
    		  Lista.remove(elemento);
    	  }
    	  
      }
	}

}
