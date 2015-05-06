public class StrUtil{

public static void main(String args[]) {
System.out.println("Class initilized!" );


if ( !IsNull(args) && !IsEmpty(args[0])  )
System.out.println("Sth" );
else
System.out.println("Empty" );

}


public static boolean IsNull(String args[]){

if (  args.length> 0  )
{
return false;
}
else 
{
return true;
}

}


public static boolean IsEmpty(String args){

if (  args.length() > 0  )
{
return false;
}
else 
{
return true;
}

}

}