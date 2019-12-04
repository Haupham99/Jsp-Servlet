package com.hau.dao;

import java.util.List;

import com.hau.model.CategoryModel;

public interface ICategoryDao {
	List<CategoryModel> findAll();
}
