public class Robot {

    Integer currentX = 0;
    Integer currentY = 5;
    Integer previousX;
    Integer previousY;

    Robot(Integer x, Integer y){

        previousX = currentX;
        previousY = currentY;
        currentX = x;
        currentY = y;
        printCurrentCoordinates();
    }

    public void moveX(Integer dx){
        previousX = currentX;
        currentX = currentX + dx;
        printCurrentCoordinates();
        printLastCoordinate(currentX, previousX , true);

    }

    public void moveY(Integer dy){
        previousY = currentY;
        currentY = currentY + dy;
        printCurrentCoordinates();
        printLastCoordinate(currentY, previousY , false);
    }


    public void printCurrentCoordinates(){
        System.out.println(previousX +"  "+previousY );

    }
    public void printLastCoordinate(Integer current, Integer previous ,boolean value ){
        if(value){
            System.out.println(current - previous  +"  "+current );
        }else {
            System.out.println(current - previous  +"  "+current );
        }

    }
}
