package com.robertoapi.login_and_authentication_api.dtos;

import com.robertoapi.login_and_authentication_api.model.Category;
import com.robertoapi.login_and_authentication_api.model.Inventory;
import lombok.Data;

@Data
public class ProductRequestDTO {
    private String name;
    private String description;
    private Double price;
    private Inventory inventory;
    private Category category;
}
