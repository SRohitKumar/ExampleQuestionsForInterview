public class CountHoles {

    public static void main(String args[]){
        System.out.println(countHoles());
    }

    public static int countHoles(){
        int number = 840;
        String numberStringrepresentation = String.valueOf(number);
        int count = 0;

        for(int i = 0; i < numberStringrepresentation.length() ; i++){
            char charAtPosition = numberStringrepresentation.charAt(i);
            System.out.println(charAtPosition);

            if(charAtPosition == '0' || charAtPosition == '4' || charAtPosition == '6' || charAtPosition == '9' ) {
                count = count + 1;
                System.out.println("inside if " +count);
            }else if (charAtPosition == '8') {
                count = count + 2;
            }
        }
            return count;
    }
}
