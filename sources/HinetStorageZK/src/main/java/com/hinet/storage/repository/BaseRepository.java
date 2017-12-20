/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hinet.storage.repository;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author duynn
 * @create_date 20/12/2017
 */
public interface BaseRepository {

    <T> List<T> getEntities(Class<T> clazz);

    <T> List<T> getAll(Class<T> clazz);

    <T> void Save(T clazz);

    <T> T findByPrimaryKey(Class<T> klass, Serializable id);

    <T> T GetUniqueEntityByNamedQuery(String query, Object... params);

    <T> List<T> GetListByNamedQuery(String query, Object... params);

    <T> void delete(T clazz);

    <T> Long getQueryCount(String query, Object... params);
}
