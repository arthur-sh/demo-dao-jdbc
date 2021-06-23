package db.model.dao;

import db.DB;
import db.model.dao.impl.SellerDaoJDBC;
import db.model.entities.Seller;

import java.util.List;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
}
