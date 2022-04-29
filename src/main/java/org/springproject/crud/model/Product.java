package org.springproject.crud.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
@IdClass(ProductId.class)
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_seq")
    @SequenceGenerator(name = "my_seq", initialValue = 1, allocationSize = 1)
    @Column(name = "product_id")
    private int id;
    @Id
    @Column(name = "product_name")
    private String name;
    @Column(name = "product_desc")
    private String description;
    @Column(name = "product_price")
    private long price;

    public Product()
    {
    }

    public Product(String name, String description, long price)
    {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public long getPrice()
    {
        return price;
    }

    public void setPrice(long price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
