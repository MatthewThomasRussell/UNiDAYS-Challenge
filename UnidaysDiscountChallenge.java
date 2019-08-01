import java.util.ArrayList;


public class UnidaysDiscountChallenge{
ArrayList basket= new ArrayList( );


  public void UnidaysDiscountChallenge(){
    System.out.println("Working"); // impliment this
  }

  public void AddToBasket(String item){
    basket.add(item);
    System.out.println("Added "+item+" to basket");
  }

  public result CalculateTotalPrice(){
  result result = new result(0.01,0.02);


    return result;
  }

}
