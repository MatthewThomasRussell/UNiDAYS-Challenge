

public class challange{



  public static void main(String []args) {
    UnidaysDiscountChallenge example = new UnidaysDiscountChallenge();
    //example.AddToBasket(itemOne);
    //example.AddToBasket(itemTwo);

    result result = example.CalculateTotalPrice();
    Double totalPrice = result.Total;
    Double deliveryCharge = result.DeliveryCharge;
    Double overallTotal = totalPrice + deliveryCharge;
    System.out.println(overallTotal);
  }


}
