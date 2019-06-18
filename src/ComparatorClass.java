import java.util.Arrays;

public class ComparatorClass {

    public boolean compare(int a, int b){
        if( a == b){
            return true;
        }else{
            return false;
        }

    }

    public boolean compare(String a, String b){
        if(a.equals(b))
            return true;
        else
            return false;
    }

    public boolean compare(int[] a, int[] b){
        if (Arrays.equals(a,b)) {
            return true;
        }else{
            return false;
        }
    }


    public static void main(String args[]){
        ComparatorClass cc = new ComparatorClass();
        System.out.println(cc.compare(3,4));
        System.out.println(cc.compare("hello world" , "hello world"));
        int[] arrayA = new int[3];
        Integer[] newInt = new Integer[6];
        char[] newChar = new char[7];
        Character[] newCharacter = new Character[8];

        int[][] arrayTwoD = new int[][]{{1,2,3},{4,5,6,7} ,{8,9,10}};
        char[][] charasdsa = new char[][]{{'a','b'}, {'c','d'}};
        System.out.println(cc.compare(new int[]{1, 2, 3,7} , new int[]{1, 2,3,7}));
        System.out.println(arrayTwoD);

        for(int i = 0 ; i<arrayTwoD.length ; i++){
            for(int j = 0 ; j < arrayTwoD[i].length ; j++){
                if(j == 4 && i ==1 ) {
                    System.out.println(arrayTwoD[i][j]);
                }
            }

        }
    }


}
