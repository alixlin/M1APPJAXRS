package miage.service;

import miage.dto.OrderDTO;
import miage.service.OrderService;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class OrderServiceImpl implements OrderService {

    private static int orderId = 0;

    private Map<Integer, OrderDTO> ordersMap = new HashMap<>();
    @Override
    public OrderDTO createNewOrder() {
        var order = new OrderDTO(orderId++);
        ordersMap.put(order.getId(),order);
        return order;
    }

    @Override
    public OrderDTO getOrder(int orderId) {
        return ordersMap.get(orderId);
    }
}
