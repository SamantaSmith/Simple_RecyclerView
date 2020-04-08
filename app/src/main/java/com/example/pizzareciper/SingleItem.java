package com.example.pizzareciper;

public class SingleItem {

    private int pizzaImage;
    private String mainText;
    private String subText;
    private String description;

    public SingleItem(int pizzaImage, String mainText, String subText, String description) {
        this.pizzaImage = pizzaImage;
        this.mainText = mainText;
        this.subText = subText;
        this.description = description;

    }

    public int getPizzaImage() {
        return pizzaImage;
    }

    public String getMainText() {
        return mainText;
    }

    public String getSubText() {
        return subText;
    }

    public String getDescription() {return description;}


}
