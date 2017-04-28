package com.epam.petclinic.client.controller;

import com.epam.petclinic.client.api.OrderClient;
import com.epam.petclinic.client.domain.Order;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * The controller what provides access to the REST calls to another service (ORDER-SERVICE).
 * <p>
 * Date: 04/28/2017
 *
 * @author Andrei_Khadziukou
 */
@RestController
@RequestMapping(value = "/test-client/orders", produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {

    @Resource
    private OrderClient orderClient;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    Collection<Order> retrieveAllOrders() {
        return orderClient.getOrders();
    }
}
