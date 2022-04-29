package org.springproject.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springproject.crud.dao.ProductDAO;
import org.springproject.crud.model.Product;

import java.util.List;

@Controller
@RequestMapping("/")
public class MainController
{
    private ProductDAO productDAO;

    @Autowired
    public void setProductDAO(ProductDAO productDAO)
    {
        this.productDAO = productDAO;
    }

    @RequestMapping("/")
    public String home(Model model)
    {
        List<Product> products = this.productDAO.getProducts();
        model.addAttribute("products", products);
        return "index";
    }

    @RequestMapping("/add-product")
    public String addProduct()
    {
        return "add_product_form";
    }

    @PostMapping("/handle-product")
    public String handleForm(@ModelAttribute Product product)
    {
        System.out.println(product);
        this.productDAO.createProduct(product);
        return "redirect:/";
    }

    @RequestMapping("/delete/{productId}")
    public String deleteProduct(@PathVariable("productId") int productId)
    {
        this.productDAO.deleteProduct(productId);
        return "redirect:/";
    }

    @RequestMapping("/update/{productId}")
    public String updateForm(@PathVariable("productId") int productId, Model model)
    {
        Product singleProduct = this.productDAO.getSingleProduct(productId);
        model.addAttribute("product", singleProduct);
        return "update_form";
    }

    @RequestMapping("/product-update")
    public String updateProduct(@ModelAttribute Product product)
    {
        System.out.println("IN product update method...");
        System.out.println(product);
        this.productDAO.update(product);
        return "redirect:/";
    }
}
