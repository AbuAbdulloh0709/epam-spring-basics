package com.epam.esm.service;

import com.epam.esm.entity.Tag;
import com.epam.esm.exception.DaoException;
import com.epam.esm.exceptions.IncorrectParameterException;

import java.util.List;

public interface TagService extends BaseService<Tag> {
    List<Tag> getByName(String name) throws DaoException, IncorrectParameterException;
}
