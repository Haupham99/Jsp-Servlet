package com.hau.dao;

import java.util.List;

import com.hau.model.NewsModel;

public interface INewDao {
	List<NewsModel> findByCategoryId(Long categoryId);
}
