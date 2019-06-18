public class FizzBuzz {

    public static void main(String args[]){
        fizzBuzzCalculation();
    }

    static void fizzBuzzCalculation(){
        int i = 5;

        if(i%3 == 0 && i%5 == 0 ){
            System.out.println("FizzBuzz");
        }else if(i%3 == 0 && i%5 !=0) {
            System.out.println("Fizz");
        } else if (i%3 != 0 && i%5 ==0){
            System.out.println("Buzz");
        }else {
            System.out.println(String.valueOf(i));
        }
    }
}
