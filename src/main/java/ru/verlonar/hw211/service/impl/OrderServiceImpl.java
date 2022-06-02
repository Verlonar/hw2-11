package ru.verlonar.hw211.service.impl;

import org.springframework.stereotype.Service;
import ru.verlonar.hw211.data.Orders;
import ru.verlonar.hw211.service.OrderService;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    Orders orders;

    public OrderServiceImpl(Orders orders) {
        this.orders = orders;
    }

    @Override
    public String add(int[] id) {
        for (int j : id) {
            orders.addToOrdersList(j);
        }
        return "success";
    }

    @Override
    public List<Integer> get() {
        return orders.getOrderList();
    }
}
