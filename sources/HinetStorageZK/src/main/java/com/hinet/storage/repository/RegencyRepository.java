/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hinet.storage.repository;

import com.hinet.storage.pojo.Regency;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author duynn
 * @create_date 20/12/2017
 */
public interface RegencyRepository {

    List<Regency> getRegencies();

    boolean updateRegency(Regency regency);

    boolean insertRengecy(Regency regency);

    boolean deleteRegency(Serializable id);
}
