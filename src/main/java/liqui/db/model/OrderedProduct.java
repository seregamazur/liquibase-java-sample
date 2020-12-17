package liqui.db.model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
@Entity
@Table(schema = "DEVELOP", name = "ORDERED_PRODUCT")
public class OrderedProduct {

    @Id
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    private Product product;

    private Integer quantity;

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final OrderedProduct that = (OrderedProduct) o;
        return quantity.equals(that.quantity) &&
            Objects.equals(id, that.id) &&
            Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product, quantity);
    }
}
