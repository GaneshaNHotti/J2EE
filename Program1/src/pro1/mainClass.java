package pro1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class mainClass {
		public  static  void  main(String  args[])  { String  name;
		Scanner  input=new  Scanner(System.in); HashMap<String,String>  hm=new  HashMap<String,String>(); hm.put("1234567890","Sam");
		hm.put("5678996666","Amy");
		hm.put("3456677789","Roshan");
		hm.put("9885645328","Rose");
		hm.put("9897862777","ABC");
		ArrayList<missedCall>  arr=new  ArrayList<missedCall>(5);
		while(true) {
		System.out.println("Enter\n1  to  call\n2  to  display\n3  to exit\n");
		int  ch=input.nextInt();
		switch(ch) {
		case 1:
		System.out.println("Enter  the  Phone  number"); String  ph=input.next(); System.out.println("Enter  the  time  of  call"); String  time=input.next();
		if  (hm.containsKey(ph)){ name=hm.get(ph);
		} 
		else {
				
		}
		 

		name="Private  caller"; 
		System.out.println("Incoming  call  by  "+name); missedCall  m=new  missedCall(name,time,ph); if(arr.size()==5)  { 
		arr.remove(0);
		}
		arr.add(m);
		break; case 2:
		for  (missedCall  mc:  arr)  { System.out.println(mc);

		}
		for(int  i=arr.size()-1;i>=0;i--)  { 
			System.out.println(arr.get(i).ph); 
			System.out.println("Enter\n1  to  delete  call\n2  to move  on  to  next\n3  to  display  detials\n");
			int  c=input.nextInt();
			if(c==1) {
				arr.remove(i);
					}
			if(c==2) {
				continue;
				}
			if(c==3) {
				System.out.println(arr.get(i));
					}

		}
		break; case 3:
		System.exit(0);

		default:System.out.println("Invalid  choice");

		}
		}

		}

}
