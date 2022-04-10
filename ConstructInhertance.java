// Constructor : is similar to a method that is invoked when an object of the class is created.

public class ConstructInhertance{
    public static void main(String[] args) {
        Constructor cstr=new Constructor();
        
        String a;
        
        String b="Richard";
        a = cstr.Constructor(b);

        //MMethod OverLoading
        int c;
        OverLoading overload=new OverLoading();
        c= overload.OverLoading(12,23);
        /* c= overload.OverLoading(12,23,4); */
        System.out.println(a +"\n"+c);

        //Inhertance
        B inhert=new B();
        inhert.name= "Richard";
        inhert.display();
        inhert.caption();
        
        //Method Overiding
        Tower twr=new Tower();
        twr.run();
    }
}

class Constructor{
  
    public String Constructor(String rev){
        StringBuilder string=new StringBuilder(rev);
        string.reverse();
        return string.toString();
    }
}

//Method OverLoading: two or more methods may have the same name if they differ in parameters

class OverLoading{
    public int OverLoading(int a , int b){
        int sum=a+b;
        return sum;
    }
    public int OverLoading(int a , int b , int c){
        int answer=a+b+c;
        return answer;
    }
}

// Inhertance : is a mechanism in which one class acquires the property of another class.

class A {
    String name;
    public void caption() {
      System.out.println("Just Move");
    }
  }
  
  class B extends A {
    public void display() {
      System.out.println("My name is " + name);
    }
  }

  //Method Overiding

  class City{
      void run(){
          System.out.println("In Kigali");
        }
    }
  class Tower extends City{
    void run(){
        System.out.println("MAKUZA PLAZA");
    }
  }