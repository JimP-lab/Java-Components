class Person
{
    private String name;
    private int age;
    
    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
        
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}

 class Main
 {
    
    public static void main(String[] args)
    {
    Person Person1=new Person("giorgos",20);
    Person Person2=new Person("kostas",21);
    System.out.println(Person1.getName() + "is" + Person1.getAge() + "years old.");
    System.out.println(Person2.getName() + "is" + Person2.getAge() + "years old.\n");
    }
}