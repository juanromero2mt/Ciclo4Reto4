package reto2_web.Interface;


import java.util.Date;
import java.util.List;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import reto2_web.Model.Order;

/**
 *
 * @author desarrolloextremo
 */
public interface OrderCrudRepository extends CrudRepository<Order, Integer> {

    @Query("{'salesMan.zone': ?0}")
    List<Order> findByZone(final String country);
    
    @Query("{status: ?0}")
    List<Order> findByStatus(final String status);
}
