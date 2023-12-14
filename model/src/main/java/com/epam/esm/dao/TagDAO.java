package com.epam.esm.dao;

import com.epam.esm.entity.Tag;
import com.epam.esm.exception.DaoException;

import java.util.List;

public interface TagDAO extends BaseDAO<Tag> {
    List<Tag> getByName(String name) throws DaoException;
}
