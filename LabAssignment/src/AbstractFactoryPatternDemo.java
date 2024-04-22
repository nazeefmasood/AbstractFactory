public class AbstractFactoryPatternDemo {
   public static void main(String[] args) {
      //get shape factory
      AbstractFactory shapeFactory = FactoryProducer.getFactory("Rounded");
      //get an object of Shape Rectangle
      Shape shape1 = shapeFactory.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape1.draw();
      //get an object of Shape Square 
      Shape shape2 = shapeFactory.getShape("SQUARE");
      //call draw method of Shape Square
      shape2.draw();
      //get shape factory
      AbstractFactory shapeFactory1 = FactoryProducer.getFactory("Shape");
      //get an object of Shape Rectangle
      Shape shape3 = shapeFactory1.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape3.draw();
      //get an object of Shape Square 
      Shape shape4 = shapeFactory1.getShape("SQUARE");
      //call draw method of Shape Square
      shape4.draw();
      
      Shape shape5 =  shapeFactory1.getShape("TRIANGLE");
      shape5.draw();
      
      
      AbstractFactory shapeFactory2 = FactoryProducer.getFactory("Product");
      Shape shape6 = shapeFactory2.getShape("DOUBLE_ROUNDED_TRIANGLE");
      shape6.draw();

      Shape shape7 = shapeFactory2.getShape("DOUBLE_BORDERED_RECTANGLE");

      shape7.draw();
      
      Shape shape8 =  shapeFactory2.getShape("DOUBLE_BORDER_TRIANGLE");
      shape8.draw();
      
      Shape shape9 =  shapeFactory2.getShape("SINGLE_BORDER_TRIANGLE");
      shape9.draw();
      
   }
}