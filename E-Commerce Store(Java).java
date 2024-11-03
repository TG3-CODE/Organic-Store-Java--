package pack2;
import java.util.Scanner;

import java.util.ArrayList;

public class ProjectA 
{   
	
	int total;
	int option;
	long contact;
	static ArrayList<Integer> kgs = new ArrayList<Integer>();
	static ArrayList<String> names = new ArrayList<String>();
	static ArrayList<Integer> prices = new ArrayList<Integer>();
	static Scanner sc=new Scanner(System.in);
	void meth1(int a) 
	{
		switch(a)
		{
		   case 1:
			   System.out.println("--------------------------------------");
			   System.out.println("|   101)Mango------------1kg---Rs.200--|");
			   System.out.println("|   102)Apple------------1kg---Rs.250--|");
			   System.out.println("|   103)Banana-----------1kg----Rs.50--|");
			   System.out.println("|   104)Pineapple--------1kg----Rs.70--|");
			   System.out.println("|   105)Papaya-----------1kg----Rs.60--|");
			   System.out.println("--------------------------------------");
			   System.out.println("please choose your product code:");
			   int productCode=sc.nextInt();
			   if(productCode==101)
			   {
				   String name="Mango";
				   int price=200;
				   names.add(name);
				   prices.add(price);
			   }
			   else if(productCode==102)
			   {
				   String name="Apple";
				   int price=250;
				   names.add(name);
				   prices.add(price);
			   }
			   else if(productCode==103) 
			   {
				   String name="Banana";
				   int price=50;
				   names.add(name);
				   prices.add(price);
			   }
			   else if(productCode==104) 
			   {
				   String name="Pineapple";
				   int price=70;
				   names.add(name);
				   prices.add(price);
			   }
			   else if(productCode==105)
			   {
				   String name="Papaya";
				   int price=60;
				   names.add(name);
				   prices.add(price);
			   }
			   else 
			   {
				   System.out.println(productCode+" product code is not present"); 
				   new ProjectA().meth3();
				   break;
			   }
			   System.out.println("please choose how many kgs want:");
			   int k=sc.nextInt();
			   kgs.add(k);
			   new ProjectA().meth3();
			   break;
		   case 2:
			   System.out.println("--------------------------------------");
			   System.out.println("|   201)potato--------------1kg---Rs.200--|");
			   System.out.println("|   202)brinjal-------------1kg---Rs.250--|");
			   System.out.println("|   203)Beetrrot------------1kg----Rs.50--|");
			   System.out.println("|   204)Cucumber------------1kg----Rs.70--|");
			   System.out.println("|   205)Peanuts-------------1kg----Rs.60--|");
			   System.out.println("--------------------------------------");
			   System.out.println("please choose your product code:");
			   int pCode=sc.nextInt();
			   if(pCode==201)
			   {
				   String name="potato";
				   int price=200;
				   names.add(name);
				   prices.add(price);
			   }
			   else if(pCode==202)
			   {
				   String name="brinjal";
				   int price=250;
				   names.add(name);
				   prices.add(price);
			   }
			   else if(pCode==203) 
			   {
				   String name="Beetroot";
				   int price=50;
				   names.add(name);
				   prices.add(price);
			   }
			   else if(pCode==204) 
			   {
				   String name="Cucumber";
				   int price=70;
				   names.add(name);
				   prices.add(price);
			   }
			   else if(pCode==205)
			   {
				   String name="Peanuts";
				   int price=60;
				   names.add(name);
				   prices.add(price);
			   }
			   else 
			   {
				   System.out.println(pCode+" product code is not present");
			   }
			   System.out.println("please choose how many kgs want:");
			   int kg=sc.nextInt();
			   kgs.add(kg);
			   new ProjectA().meth3();
			   break;
		  case 3:
			   System.out.println("--------------------------------------");
			   System.out.println("|   301)kajal------------1---Rs.200--|");
			   System.out.println("|   302)lip stick--------1---Rs.250--|");
			   System.out.println("|   303)nail polish------1---Rs.50---|");
			   System.out.println("|   304)face powder------1---Rs.70---|");
			   System.out.println("|   305)Lotion-----------1---Rs.60---|");
			   System.out.println("--------------------------------------");
			   System.out.println("please choose your product code:");
			   int prCode=sc.nextInt();
			   if(prCode==301)
			   {
				   String name="kajal";
				   int price=200;
				   names.add(name);
				   prices.add(price);
			   }
			   else if(prCode==302)
			   {
				   String name="lip stick";
				   int price=250;
				   names.add(name);
				   prices.add(price);
			   }
			   else if(prCode==303) 
			   {
				   String name="nail polish";
				   int price=50;
				   names.add(name);
				   prices.add(price);
			   }
			   else if(prCode==304) 
			   {
				   String name="face powdee";
				   int price=70;
				   names.add(name);
				   prices.add(price);
			   }
			   else if(prCode==305)
			   {
				   String name="lotion";
				   int price=60;
				   names.add(name);
				   prices.add(price);
			   }
			   else
			   {
				  System.out.println(prCode+" product code is not present");
			   }
			   System.out.println("please choose how many kgs want:");
			   int quantity=sc.nextInt();
			   kgs.add(quantity);
			   new ProjectA().meth3();
			   break;
		  case 4:
			  System.out.println("|   401)Masala All in one------1packet---Rs.500--|");
			  int prdCode=sc.nextInt();
			  if(prdCode==401) 
			  {
				  String name="Masala All in one";
				  int price=500;
				  names.add(name);
				  prices.add(price);
			  }
			  else 
			  {
				   System.out.println(prdCode+" product code is not present");
			  }
			  System.out.println("please choose how many packets want:");
			  int packets=sc.nextInt();
			  kgs.add(packets);
			  new ProjectA().meth3();
			  break;
		  case 5:
			  System.out.println("shopping is done");
			  new ProjectA().meth3();
			  break;
		  default:
			  System.out.println("The option you have chosen is not in this list");
			  new ProjectA().meth3();
			  break;
		}
	}
	void meth2() 
	{
		System.out.println("Enter your name:");
		String nam=sc.next();
		System.out.println("Enter your address:");
		String addrs=sc.next();
		System.out.println("Enter your contact no:");
		contact=sc.nextLong();
		sc.close();
		System.out.println("--------------------------------------");
		System.out.println("-----Welcome to Dilbahaar Store-----");
		System.out.println("--------------------------------------------------");
		System.out.println("S.no   |   Qty  | Name                | Price");
		System.out.println("---------------------------------------------------");
		for(int i=1;i<=kgs.size();i++) 
		{
			System.out.println(i+"          "+kgs.get(i-1)+"          "+names.get(i-1)+"                "+ kgs.get(i-1)*prices.get(i-1));
			
		}
		for(int i=1;i<=prices.size();i++) 
		{
			total=total+(prices.get(i-1)*kgs.get(i-1));
		}
		System.out.println("total cost :  "+total);
		System.out.println("Final price with discount 30% is: "+(total-(total*30)/100));
		System.out.println("contact number: "+contact);
		System.out.println("Nmae is: "+nam);
		System.out.println("address is: "+addrs);
		System.out.println("java is awesome");
		
	}
	void meth3()
	{
		System.out.println("press 1 to continue");
		System.out.println("press 2 to exit");
		int i = sc.nextInt();
		if(i==1) {
			System.out.println("Please choose your option:");
			option=sc.nextInt();
			new ProjectA().meth1(option);
		}
		else 
		{
			new ProjectA().meth2();
		}
	}

	public static void main(String[] args)
	{
		System.out.println("Project1");
		System.out.println("--------------");
		System.out.println("--------------------------------------");
		System.out.println("-------Welcome to Organic Store-----");
		System.out.println("--------------------------------------");
		System.out.println("|         1)Fruits                   |");
		System.out.println("|         2)Vegetables               |");
		System.out.println("|         3)Cosmetics                |");
		System.out.println("|         4)Masala Powders           |");
		System.out.println("|         5)Exit                     |");
		System.out.println("--------------------------------------");
		System.out.println("Please choose your option:");
		int option=sc.nextInt();
		ProjectA aobj=new ProjectA();
		aobj.meth1(option);	
	}
}
