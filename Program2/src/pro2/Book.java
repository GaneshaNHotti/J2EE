package pro2;

public class Book	{

String  title,  author,  publisher; Double  price;

public Book(String  t,  String  aut,  String  pub,  Double  pr)  { 
	title = t;
	author  =  aut; 
	publisher  =  pub; 
	price = pr;
}


public  String  toString()  {
return  "Book  Details  :  Title  "  +  title  +  "\n  Author  "  +  author  +  "\n"  +  " Publisher  "  +  publisher  +  "\n"
+  "price  "  +  price;
}


}
