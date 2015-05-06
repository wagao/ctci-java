public class Sort{

public static void main(String args[]) {
System.out.println("Class initilized!" );

}


public static int[] Merge( int[] A, boolean ASCornot, int h, int m, int r){ 
int n = A.length ;
if (  n<= 1  )
{
return A;
} 
int i, j, mode;

if ( ASCornot == true)//sort asc
mode =1;
else  // sort desc
mode = -1;

int nl= m-h+1;
int nr= r-m;

int[] L = new int[nl+1];
int[] R = new int[nr+1];

for ( i=0 ; i<nl ; i++)
L[i]=A[h+i];
for( j=0 ; j<nr ; j++)
R[j]=A[m+j+1];

L[nl]=mode *999999;
R[nr]=mode *999999;

i=0;j=0;int k=0;
for(k=h;k<=r;k++){
	if( mode *(L[i]-R[j]) <=0 ){
	A[k] = L[i]; //System.out.println(k+":"+i);
	i=i+1;
	} else {
	A[k] = R[j];//System.out.println(k+":"+j);
	j=j+1;
	}
}
return A;

}

public static int[] MergeSort( int[] A, boolean ASCornot, int h, int r){

int n = A.length ;
if (  n<= 1  )
{
return A;
} 
int m;

if (h<r)  { 
	m=(int)Math.floor((h+r)/2);
	MergeSort(A,ASCornot,h,m);
	MergeSort(A,ASCornot,m+1,r);
	Merge(A,ASCornot,h,m,r);
}
return A;
}


public static int[] InsertionSort(int[] A, boolean ASCornot){

int n = A.length ;
if (  n<= 1  )
{
return A;
} 

int key =0;
int j =1;
int i,mode;

if ( ASCornot == true)//sort asc
mode =1;
else  // sort desc
mode = -1;

for (j=1;j<n;j++)
{
	key = A[j]; 
	for (i= j-1;i>=0;i--) {
		if ( mode*(A[i]- key) > 0 ) { A[i+1]=A[i];A[i]=key; }
		//System.out.println(i+":"+j);
	}//end i-for loop
}//end j-for loop

return A;

}


}