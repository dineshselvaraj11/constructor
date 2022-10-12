class ITE
{
String name;
int time;
boolean presnt;

public ITE(String n,int t,boolean d1)
{
name=n;
time=t;
d1=d1;
System.out.println("name="+name+"\n"+"time="+time+"\n"+"d1="+d1);

}
public static void main(String[] args){
ITE s1=new ITE("anil",9,true);
System.out.println(s1.name());
ITE s2=new ITE("kalai",10,false);
}
}

