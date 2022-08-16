package com.furniture;

import java.util.Scanner;

public class FurnitureItemImpl {
    public static void main(String[] args) {
        FurnitureItem furnitureItem = new FurnitureItem();
        Scanner obj = new Scanner(System.in);
        furnitureItem.setFurnitureCode(101);
        furnitureItem.setFurnitureType(" Chair ");
        furnitureItem.setGradeOfFurniture("grade1");
        furnitureItem.setFurnitureUsage("outdoor");
        furnitureItem.setPrice(16799.0);
        furnitureItem.setColour("Primordial Black");
        double updatedPrice = furnitureItem.calculateDiscount();
        System.out.println(" Price after discount is : "+ updatedPrice);
    }

}
