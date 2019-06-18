public class StudentScoreQuery {


    public static void main(String args[]){

        String query = "SELECT PRODUCTNAME , AVG(PRICE) as avg  FROM PRODUCTS GROUP BY PRODUCTNAME HAVING PRICE > AVG(PRICE) ORDER BY PRODUCTNAME DESC" ;

        System.out.println(query);
    }
}
