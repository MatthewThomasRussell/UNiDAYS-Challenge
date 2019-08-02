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
    Double totalCost = 0.00;
    Double delivery = 0.00;

    for (int i = 0; i < basket.size() ;i++ ) {
      item itemTemp = basket.get(i);
      System.out.println(itemTemp.Name);
      totalCost += itemTemp.Price;
    }


    result result = new result(totalCost,delivery);
    return result;
  }

}
