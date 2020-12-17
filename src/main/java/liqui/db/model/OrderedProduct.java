package liqui.db.model;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OrderedProduct {

    private Product product;
    private int quantity;

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final OrderedProduct that = (OrderedProduct) o;
        return quantity == that.quantity &&
            Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, quantity);
    }

}
