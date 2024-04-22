public class FactoryProducer {
   public static AbstractFactory getFactory(String type){   
      if(type.equalsIgnoreCase( "Rounded")){
         return new RoundedShapeFactory();         
      }else if ( type.equalsIgnoreCase( "Shape")){
         return new ShapeFactory();
      }else if ( type.equalsIgnoreCase("Product")){
          return new AbstractFactoryProduct();
       }
	return null;
   }
}