package Pro2;
import  java.util.*;

class  PriceCompare  implements  Comparator<Book> {
	public  int  compare(Book  b1,Book  b2)  {
			return(int)(b1.price-b2.price); 
	}
}
