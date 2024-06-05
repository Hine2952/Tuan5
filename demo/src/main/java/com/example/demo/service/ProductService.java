package com.example.demo.service;

import com.example.demo.model.Product;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> listProduct = new ArrayList<>();
    public ProductService() {
        this.listProduct.add(new Product(1, "San pham 1", "1.jpg", 29312));
        this.listProduct.add(new Product(2, "San phda 2", "2.jpg", 124266));
    }
    public void add(Product newProduct) {
        listProduct.add(newProduct);
    }
    public List<Product> GetALL() {
        return listProduct;
    }
    public Product get(int id) {
        return listProduct.stream().filter(p->p.getId() == id).findFirst().orElse(null);
    }
    public void edit(Product editProduct) {
        Product find = listProduct.get(editProduct.getId());
        if(find!=null){
            find.setName(editProduct.getName());
            find.setImage(editProduct.getImage());
            find.setPrice(editProduct.getPrice());
        }
    }
    // Delete a product by its id
    public void delete(Product deleteProduct) {
        Product find = listProduct.get(deleteProduct.getId());
        if (find!=null) {
            listProduct.remove(find);
        }
    }
}

