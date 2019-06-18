public class Point2D {

    int x1;
    int x2;
    int y1;
    int y2;

    Point2D(){

    }

    Point2D(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void dist2D(Point2D p){
        double squareOfXCoordinate =  (x2-x1) * (x2 - x1);
        double squareOfYCoordinate =  (y2-y1) * (y2 - y1);
        printDistance(Math.sqrt(squareOfXCoordinate  + squareOfYCoordinate));
    }

    public void printDistance(double d){
        System.out.println("2D Distance " + Math.ceil(d));
    }

}

