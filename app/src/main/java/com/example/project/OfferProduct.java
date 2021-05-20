package com.example.project;

public class OfferProduct {
    int imageUrl;
    String offerPercent;

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getOfferPercent() {
        return offerPercent;
    }

    public void setOfferPercent(String offerPercent) {
        this.offerPercent = offerPercent;
    }

    public OfferProduct(int imageUrl, String offerPercent) {
        this.imageUrl = imageUrl;
        this.offerPercent = offerPercent;
    }
}
