package lt.akademija.jpaexam;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductCartRepository {
	@Autowired
	EntityManager em;
	
	public List<ProductCartEntity> findAll(){
		return em.createQuery("SELECT p FROM ProductCartEntity p").getResultList();
		}
	
	
	@Transactional
	public ProductCartEntity saveOrUpdate(ProductCartEntity productCart){
		if(productCart.getId() != null){
			return em.merge(productCart);
		} else {
			em.persist(productCart);
			return productCart;
		}
	}

}
