package model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderDelivery {
    @JsonProperty("orderID")
    private int orderID;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy HH:mm")
    Date date;
    @JsonProperty("price")
    private double price;
    @JsonProperty("customer")
    private Customer customer;
    @JsonProperty("courier")
    private Courier courier;
    @JsonProperty("cafe")
    private Cafe cafe;
    @JsonProperty("deliveryProvider")
    private DeliveryProvider deliveryProvider;
    @JsonProperty("paymentType")
    private PaymentType paymentType;
    @JsonProperty("menuItemsList")
    public List<MenuItems> menuItemsList = new ArrayList<>();

    public OrderDelivery(int orderID, Date date, double price, Customer customer, Courier courier, Cafe cafe, DeliveryProvider deliveryProvider, PaymentType paymentType) {
        this.orderID = orderID;
        this.date = date;
        this.price = price;
        this.customer = customer;
        this.courier = courier;
        this.cafe = cafe;
        this.deliveryProvider = deliveryProvider;
        this.paymentType = paymentType;
    }

    public OrderDelivery(){}

    public void addMenuItem(MenuItems menuItems){
        menuItemsList.add(menuItems);
    }

    public void deleteMenuItems(MenuItems menuItems){
        menuItemsList.remove(menuItems);
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public Cafe getCafe() {
        return cafe;
    }

    public void setCafe(Cafe cafe) {
        this.cafe = cafe;
    }

    public DeliveryProvider getDeliveryProvider() {
        return deliveryProvider;
    }

    public void setDeliveryProvider(DeliveryProvider deliveryProvider) {
        this.deliveryProvider = deliveryProvider;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        return "Order{" +
                "orderID='" + orderID + '\'' +
                ", date='" + formatter.format(date) + '\'' +
                ", price='" + price + '\'' +
                ", customer='" + customer.toString() + '\'' +
                ", waiter='" + courier.toString() + '\'' +
                ", cafe='" + cafe.toString() + '\'' +
                ", paymentType='" + paymentType.toString() + '\'' +
                ", menuItemsList='" + menuItemsList.toString() + '\'' +
                '}';
    }
}
