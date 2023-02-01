import model.*;
import service.ObjectDeserializer;
import service.ObjectSerializer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {

    public  static void main(String[]args) throws SQLException, IOException {
        Courier courier = new Courier(1, "Андрій", "Колобок");
        PaymentType paymentType = new PaymentType(1, "Готівкою");
        DeliveryProvider deliveryProvider = new DeliveryProvider(1,"Glovo");
        Cafe cafe = new Cafe(1,"ComfortTown");
        Customer customer = new Customer(1,"Джавеліна","Прекрасна","+380937648576","dja@gmail.com");
        OrderDelivery orderDelivery = new OrderDelivery(1, new Date(), 1500, customer, courier, cafe, deliveryProvider,paymentType);
        orderDelivery.addMenuItem(new MenuItems(1,"Бобер", "Bober", 123));
        orderDelivery.addMenuItem(new MenuItems(2,"Жабка", "Jabka", 321));
        orderDelivery.addMenuItem(new MenuItems(3,"Крокодил", "Krokodil", 231));

        ObjectSerializer objectSerializer = new ObjectSerializer();
        System.out.println(objectSerializer.toJson(orderDelivery));

        ObjectDeserializer objectDeserializer = new ObjectDeserializer();
        Path filePath = Path.of("src/main/resources/order_delivery.json");

        String content = Files.readString(filePath);
        OrderDelivery orderDeliveryFromJson = objectDeserializer.orderFromJson(content);
        System.out.println(orderDeliveryFromJson);







    }
}
