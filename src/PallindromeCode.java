

import java.util.Arrays;

public class PallindromeCode {

    public static void main(String[] args) {
        String inputString = "CIVIC";
        PallindromeCode userApplication = new PallindromeCode();
        int totalCount = userApplication.countPalindrom(inputString);
        System.out.println(totalCount);


    }


    public int countPalindrom(String inputString)
    {
        char[] characterList = inputString.toCharArray();
        int returnCount=characterList.length;
        for(int i=0;i<characterList.length;i++)
        {
            for(int j=i+1;j<characterList.length;j++)
            {
                boolean manual = true;
                String newString = newString = Character.toString(characterList[i]) +  Character.toString(characterList[j]);
                char[] newCharacterList = newString.toCharArray();
                for(int k=0 ; k< newCharacterList.length ; k++){
                    int indexFromLast = newCharacterList.length -1 - k ;
                    if(newCharacterList[k] !=  newCharacterList[indexFromLast]){
                        manual  = false;
                        break;
                    }
                }
                returnCount = manual ? returnCount + 1 : returnCount;
            }
        }
        return returnCount;
    }


}
