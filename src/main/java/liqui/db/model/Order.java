package liqui.db.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Table(schema = "DEVELOP", name = "ORDER")
public class Order {

    @Id
    private Integer id;

    private String date;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID", referencedColumnName = "CUSTOMER_ID")
    private Customer customer;

    @OneToMany
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ID")
    private List<OrderItem> products;
}
