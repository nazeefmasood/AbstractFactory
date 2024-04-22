public class AbstractFactoryProduct extends AbstractFactory {
	@Override
   public Shape getShape(String productType){    
      if(productType.equalsIgnoreCase("DOUBLE_ROUNDED_TRIANGLE")){
         return new DoubleBorderRoundedTriangle();         
      }else if(productType.equalsIgnoreCase("DOUBLE_BORDERED_RECTANGLE")){
         return new DoubleBorderRoundedRectangle();
      }	else if(productType.equalsIgnoreCase("DOUBLE_BORDER_TRIANGLE")){
          return new DoubleBorderTriangle();
       } 	else if(productType.equalsIgnoreCase("SINGLE_BORDER_TRIANGLE")){
           return new SingleBorderTriangle();
        }
      return null;
   }
}