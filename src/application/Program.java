package application;

import db.model.dao.DaoFactory;
import db.model.dao.SellerDao;
import db.model.entities.Seller;

public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findByID(3);

        System.out.println(seller);
    }
}
