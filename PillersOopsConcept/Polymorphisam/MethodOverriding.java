class Animal{
    int legs=4;
    void eat(){
        System.out.println("I am eating");
    }
    void walk(){
        System.out.println("I am walking");
    }
 }

class Dog extends Animal{
    int legs=6;
    void eat(){
        System.out.println("dog is eating");
    }
    
}
class MethodOverriding{
    public static void main(String [] args){
        Dog obj=new Dog();
        System.out.println(obj.legs);
        obj.eat();
        obj.walk();
    }
}