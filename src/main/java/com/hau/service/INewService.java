package com.hau.service;

import java.util.List;

import com.hau.model.NewsModel;

public interface INewService {
	List<NewsModel> findByCategoryId(Long categoryId);
}
