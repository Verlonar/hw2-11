package ru.verlonar.hw211.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.verlonar.hw211.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @GetMapping("/add")
    public String add(@RequestParam int[] id) {
        return orderService.add(id);
    }

    @GetMapping("get")
    public List<Integer> get() {
        return orderService.get();
    }
}
