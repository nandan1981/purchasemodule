package com.rent.model;

import java.util.Date;

enum Rating {

    ONE,TWO,THREE,FOUR,FIVE;
}

public class Product {

    private int product_id;
    private String title;
    private String description;
    private Date release_date;
    private int rental_duration;
    private long rental_rate;
    private long replacement_cost;
    private Enum<Rating> rating;
    private Date last_updated;

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public int getRental_duration() {
        return rental_duration;
    }

    public void setRental_duration(int rental_duration) {
        this.rental_duration = rental_duration;
    }

    public long getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(long rental_rate) {
        this.rental_rate = rental_rate;
    }

    public long getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(long replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public Enum<Rating> getRating() {
        return rating;
    }

    public void setRating(Enum<Rating> rating) {
        this.rating = rating;
    }

    public Date getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(Date last_updated) {
        this.last_updated = last_updated;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", release_date=" + release_date +
                ", rental_duration=" + rental_duration +
                ", rental_rate=" + rental_rate +
                ", replacement_cost=" + replacement_cost +
                ", rating=" + rating +
                ", last_updated=" + last_updated +
                '}';
    }

}
