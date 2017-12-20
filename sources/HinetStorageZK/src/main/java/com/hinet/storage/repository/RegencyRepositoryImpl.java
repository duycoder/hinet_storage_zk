/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hinet.storage.repository;

import com.hinet.storage.pojo.Regency;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author duynn
 * @create_date 20/12/2017
 */
@Repository("regencyRepository")
public class RegencyRepositoryImpl extends BaseRepositoryImpl implements RegencyRepository {

    @Override
    public List<Regency> getRegencies() {
        return this.getEntities(Regency.class);
    }

    @Override
    public boolean updateRegency(Regency regency) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insertRengecy(Regency regency) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteRegency(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
