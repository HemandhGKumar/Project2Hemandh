package packagemarch;

public class Operator {

	public static void main(String[] args) {
		int a=50,b=47;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
		int c=20,d=30;
		System.out.println("c+d="+(c+=d));
		System.out.println("c-d="+(c-=d));
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		
         String username="ABC";
         String password="777";
         System.out.println(username=="ABC" && password=="777");
         System.out.println(username=="abc" && password=="77");
         System.out.println(username=="ABC" || password=="78");
         
         int h=54;
         System.out.println("h+1="+(++h));
         System.out.println("h-1="+(--h));
         
         int k=45,l=65,temp;
         temp=k;
         k=l;
         l=temp;
         System.out.println("after swapping value of k="+k);
         System.out.println("after swapping value of l="+l);
         
         int p=70,q=90;
         p=p+q; //160
         q=p-q; //70
         p=p-q; //90
         System.out.println("swapped value of p="+p);
         System.out.println("swapped value of q="+q);
         
         int e=23,o=45;
         System.out.println(e==o);
         
         int i=55,u=70;
         System.out.println(i<50 && i<u);
         
         
         int x=17;
         System.out.println("The second digit is"+(x%10));
         
         
         
         
    
    
      
	}

}
