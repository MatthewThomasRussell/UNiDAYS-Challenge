

public class item{

  private Double Price;
  private String Name;
  private int numForDiscount;
  private Double discountPrice;

  /**
   * Class constructor.
   * @param name String, The name of the item for example "A"
   * @param price Double, How much the item will cost in pounds and pence
   * @param numForDiscount Int, the number of this item to be purchased for the discount to be applied
   * @param discountPrice Double, the combined new price for the discounted items
   */

  public item(String name, Double price,int numForDiscount,Double discountPrice){
    this.Price = price;
    this.Name = name;
    this.numForDiscount = numForDiscount;
    this.discountPrice = discountPrice;
  }
  /**
   * @return Name
  **/
  public String getName(){
    return Name;
  }
  /**
   * @return Price
  **/
  public Double getPrice(){
    return Price;
  }

  /**
   * @return numForDiscount
  **/
  public int getDiscountNum(){
    return numForDiscount;
  }

  /**
   * @return DiscountPrice
  **/
  public Double getNewPrice(){
    return discountPrice;
  }

}
