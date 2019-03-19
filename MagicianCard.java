import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * 
 */

/**
 * @author Ashutosh
 *
 */
public class MagicianCard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N=5;
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		List<Integer> list = new ArrayList<Integer>();
		List<String> random_list = new ArrayList<String>();
		Random rand = new Random();
		int pickedNumber = rand.nextInt(N) + 1;
		
		for(int i=0;i<pickedNumber;i++) {
			
			Random rand_pick = new Random();
			
			int picked_cards = rand_pick.nextInt(N)+1;
			list.add(picked_cards);
			
		}
		int index =0;
		map.put(index,"apple");
		index++;
		map.put(index,"rice");
		index++;
		map.put(index,"orange");
		index++;
		map.put(index, "banana");
		index++;
		map.put(index, "chickoo");
		index++;
		
		
		
	
			Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			int key = (int) pair.getKey();
			for(int j=0;j<list.size();j++) {
				if(list.get(j)== key) {
				//	System.out.println(pair.getValue());
					if(!random_list.contains(pair.getValue()))
				{
					random_list.add((String) pair.getValue());
					
				}
				}
				
			}
			
			}
		
		
		for(int k=0;k<random_list.size();k++) {
			
			System.out.println(random_list.get(k).toString());
			
		}
		
	}

}
