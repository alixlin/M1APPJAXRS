package miage.service;

import miage.dto.OrderDTO;

public interface OrderService {

    public OrderDTO createNewOrder();

    OrderDTO getOrder(int orderId);
}
