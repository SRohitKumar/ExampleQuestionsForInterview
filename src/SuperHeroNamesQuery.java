public class SuperHeroNamesQuery {

    public static void main(String args[]){

        System.out.println("Query is :: " + "SELECT PRODUCTNAME,PRODUCTID FROM PRODUCTS WHERE LENGTH(PRODUCTNAME) >6 ORDER BY PRODUCTID ASC");
    }
}
