package functionaljava;

import fj.F;
import fj.data.List;

import java.util.ArrayList;

import static fj.Show.listShow;
import static fj.Show.stringShow;
import static fj.data.List.list;

public final class App 
{
    public static void main( String[] args )
    {
	    // standard java
	    final java.util.List<Integer> fooList = new ArrayList<Integer>();
	    fooList.add(5);
	    fooList.add(10);
	    fooList.add(20);
	    
	    // convert list of Integer to list of String
	    final java.util.List<String> barList = new ArrayList<String>(fooList.size());
	    for (Integer foo : fooList) {
		    // etc...
		    barList.add(String.valueOf(foo));
	    }
	    
	    // becomes functional java
	    final List<Integer> a = list(5, 10, 20);
	    final List<String> b = a.map(new F<Integer,String>() {
		    @Override
	        public String f(final Integer val) {
			    return String.valueOf(val);
		    }
	    });
	    listShow(stringShow).println(b); 
    }
}
