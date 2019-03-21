package day04.day04_homework;

import java.util.Objects;

public class Car {
     private String Brands;
     private int price;

    public Car() {
    }

    public Car(String brands, int price) {
        Brands = brands;
        this.price = price;
    }

    public String getBrands() {
        return Brands;
    }

    public void setBrands(String brands) {
        Brands = brands;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price &&
                Objects.equals(Brands, car.Brands);
    }

    @Override
    public int hashCode() {

        return Objects.hash(Brands, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "Brands='" + Brands + '\'' +
                ", price=" + price +
                '}';
    }
}
