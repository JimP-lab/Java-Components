class helloworld {
public static void main(String[] args){
int number=2853, sum=0, division=1;
while(division!=0)
{
sum=sum+(number%10);
division = number/10;
}
system.out.println("sum=" + sum);
}
