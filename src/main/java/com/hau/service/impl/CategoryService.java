package com.hau.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.hau.dao.ICategoryDao;
import com.hau.model.CategoryModel;
import com.hau.service.ICategoryService;

public class CategoryService implements ICategoryService {

	@Inject
	private ICategoryDao categoryDao;
	
	@Override
	public List<CategoryModel> findAll() {
		return categoryDao.findAll();
	}

}
