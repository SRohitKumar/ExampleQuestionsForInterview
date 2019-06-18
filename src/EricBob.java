public class EricBob {


    public static void main(String arg[]){

        //String erica="EHH";
        //String bob = "HHH";
        int a =1;
        int b = a+1;
        Integer abc = new Integer(3);
        Integer bcd = abc.intValue()+1;


        System.out.println("b's result " + bcd.intValue() );
       //System.out.println(whoWins(erica,bob));

    }

    static String whoWins(String erica, String bob){
        int totalEricaPoints = 0;
        int totalBobPoints = 0;

        for(int i=0 ; i< erica.length(); i++){
            char e = erica.charAt(i);
            if(e == 'E'){
                totalEricaPoints ++;
            }else if (e == 'M'){
                totalEricaPoints = totalEricaPoints+3;
            }else if (e == 'H'){
                totalEricaPoints = totalEricaPoints+5;
            }
        }

        for(int i=0 ; i< bob.length(); i++){
            char e = bob.charAt(i);
            if(e == 'E'){
                totalBobPoints ++;
            }else if (e == 'M'){
                totalBobPoints = totalEricaPoints+3;
            }else if (e == 'H'){
                totalBobPoints = totalEricaPoints+5;
            }
        }
       if(totalEricaPoints > totalBobPoints)
           return "ErricaWins";
       else if (totalBobPoints>totalEricaPoints)
           return "BobWins";
       else
           return "Draw";
    }
}
