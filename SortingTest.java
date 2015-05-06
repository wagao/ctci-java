public class SortingTest{

public static void main(String args[]) {
System.out.println("Class initilized!" );

int[] A= {34353,4565,8,234,9,3,960,5324,108,2348};

boolean ascornot = true;
if ( !StrUtil.IsNull(args) && (args[0].equalsIgnoreCase("D") || args[0].equalsIgnoreCase("desc")  || args[0].equalsIgnoreCase("des") ) )  ascornot = false;


//for(int i=0;i<A.length;i++)
//System.out.println(A[i]);
 //if (ascornot == false )   System.out.println("::");


//A = Sort.InsertionSort( A, ascornot );
A = Sort.MergeSort( A, ascornot , 0, A.length-1);


for(int i=0;i<A.length;i++)
System.out.println("--"+A[i]);

}

}