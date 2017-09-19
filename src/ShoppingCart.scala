package org.shopping.cart
//Assumed List of Strings for the list of shopping cart items
//Prices are hard coded in this program
class ShoppingCart (val listOfItems: List[String]) {
  val applePrice: Double=0.60;
  val orangePrice: Double=0.25;
  
  def cartCheckout(): Double = {
    var totalPrice: Double = 0.0;
    val itemMap = listOfItems.groupBy(identity).mapValues(_.size);
     totalPrice = (java.lang.Math.floor(itemMap("Apple")/2) * applePrice) + 
     ((itemMap("Apple")%2)*applePrice) +
     (java.lang.Math.floor(itemMap("Orange")/3) * orangePrice * 2) + 
     ((itemMap("Orange")%3)*orangePrice);
     totalPrice 
  }
}

object Main extends App {
   new ShoppingCart(List("Apple","Orange","Apple","Orange","Apple","Orange","Apple","Orange","Apple","Orange","Apple","Orange","Apple","Orange","Banana","Banana","Banana","Pineapple","Pineapple","Pineapple")){
     //print(listOfItems.filter(x => (x!="Apple")).filter(x => (x!="Orange")));
     print(cartCheckout)
   };
}