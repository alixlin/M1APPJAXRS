package miage.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderDTO {
    private int id;
    private double total;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDTO orderDTO = (OrderDTO) o;
        return id == orderDTO.id && Double.compare(orderDTO.total, total) == 0 && Objects.equals(productList, orderDTO.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, total, productList);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<ProductDTO> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductDTO> productList) {
        this.productList = productList;
    }

    public OrderDTO() {
    }

    public OrderDTO(int id) {
        this.id = id;
    }

    public OrderDTO(int id, double total, List<ProductDTO> productList) {
        this.id = id;
        this.total = total;
        this.productList = productList;
    }

    private List<ProductDTO> productList = new ArrayList<>();

    @Override
    public String toString() {
        return "OrderDTO{" +
                "id=" + id +
                ", total=" + total +
                ", productList=" + productList +
                '}';
    }
}
