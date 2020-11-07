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

import java.util.Scanner;
import ibadts.IBCollection;

public class UserInterface implements AutoCloseable
{
  public UserInterface ()
  {
    scanner = new Scanner (System.in);
  }

  public void close ()
  {
    scanner.close ();
  }

  public Product getProduct (Product[] availableProducts)
  {
    System.out.println ("Available products:");
    for (int i = 0; i < availableProducts.length; i++)
      System.out.println ("id " + i + ": " + availableProducts [i]);

    boolean selected = false;
    while (!selected)
    {
      System.out.print ("Give id of selected item and press enter: ");
      if (scanner.hasNextInt ())
      {
        int id = scannerNextInt ();
        if (id >= 0 && id < availableProducts.length)
          return availableProducts [id];
      }
      else
        scanner.nextLine ();
    }
  }

  private Scanner scanner;
}
