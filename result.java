public class result{

  private Double Total;
  private Double DeliveryCharge;


  /**
   * Class constructor.
   * @param total Double, The totol cost of the items in the basket (discounts have already been applied)
   * @param deliveryCharge Double, How much will be charged for delivery
   */
  public result(Double total, Double deliveryCharge){
    this.Total = total;
    this.DeliveryCharge = deliveryCharge;
  }

  /**
  * @return total
  */
  public Double getTotal(){
    return Total;
  }

 /**
  * @return DeliveryCharge
  */
  public Double getDeliveryCharge(){
    return DeliveryCharge;
  }

}
