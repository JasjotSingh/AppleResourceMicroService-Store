package com.apple.resource;

import com.apple.entity.ProductList;
import com.apple.entity.Products;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/apple")
public class Apple {

    @GetMapping("/")
    public ProductList getProducts(){
        List<Products> prodList = new ArrayList<>();
        prodList.add(new Products(1201, "a1", "phone"));
        prodList.add(new Products(1202, "a2", "phone"));
        prodList.add(new Products(1203, "a3", "phone"));
        prodList.add(new Products(1204, "a4", "phone"));

        return new ProductList(prodList);
    }
}
