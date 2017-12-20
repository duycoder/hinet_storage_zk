/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hinet.storage.service;

import com.hinet.storage.pojo.Regency;
import com.hinet.storage.repository.RegencyRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author duynn
 * @create_date 20/12/2017
 */
@Service("regencyService")
public class RegencyServiceImpl implements RegencyService {

    @Autowired
    private RegencyRepository regencyRepository;
    
    @Override
    public List<Regency> getRegencies() {
        return regencyRepository.getRegencies();
    }
    
}
