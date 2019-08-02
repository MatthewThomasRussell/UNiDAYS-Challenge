

public class challange{



  public static void main(String []args) {
    //item[] item = createPrices();
    UnidaysDiscountChallenge example = new UnidaysDiscountChallenge(createPrices());
    example.AddToBasket("A");
    example.AddToBasket("B");
    result result = example.CalculateTotalPrice();
    Double totalPrice = result.Total;
    Double deliveryCharge = result.DeliveryCharge;
    Double overallTotal = totalPrice + deliveryCharge;
    System.out.println(overallTotal);
  }

  private static item[] createPrices(){
    item[] result = new item[5];
    // manually set the item prices
    result[0] = new item("A",8.00,null);
    result[1] = new item("B",12.00,null);
    result[2] = new item("C",4.00,null);
    result[3] = new item("D",7.00,null);
    result[4] = new item("E",5.00,null);

    return result;
  }

}
