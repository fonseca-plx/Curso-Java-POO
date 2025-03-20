package entities;

import entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> itens = new ArrayList<>();

    public Order(OrderStatus status, Client client) {
        this.moment = new Date();
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItens() {
        return itens;
    }

    public void addItem(OrderItem item) {
        itens.add(item);
    }

    public void removeItem(OrderItem item) {
        itens.remove(item);
    }

    public Double total() {
        double total = 0.0;
        for (OrderItem item : itens) {
            total += item.subTotal();
        }
        return total;
    }
}
