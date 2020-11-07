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

class VendingMachineApp
{
  public static void main (String[] args)
  {
    try (UserInterface ui = new UserInterface ())
    {
      Shelf shelf = new Shelf ();
      run (shelf, ui);
    }
    catch (Exception e)
    {
      System.out.println ("got exception [ " + e + " ], exiting...");
      System.exit (1);
    }
  }

  private static void run (Shelf shelf, UserInterface ui)
  {
    while (!shelf.isEmpty ())
    {
      Product[] availableProducts = shelf.getAvailableProducts ();
      Product purchasedProduct = ui.getProduct (availableProducts);
      if (ui.verifyPayment (purchasedProduct))
        shelf.decreaseQuantity (purchasedProduct);
    }
  }
}
