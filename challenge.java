

public class challenge{



  public static void main(String []args) {
    UnidaysDiscountChallenge example = new UnidaysDiscountChallenge(createPrices());


    String itemsString = "BBBBBB"; // string of items to add to basket
    char[] chars = new char[itemsString.length()];
    for (int i = 0; i <itemsString.length(); i++) {
     example.AddToBasket(String.valueOf(itemsString.charAt(i)));
   }

   

    result result = example.CalculateTotalPrice();
    Double totalPrice = result.Total;
    Double deliveryCharge = result.DeliveryCharge;
    Double overallTotal = totalPrice + deliveryCharge;
    System.out.println("---------------------------------");
    System.out.format("Total Cost         | £%.2f%n",totalPrice);
    System.out.format("Delivery Charge    | £%.2f%n",deliveryCharge);
    System.out.println("---------------------------------");
    System.out.format("Overall Cost       | £%.2f%n",overallTotal);
    System.out.println("---------------------------------");
  }

  private static item[] createPrices(){
    item[] result = new item[5];
    // manually set the item prices
    result[0] = new item("A",8.00,1,8.00); // Name, Price, Number needed for discount, New discounted price
    result[1] = new item("B",12.00,2,20.00);
    result[2] = new item("C",4.00,3,10.00);
    result[3] = new item("D",7.00,2,7.00);
    result[4] = new item("E",5.00,3,10.00);
    return result;
  }




}
