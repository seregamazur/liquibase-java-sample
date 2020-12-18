package liqui.db.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(schema = "DEVELOP", name = "ORDER_ITEM")
public class OrderItem {

    @Id
    private Integer id;

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "PRODUCT_ID")
    private Product product;

    private int quantity;
}
