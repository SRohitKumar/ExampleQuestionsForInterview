

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountingPairs {


    public static void main(String args[]){

        CountingPairs testAndOnlyTest = new CountingPairs();
        List<Integer> number = new ArrayList<>();
        number.add(6);
        number.add(1);
        number.add(1);
        number.add(2);
        number.add(2);
        number.add(3);
        number.add(3);
        number.add(1);
        int k = 1;

        testAndOnlyTest.workMethod(number , k );

    }



    public int workMethod(List<Integer> number, int k){


        int countOfValidaPairs = 0;
        Set<List<Integer>> numberOfListWithInteger = new HashSet<>();
        List<Integer> newListOfPairs = new ArrayList<>();

        for(int i=0 ; i< number.size() ; i++){
            for(int j=i+1 ; j <number.size() ; j++){

                if(number.get(i) + k == number.get(j)){
                    countOfValidaPairs ++;
                    newListOfPairs.add(number.get(i));
                    newListOfPairs.add(number.get(j));
                    if(newListOfPairs.size() == 2 && number.get(i) <= number.get(j)) {
                        numberOfListWithInteger.add(newListOfPairs);
                        newListOfPairs = new ArrayList<>();
                    }
                }

            }

        }
        System.out.println(numberOfListWithInteger.size());
        return numberOfListWithInteger.size();
    }



}
