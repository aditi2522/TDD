import java.util.*;
class TDD{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of test cases");
	int n=sc.nextInt();
	System.out.println("Enter String");
	for(int i=0;i<n;i++){
	  String a=sc.nextLine();
	  String b="";
	  for(int j=0;j<a.length();j++){
		if(j<2 && (a.charAt(j)=='A' || a.charAt(j)=='a')){
		
		b+="";
	}
	else{
		b+=a.charAt(j);
	}
	
}
	System.out.println(b);
}
	
	
}
}