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



## My Approach
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
