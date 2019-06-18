public class Point3D extends Point2D {
    int z1;
    int z2;

    Point3D(int x1, int y1, int z1, int x2,int y2, int z2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.z1 = z1;
        this.z2 = z2;
    }

    public void dist3D(Point3D p){
        double squareOfXCoordinate =  (x2-x1) * (x2 - x1);
        double squareOfYCoordinate =  (y2-y1) * (y2 - y1);
        double squareOfZCoordinate =  (z2-z1) * (z2 - z1);
        Point2D point2D = new Point2D(x1,y1,x2,y2);
        point2D.dist2D(point2D);
        printDistance(Math.sqrt(squareOfXCoordinate  + squareOfYCoordinate + squareOfZCoordinate));
    }

    public void printDistance(double d){
        System.out.println("3D Distance " + Math.ceil(d));
    }
}
