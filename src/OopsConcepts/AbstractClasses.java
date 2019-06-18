package OopsConcepts;

public class AbstractClasses extends abd {

    @Override
    int abcsMethod() {
        System.out.println("Nishit");
        return 0;
    }

    @Override
    public void methodAbc(){
        System.out.println("pagla");
    }

    public static void main(String args[]){
        abd abd = new AbstractClasses();
        abd.methodAbc();
        abd.abcsMethod();

        AbstractClasses object1 = new AbstractClasses();
        object1.methodAbc();
        object1.methodAbc();
    }
}


abstract class abd{


    public void methodAbc(){
        System.out.println("Rohit");
    }

    abstract int abcsMethod();
}