package com.aeronaut.swagger.model;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Item {

    private String title;

    @ApiModelProperty
    private String note;
    //positiveInteger
    @ApiModelProperty
    private Integer quantity;
    @ApiModelProperty
    private BigDecimal price;

    public Item(String title, String note, Integer quantity, BigDecimal price) {
        this.title = title;
        this.note = note;
        this.quantity = quantity;
        this.price = price;
    }

    public Item() {

    }

    @ApiModelProperty(value = "param", required = true, notes = "bla")
    public String getTitle() {
        return title;
    }

    public String getNote() {
        return note;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
