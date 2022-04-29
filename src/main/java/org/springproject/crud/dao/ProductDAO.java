package org.springproject.crud.dao;

import org.springproject.crud.model.Product;
import org.springproject.crud.model.ProductId;

import java.util.List;

public interface ProductDAO
{
    public void createProduct(Product product);
    public List<Product> getProducts();
    public void deleteProduct(int pId);
    public Product getSingleProduct(int pId);
    public void update(Product product);
}
