// Copyright (C) 2020 Jarmo Hurri

// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.

// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.

// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <https://www.gnu.org/licenses/>.

public class Shelf
{
  public Shelf ()
  {
    final int NUM_PRODUCT_TYPES = 2;
    products = new Product [NUM_PRODUCT_TYPES];
    quantities = new int [NUM_PRODUCT_TYPES];
    
    products [0] = Beverage;
    quantities [0] = 10;
    products [1] = Apple;
    quantities [1] = 5;
  }

  public Product[] getAvailableProducts ()
  {
    java.util.ArrayList<Product> availableProducts = new java.util.ArrayList<> ();
    for (int i = 0; i < products.length; i++)
      if (quantities [i] > 0)
        availableProducts.add (products [i]);

    return availableProducts.toArray (new Product [0]);
  }
  
  public boolean isEmpty ()
  {
    // code to be written
    return true;
  }
  
  public void decreaseQuantity (Product product)
  {
    // code to be written
  }
  
  Product[] products;
  int[] quantities;
}
