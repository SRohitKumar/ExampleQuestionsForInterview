import java.math.RoundingMode;
import java.text.DecimalFormat;

public class TwoFloatPointNumber {


    public static void main(String args[]){
        System.out.println("Adding two Numbers Value "+calculateIntValue());
    }


    public static int calculateIntValue(){

        Float firstNumber = 1.98f;
        Float secondNumber = 2.47f;

        float sum = firstNumber+secondNumber;

        DecimalFormat df = new DecimalFormat("##");
        df.setRoundingMode(RoundingMode.DOWN);

        return Integer.parseInt(df.format(sum));
    }
}
