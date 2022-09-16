package com.homework8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product prod1 = new Product("BookShelf", "Book", 500,
                true, LocalDate.of(2021, 4, 12));
        Product prod2 = new Product("MagazineShelf", "Magazine", 100,
                true, LocalDate.of(2022, 5, 30));
        Product prod3 = new Product("BookShelf", "Book", 50,
                false, LocalDate.of(2022, 3, 8));
        Product prod4 = new Product("NewsShelf", "NewsPaper", 30,
                true, LocalDate.of(2022, 6, 22));
        Product prod5 = new Product("BookShelf", "Book", 800,
                true, LocalDate.of(2022, 8, 24));

        List<Product> products = new ArrayList<>();
        products.add(prod1);
        products.add(prod2);
        products.add(prod3);
        products.add(prod4);
        products.add(prod5);

        Product.getFilterByTypePrice(products);
        Product.getFilterByTypeDiscount(products);
        Product.getCheapestBook(products, "Book");
        Product.getFilterByAddedDate(products);
        Product.getTotalPrice(products);
        Product.getSortByType(products);
    }
}
