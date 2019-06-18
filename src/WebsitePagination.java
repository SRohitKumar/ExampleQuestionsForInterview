
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WebsitePagination {


    public static void main(String args[]) {

        WebsitePagination webSitePagination = new WebsitePagination();
        String items[][] = {


                // Shades of grey
                {
                        "item1",
                        "12",
                        "2",
                },
                // Shades of blue
                {
                        "item2",
                        "24",
                        "1",
                }
                ,
                // Shades of blue
                {
                        "item3",
                        "37",
                        "1",
                }
                ,
                // Shades of blue
                {
                        "item3",
                        "38",
                        "1",
                }
                ,
                // Shades of blue
                {
                        "item4",
                        "39",
                        "1",
                }
                ,
                // Shades of blue
                {
                        "item5",
                        "40",
                        "1",
                }


        };

        int sortParameter = 0;
        int sortOrder = 1;
        int x = 2;  //number of items in the page
        int y = 2;  // return items for this page.. Main requirement


        WebsitePagination.sortingAlgorithm(items,sortParameter,sortOrder);

        //Calculate number of pages.

        float f = (float)items.length/x;
        int totalNumberOfPages = (int)Math.ceil(f);
        // System.out.println(totalNumberOfPages);

        WebsitePagination.functionToDisplay(y, x, items);

        //Now till here we have 3 items in total and according to the 2 items present in each page, total number of pages will be 2


    }




    public static void sortingAlgorithm(String items[][], int col, int sortOrder)
    {
        Arrays.sort(items, new Comparator<Object[]>() {

            @Override
            // Compare values according to columns
            public int compare(final Object[] entry1,
                               final Object[] entry2) {
                if(entry1[col] instanceof String) {
                    int compare = entry1[col].toString().compareTo(entry2[col].toString());
                    if(compare < 0) {
                        return sortOrder == 0 ? 1 : -1;
                    }else{
                        return sortOrder == 0 ? -1 : 1;
                    }
                }
                return 1;
            }
        });
    }

    public static void functionToDisplay(int y , int x, String [][] items ){
        System.out.println ("Items displaying for the page :: " +y);

        for (int i = 0; i < items.length; i++) {
            if(x == 0){
                break;
            }
            int displayingStartIndex = y*x -1 ;
            if (i > displayingStartIndex){
                for (int j = 0; j < items[i].length; j++){
                    System.out.print(items[i][j] + " ");
                }
                System.out.println();
                x--;
            }


        }
    }
}
