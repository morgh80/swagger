package com.aeronaut.swagger.controller;

import com.aeronaut.swagger.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class OrderController {

    @Autowired
    Item item;

@RequestMapping(value = "/item", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public Item showItem() {
    return item;

}

}
