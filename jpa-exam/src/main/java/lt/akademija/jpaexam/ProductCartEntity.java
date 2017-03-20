package lt.akademija.jpaexam;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lt.akademija.jpaexam.core.UniqueEntityWithAssociation;
import lt.akademija.jpaexam.core.UpdatableEntity;

@Entity(name="productCart")
public class ProductCartEntity implements UniqueEntityWithAssociation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@OneToMany(targetEntity=ProductEntity.class)
	private List<ProductEntity> products;
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public Collection<? extends UpdatableEntity> oneToMany() {
		// TODO Auto-generated method stub
		return products;
	}

}
