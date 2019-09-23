import java.util.ArrayList;


public class UnidaysDiscountChallenge{
private ArrayList<item> basket = new ArrayList<item>();
private item[] prices;

  /**
   * Class constructor
   * @param P[] Array, an array of items for the item prices
   */
  public UnidaysDiscountChallenge(item P[]){
    prices = P;
  }

/**
 * adds an item to the basket with the same name as the given string
 * @param item String, the name of the item to be added to the basket
 */
  public void AddToBasket(String item){
    for (int i = 0; i < prices.length ;i++ ) { // Take item and get info from pricing array
      if (item.equals(prices[i].getName())){
        basket.add(prices[i]);
      }
    }

  }


  /**
   * Works through the basket calculates the final price with applied discounts
   * @return the result, containing the total cost and delivery charge
   */
  public result CalculateTotalPrice(){

    Double delivery = 0.00;
    int[] itemTally = new int[prices.length];

    // Tally up each item
    for (int i = 0; i < basket.size() ;i++ ) {
      item itemTemp = basket.get(i);
      for (int j = 0;j<prices.length ;j++ ) { // create a tally for each item to apply discounts
          if (prices[j].getName() == itemTemp.getName()){
            itemTally[j] += 1;
          }
      }
    }

    // calculate the cost
    Double totalCost = calculateDiscounts(itemTally);

    // work out delivery charge
    if (totalCost >= 50.0){
      delivery = 0.00;
    }

    else if (totalCost > 0.00) {
      delivery = 7.00;
    }

    result result = new result(totalCost,delivery);
    return result;
  }



    private Double calculateDiscounts(int[] itemTally){
      Double cost = 0.00;
      for (int i = 0; i < prices.length ;i++ ) {
        item itemTemp = prices[i];
        int quantity = itemTally[i];
        if (quantity > 0 && itemTemp.getDiscountNum() > 0){
          int numOfDiscounts = quantity/itemTemp.getDiscountNum() ;
          int numOfRegular = quantity%itemTemp.getDiscountNum() ;
          cost += numOfDiscounts * itemTemp.getNewPrice(); // multiply the discounted price by the number of discount combos
          cost += numOfRegular * itemTemp.getPrice(); // do the same for the non discounts
        }
      }

      return cost;
    }


}
