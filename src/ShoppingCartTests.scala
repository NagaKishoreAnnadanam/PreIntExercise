package org.shopping.cart.test
//Added scalatest_2.11-3.0.1.jar, scalactic_2.11-3.0.1.jar files as external libraries in the Eclipse

import org.shopping.cart.test
import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter
import org.shopping.cart._
import org.scalatest.Matchers._

import org.scalatest._

class ShoppingCartTests extends FlatSpec with Matchers {
  var shoppingCart: ShoppingCart = new ShoppingCart(List("Apple","Orange","Apple","Orange","Apple","Orange","Apple","Orange","Apple","Orange"))
  assert(shoppingCart.listOfItems.filter(x => (x!="Apple")).filter(x => (x!="Orange"))==List())
  assert(shoppingCart.cartCheckout==2.8) //This will pass
  assert(shoppingCart.cartCheckout==2.7) //This will fail
  shoppingCart = new ShoppingCart(List("Apple","Orange","Apple","Orange","Apple","Orange","Apple","Orange","Apple","Orange","Apple","Orange","Apple","Orange","Banana","Banana","Banana","Pineapple","Pineapple","Pineapple"))
  assert(shoppingCart.listOfItems.filter(x => (x!="Apple")).filter(x => (x!="Orange"))==List()) //This will fail
  assert(shoppingCart.cartCheckout==3.65) //This will pass
 
}