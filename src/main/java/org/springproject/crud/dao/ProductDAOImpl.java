package org.springproject.crud.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springproject.crud.model.Product;

import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class ProductDAOImpl implements ProductDAO
{
    private SessionFactory sessionFactory;

    public ProductDAOImpl()
    {
    }

    @Autowired
    public ProductDAOImpl(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }


    @Transactional
    @Override
    public void createProduct(Product product)
    {
        this.sessionFactory.getCurrentSession().persist(product);
    }

    @Override
    public List<Product> getProducts()
    {
        return sessionFactory.getCurrentSession().createQuery("from Product").getResultList();
    }

    @Transactional
    @Override
    public void deleteProduct(int pId)
    {
        Product result = getSingleProduct(pId);
        this.sessionFactory.getCurrentSession().remove(result);
    }

    @Override
    public Product getSingleProduct(int pId)
    {
        Query query = this.sessionFactory.getCurrentSession().createQuery("from Product where id=:x");
        query.setParameter("x",pId);
        return (Product) query.getSingleResult();
    }

    @Override
    @Transactional
    public void update(Product product)
    {
        Product result = getSingleProduct(product.getId());

        if (!result.getName().equals(product.getName()))
                result.setName(product.getName());
        if (!result.getDescription().equals(product.getDescription()))
                result.setDescription(product.getDescription());
        if (result.getPrice() != product.getPrice())
                result.setPrice(product.getPrice());

        this.sessionFactory.getCurrentSession().merge(result);
    }

}
