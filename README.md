# UNiDAYS Coding Challenge

## How to run

#### This program is written in java version 1.8.0

#### To run the application
1. Open a terminal / command prompt
2. Using the 'CD' command navigate to the folder the files are stored in (such as CD Desktop/UNIDAYS-Challange)
3. Type 'javac challenge.java' this should compile all of the classes if not type 'javac \*.java'
4. Type 'java challenge'




###### The output will be shown in the terminal / command prompt
an example is shown below

<pre> <p>
---------------------------------
Total Cost         | £60.00
Delivery Charge    | £0.00
---------------------------------
Overall Cost       | £60.00
---------------------------------
</p> </pre>

For testing I have included a string at the top of ‘challenge.java’ called ‘itemsString’ this can changed to test different combinations of items.

## My Approach

The challenge class is just an example of how my other classes may be implemented, I kept functionality in this class purposefully simple and minimal, it shows how the data may be set and formatted but this can be different depending on how my other classes are intended on being used.

I found that creating two additional classes ‘item’ and ‘result’ to store a number of variables which can then be passed between methods and classes easily.

The ‘UnidaysDiscountChallenge’ class is where the basket is, prices are stored, discounts are applied and the total cost is calculated. The methods of this class are shown below

- ###### AddTobasket(item)
  Cross references the added item string with the name of each item in the pricing list, 	if there is a match that item is added to the basket.

- ###### CalculateTotalPrice()
  Creates a tally array the same size as the pricing list then runs through each item in the basket tallying the total of each item.  Once the total of each item is known the discounts can be applied by passing the item tally array into the calculateDiscounts() method. Once the discounts have been calculated the total cost is taken and if above 50 the delivery cost is set to 0.00 if below 50 the delivery cost is 7.00 both of these values are then stored within a result class as public variables and returned.

- ###### calculateDiscounts(itemTally)
  if the quantity ordered and the required ordered for a discount are both above 0 the number of times the discount has been achieved and the remainder are calculated and stored separately, then the number of times the discount was achieved is multiplied by the discounted price and the remainder is multiplied by the default price where both of these results are added to the total cost and returned.


The most daunting problem I was faced with was the actual discount system itself I knew I could have multiple IF statements for each item but that would scale poorly. I spent some time thinking about the issue, trying to decide which class would be best for the decision of if a discount should be applied and where the information for each item should be stored in regards to the discount itself. While reading through the pricing rules I noticed a pattern it was buy a particular amount then the price will change from this I was able change my understanding of the pricing table from:

Item |	Price	 | Discount
---|---|---
A	 | £8.00	| None
B	 | £12.00	| 2 for £20.00
C	 | £4.00	| 3 for £10.00
D	 | £7.00	| Buy 1 get 1 free
E	 | £5.00	| 3 for the price of 2

To something more like this:

Item|	Price|	Amount|	NewPrice
---|---|---|---
A	|£8.00 	 |1	 |£8.00
B	|£12.00  |2	 |£20.00
C	|£4.00 	 |3	 |£10.00
D	|£7.00 	 |2	 |£7.00
E	|£5.00 	 |3	 |£10.00

This allowed me to create a single simple method which could iterate trough all of the items in the basket and apply the relevant discounts. To do this I kept a tally of each item as they were added. I then created 2 integer variables for each item one of the total quantity of an item divided by the amount required for a discount the other integer was the remainder of this. I multiplied the discounted integer by the new price, then multiple the remainder by the original cost. Finally, I added both of them to the total cost.

When returning the result I debated using an array to store the cost and delivery charge. However, I opted to use a custom class to store the data for 3 reasons.
1.	I believe it would be easier for the user to remember getTotalCost() than result[0]
2.	It should help reduce human error as both the total cost and delivery charge are the same datatype and could be easily mixed up in array with no labelling
3.	It is more secure as once the result class instance has been set it cannot be changed by the user
