public class UndeliveredOrderedQuery {

    public static void main (String args[]){

        String query = "SELECT COUNT(ID) FROM ORDERS WHERE STATUS != 'DELIVERED'";
        System.out.println(query);
    }
}
