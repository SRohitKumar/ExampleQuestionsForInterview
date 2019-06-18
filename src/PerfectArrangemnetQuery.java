public class PerfectArrangemnetQuery {

    public static void main(String args[]){
        String queryForA = " SELECT *\n" +
                "FROM Products WHERE LENGTH(PRODUCTNAME) > 5 ORDER BY LENGTH(PRODUCTNAME) ASC , PRODUCTNAME ASC , SupplierID ASC";

        System.out.println("PERFECT ARRANGEMENT QUERY :: ");
        System.out.println(queryForA);
    }
}
