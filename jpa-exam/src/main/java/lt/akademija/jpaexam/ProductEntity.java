package lt.akademija.jpaexam;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lt.akademija.jpaexam.core.UpdatableEntity;
@Entity(name="product")
public class ProductEntity implements UpdatableEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String productName;
	private Float price;
	
	@Override
	public Long getId() {
		return id;
	}

	@Override
	public String getString() {
		return productName;
	}

	@Override
	public void setString(String productName) {
		this.productName = productName;
		
	}

}
