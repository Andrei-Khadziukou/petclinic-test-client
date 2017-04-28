package com.epam.petclinic.client.api;

import com.epam.petclinic.client.domain.Order;
import javafx.print.Collation;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/**
 * The interface to provide access/API calls to the Order Service.
 * <p>
 * Date: 04/26/2017
 *
 * @author Andrei_Khadziukou
 */
@FeignClient(
        qualifier = "test.orderClient", // name of the bean in the Spring context
        name = "ORDER-SERVICE" // name of the service to connect
)
public interface OrderClient {

    /**
     * The API call to get the collection of orders
     *
     * @return the collection of orders.
     */
    @RequestMapping(value = "/orders/", method = RequestMethod.GET)
    Collection<Order> getOrders();
}
