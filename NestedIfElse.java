
public class NestedIfElse
{
	public static void main(String[] args) {
	    int a=33,b=14,c=5;
	    int result=0;
    	if(a>b){
    	    if(a>c)
    	        result = a;
    	    else
    	        result = c;
    	    }
        else{
    	    if(b>c)
    	        result = b;
    	    else
    	        result = c;
    	    }
    	System.out.println(result);
    }
}


// With turnary operator


public class NestedIfElse
{
	public static void main(String[] args) {
	    int a=33,b=44,c=95;
	    int result=0;
        //Turnary operator - always return
        result = a>b? a>c? a:c : b>c? b:c;
    	System.out.println(result);
    }
}




