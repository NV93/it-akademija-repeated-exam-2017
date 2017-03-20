package lt.akademija.jpaexam;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
	@Autowired
	EntityManager em;
	
	public List<ProductEntity> findAll(){
		return em.createQuery("SELECT p FROM ProductEntity p").getResultList();
		}
		
	@Transactional
	public ProductEntity saveOrUpdate(ProductEntity product){
		if(product.getId() != null){
			return em.merge(product);
		} else {
			em.persist(product);
			return product;
		}
		
	}

}
