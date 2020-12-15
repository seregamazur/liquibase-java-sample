package liqui.db.model;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "ORDER")
public class Order {

    @Id
    private Integer id;

    private String date;

    private Customer customer;

    private List<Product> products;
}
