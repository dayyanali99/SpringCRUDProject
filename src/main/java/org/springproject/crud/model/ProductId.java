package org.springproject.crud.model;

import java.io.Serializable;

public class ProductId implements Serializable
{
    private int id;
    private String name;

    public ProductId()
    {
    }

    public ProductId(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof ProductId)) return false;

        ProductId productId = (ProductId) o;

        if (id != productId.id) return false;
        return name.equals(productId.name);
    }

    @Override
    public int hashCode()
    {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }
}
