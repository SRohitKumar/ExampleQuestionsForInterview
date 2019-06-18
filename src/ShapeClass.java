public abstract class ShapeClass {

    public abstract String drawShape();

}

class Square extends ShapeClass {

    @Override
    public String drawShape(){
       return "Drawing a Square";
    }
}

class Circle extends ShapeClass {

    @Override
    public String drawShape(){
        return "Drawing a Circle";
    }
}
class Rectangle extends ShapeClass {

    @Override
    public String drawShape(){
        return "Drawing a Rectangle";
    }
}

class ShapeFactory {

        public void drawShape(String drawShape){
          if(drawShape.equals("Square"))
          {
              Square sq = new Square();
              sq.drawShape();
          }else if(drawShape.equals("Circle"))
          {
              Circle sq = new Circle();
              sq.drawShape();
          } else if(drawShape.equals("rectangle"))
          {
              Circle sq = new Circle();
              sq.drawShape();
          } else {
              System.out.println("Drawing "+drawShape+  " is not supported");
          }
        }
}
