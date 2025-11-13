package org.konneyj.module2advanced;

public class Product implements Comparable<Product> {
    private String name;
    private double weight;
    private double cost;

    public Product(String name, double weight, double cost) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(this.cost, o.cost);
    }
}
