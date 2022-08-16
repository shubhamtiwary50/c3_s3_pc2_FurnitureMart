package com.furniture;

public class FurnitureItem {
    private int furnitureCode;
    private String furnitureType;
    private String gradeOfFurniture;
    private String colour;
    private String furnitureUsage;
    private double price;
    static final double DISCOUNT = 5.0;

    public int getFurnitureCode() {
        return furnitureCode;
    }

    public void setFurnitureCode(int furnitureCode) {
        this.furnitureCode = furnitureCode;
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    public String getGradeOfFurniture() {
        return gradeOfFurniture;
    }

    public void setGradeOfFurniture(String gradeOfFurniture) {
        this.gradeOfFurniture = gradeOfFurniture;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getFurnitureUsage() {
        return furnitureUsage;
    }

    public void setFurnitureUsage(String furnitureUsage) {
        this.furnitureUsage = furnitureUsage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    FurnitureItem() {

    }

    public double calculateDiscount() {
        double discountedPrice;
        if (this.gradeOfFurniture.equals("grade1") && this.furnitureUsage.equals("outdoor"))
        {
            System.out.println(" Eligible for discount ");
            return discountedPrice = (95.0 / 100.0) * this.price;
        }
        else {
            System.out.println(" Not eligible for discount ");
        }
            return price;
        }

    }
    //testing remote
///
//
//


