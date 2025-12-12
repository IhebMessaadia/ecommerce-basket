# E-commerce Basket

A console shopping-basket application in **Java** that demonstrates core object-oriented programming: interfaces, inheritance, method overriding and polymorphism.

## Features

- Add books to the basket with a name, author, price and discount rate
- Remove items by index
- View the basket with each item's discounted price and the running total

## OOP design

| Type | Role |
|---|---|
| `PriceOperation` | Interface that defines `calculatePrice()` |
| `Product` | Base class that implements `PriceOperation`: a name and a price |
| `Book` | Extends `Product`, adds an author and overrides `calculatePrice()` to apply a discount |
| `Basket` | Holds a `List<PriceOperation>`, so any priced item works polymorphically |
| `Main` | Menu-driven console interface |

Adding a new product type only takes a new subclass of `Product`. `Basket` needs no changes.

## Getting started

Requires JDK 8 or later.

```bash
git clone https://github.com/IhebMessaadia/EcommerceBasket.git
cd EcommerceBasket
javac -encoding UTF-8 -d out src/*.java
java -cp out Main
```

Or open the folder in IntelliJ IDEA and run `Main`.

## Example

```
1) Add book
2) Remove item
3) Show basket
4) Exit
Choose: 3
Items in basket:
0 - Book: Clean Code by Robert Martin - 180.0 ₺
1 - Book: Dune by Frank Herbert - 150.0 ₺
Total: 330.0 ₺
```

## Author

**Iheb Messaadia**: [GitHub](https://github.com/IhebMessaadia)
