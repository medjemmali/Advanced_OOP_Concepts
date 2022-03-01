import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Counter<E> {
    private HashMap<E, Integer> counts;

    public Counter(E[] things) {
/* TODO
Loop through the elements of "things" and use the HashMap "counts"
to store the elements of things as keys, and the number of times they
appear in the array as values. Check the instructions. */
        counts = new HashMap<>();
        for (E temp : things) {
            if(counts.containsKey(temp))
                counts.put(temp, counts.get(temp) + 1);
            else
                counts.put(temp,1);
        }
    }

    public Integer getCount(E element){
      /* TODO 
This just returns the specific count for an element. It is a wrapper
for a getting the value of the HashMap given the key "element" */
        return (Integer) counts.get(element);

    }

    public int getSize(){
        return this.counts.size();
    }

    public E mostFrequent() {
        /* TODO
Returns the most frequent key in the HashMap*/
        E mostFreq = null;
        Set<E> keys = counts.keySet();
        int maximum = 0;
        for (E key : keys) {
            Integer value = counts.get(key);
            if (value > maximum) {
                maximum = value;
                mostFreq = key;
            }
        }
        return mostFreq;
    }

}
