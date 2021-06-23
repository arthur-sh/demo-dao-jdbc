package db.model.dao;

import db.model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller obj);
    void update(Seller obj);
    void deleteByID(Integer obj);
    Seller findByID(Integer obj);
    List<Seller> findAll();
}
