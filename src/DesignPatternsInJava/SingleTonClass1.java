package DesignPatternsInJava;

public class SingleTonClass1 {


    public static final SingleTonClass1 instance = new SingleTonClass1(4);
    private SingleTonClass1(int abc){
    }


    static SingleTonClass1 methodSingleton(){
        if(instance == null ){
            System.out.println("Inside If Instance");
        }else{
            System.out.println("Inside else Instance");
        }
        return instance;
    }


}


class abc1 {
    public static void main(String args[]){
        SingleTonClass1.methodSingleton();
        SingleTonClass1.methodSingleton();
    }
}
