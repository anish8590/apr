import java.util.*;  

public class test{  

 public static void main(String args[]){  

  	ArrayList<String> list=new ArrayList<String>();//Creating arraylist   

  	//1.Adding products in arraylist  
  	Scanner sc= new Scanner(System.in);  
	System.out.print("Enter no. of products: "); 
	int n= sc.nextInt();
	sc.nextLine();
	System.out.println("Enter products: "); 
	for(int i=0;i<n;i=i+1)
	{ 
	  String str= sc.nextLine();        
      list.add(str);
    } 

    //2.Printing all products name  
    System.out.println(list); 
    System.out.print("{");
    for(int i=0;i<n-1;i=i+1)
	{ 
	  System.out.print(list.get(i)+", ");
    } 
    System.out.println(list.get(n-1)+"}");

    //3.display first and last product
    int s=list.size();
    System.out.println("first product:"+list.get(0));
    System.out.println("last product:"+list.get(s-1));

    //4.remove a product from list
    System.out.print("Enter a product to remove: "); 
    String str= sc.nextLine();  
    int i=list.indexOf(str);
    list.remove(i);
    System.out.println(list);  
 }  

}  