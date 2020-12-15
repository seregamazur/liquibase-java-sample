package liqui.db.model;

import javax.persistence.Column;
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
@Table(name = "CUSTOMER")
public class Customer {

    @Id
    @Column(name = "ID")
    private Integer id;

    private String name;

    private String surname;
}
