
class Employee{


    String name;
    int salary;

    public int getSalary(){
return salary;
    }

    public String getName(){

        return name;
    }
    public void setName(String n){
        name=n;
    
  
    }
}


    class Phone{
public void ring(){
    System.out.println("ring");
}

public void call(){
    System.out.println("calling");
}
public void gallery(){
    System.out.println("gallery");
}
    }



    class square{
        int side;
        public int area(){
            return side*side;
        }

        public int perimeter(){

           return 4*side;
        }
    }





class rectangle{
int area;
   int breath;
public int areas(){
    return (2*(area*breath));
}

public int perimeters(){
    return 2*area;

}
 }

class Games{


    public void firing(){
        System.out.println("frining dha dha dha");
    }
    public void running(){
        System.out.println("run dhn dhn dhn");


    }
    public void hitting(){
        System.out.println("dush dush");
    } 
}











public class main {

    public static void main(String[] args) {
   
        Employee harry =new Employee();
        harry.setName("suhaib");
       System.out.println(harry.getName());



    Phone iphone =new Phone();
    iphone.ring();
 iphone.gallery();
 iphone.call();


 square sq= new square();
 sq.side=4;
 System.out.println(sq.area());
 System.out.println(sq.perimeter()); 



rectangle req =new rectangle();
        req.area=3;
        req.breath=4;
        System.out.println(req.areas());
        System.out.println(req.perimeters());


 Games game=new Games();
game.firing();
game.running();
game.hitting();
    }
}