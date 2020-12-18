package liqui.db.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(schema = "DEVELOP", name = "PRODUCT")
public class Product {

    @Id
    private Integer id;

    private String name;

    @Enumerated(EnumType.STRING)
    @JoinColumn(name = "UNIT", referencedColumnName = "NAME")
    private Unit unit;
}
