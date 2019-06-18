
import java.util.Arrays;

public class WholeMinuteDilema {

    public static void main(String[] args) {

        Integer[] abc = {4,15,50,30,30,10,56};
        WholeMinuteDilema userApplication = new WholeMinuteDilema();
        System.out.println (userApplication.calculatePairSongs(abc));

    }

    public int calculatePairSongs(Integer[] inputForSongs){
        Arrays.sort(inputForSongs);
        int j = 0 ;
        boolean manual = true;
        int result = 0;
        for (int i= 0 ; i<inputForSongs.length ; i++ ){
            for(int k = i+1 ; k < inputForSongs.length ; k++){
                if(inputForSongs[i] + inputForSongs[k] == 60){
                    result = result+1;
                    continue;
                }
            }
        }
        return result;
    }

}


