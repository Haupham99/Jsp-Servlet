package com.hau.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.hau.dao.INewDao;
import com.hau.model.NewsModel;
import com.hau.service.INewService;

public class NewService implements INewService {
	
	@Inject
	private INewDao newDao;
	
	@Override
	public List<NewsModel> findByCategoryId(Long categoryId){
		return newDao.findByCategoryId(categoryId);
	};
}
