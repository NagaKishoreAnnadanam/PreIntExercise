package org.shopping.cart
//Assumed List of Strings for the list of shopping cart items
//Prices are hard coded in this program
class ShoppingCart (val listOfItems: List[String]) {
  val applePrice: Double=0.60;
  val orangePrice: Double=0.25;
  
  def cartCheckout(): Double = {
    var totalPrice: Double = 0.0;
    val itemMap = listOfItems.groupBy(identity).mapValues(_.size);
     totalPrice = itemMap("Apple") * applePrice + itemMap("Orange") * orangePrice
    totalPrice 
  }
}