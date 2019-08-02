import java.util.ArrayList;


public class UnidaysDiscountChallenge{
private ArrayList<item> basket = new ArrayList<item>();
private item[] prices;

  public UnidaysDiscountChallenge(item P[]){
    prices = P;
  }

  public void AddToBasket(String item){
    // possibly add error check here
    //


    for (int i = 0; i < prices.length ;i++ ) {
      //System.out.println(i);
      if (item.equals(prices[i].Name)){
      //  System.out.println(i);
        basket.add(prices[i]);
      }
    }
    //System.out.println(prices);
    //basket.add(item);
    System.out.println("Added "+item+" to basket");
  }

  public result CalculateTotalPrice(){

    Double delivery = 0.00;
    int[] itemTally = new int[prices.length];

    // Tally up each item
    for (int i = 0; i < basket.size() ;i++ ) {
      item itemTemp = basket.get(i);
      for (int j = 0;j<prices.length ;j++ ) { // create a tally for each item to apply discounts
          if (prices[j].Name == itemTemp.Name){
            itemTally[j] += 1;
          }
      }
    }

    // calculate the cost
    Double totalCost = calculateDiscounts(itemTally);

    // work out delivery charge
    if (totalCost > 50.0){
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
        if (quantity > 0 && itemTemp.numForDiscount > 0){
          int numOfDiscounts = quantity/itemTemp.numForDiscount ;
          int numOfRegular = quantity%itemTemp.numForDiscount ;
          cost += numOfDiscounts * itemTemp.discountPrice; // multiply the discounted price by the number of discount combos
          cost += numOfRegular * itemTemp.Price; // do the same for the non discounts

        //  System.out.println(test1);
        //  System.out.println(test2);
        }
      }

      return cost;
    }


}
