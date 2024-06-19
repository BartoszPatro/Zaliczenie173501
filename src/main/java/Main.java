//4. Napisz program, który pobierze od użytkownika trzy liczby i wypisze największą z nich:
// - Program powinien wczytać trzy liczby całkowite wprowadzone przez użytkownika.
// - Porównać te liczby, aby znaleźć największą.
// - Wyświetlić największą liczbę.

import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) 
  {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Podaj trzy liczby calkowite: ");
    System.out.println("Podaj pierwszą liczbę: ");
    int liczba1 = scanner.nextInt();
    System.out.println("Podaj drugą liczbę: ");
    int liczba2 = scanner.nextInt();
    System.out.println("Podaj trzecią liczbę: ");
    int liczba3 = scanner.nextInt();

    if (liczba1 > liczba2 && liczba1 > liczba3)
    {
      System.out.println("Największa liczba to: " + liczba1);
    }
    else if (liczba2 > liczba1 && liczba2 > liczba3)
    {
      System.out.println("Największa liczba to: " + liczba2);
    }
    else if (liczba3 > liczba1 && liczba3 > liczba2)
    {
      System.out.println("Największa liczba to: " + liczba3);
    }
    else
    {
      System.out.println("Dwie lub wszystkie liczby są równe.Nie ma największej liczby.");
    }
  }
}