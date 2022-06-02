package ru.verlonar.hw211.data;


import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Repository
@SessionScope
public class Orders {

    private final List<Integer> ordersList;

    public Orders(List<Integer> ordersList1) {
        this.ordersList = ordersList1;
    }

    public void addToOrdersList(int id) {
        ordersList.add(id);
    }

    public List<Integer> getOrderList() {
        return ordersList;
    }
}
