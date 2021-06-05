// Size in memory in bytes 

/*

byte   1 
short  2
char   1
int    4
long   8 
float  4 
double 8
boolean   1

Note:=> Type cast from upp to botton is easily come by automatic type casting
*/

// Type Casting

// Note:=> Type cast from bottom to up is done by giving extra type.

public class TypeCasting{
    public static void main(String[] args){ 
        // Automatic #Easy conversion
        int i =10;
        double d = i ;
        System.out.println(d);
        
        // User ko smjhana padega
        double c = 69.69;
        byte j = (byte)c;
        System.out.print(j);
    }
}

