package DesignPatternsInJava;

public class SingleTonClass {

    private static SingleTonClass instance = null;
    int abc = 4;

    private SingleTonClass(){
       System.out.println(abc);
    }

    static SingleTonClass createSingleTon(){
        if(instance == null){
            instance = new SingleTonClass();
            return instance;
        }else{
            return instance;
        }
    }
}


class abc {
    public static void main(String args[]){
        SingleTonClass.createSingleTon();
        SingleTonClass.createSingleTon();
    }

}