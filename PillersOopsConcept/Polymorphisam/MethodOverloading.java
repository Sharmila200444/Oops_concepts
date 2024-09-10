class Overloading{
    public static void min(int a,int b){
        if(a<b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
    public void min(int a,int b,int c){
        if(a<b){
            System.out.println(a);
        }
        else if(b<c){
            System.out.println(b);;
        }
        else{
            System.out.println(c);

        }
    }
}

class MethodOverloading{
    public static void main(String [] args){
        Overloading obj=new Overloading();
        obj.min(7,8);
        obj.min(2,6,4);
    }
}