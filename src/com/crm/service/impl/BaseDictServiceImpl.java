package com.crm.service.impl;

import java.util.List;

import com.crm.dao.BaseDictDao;
import com.crm.domain.BaseDict;
import com.crm.service.BaseDictService;

public class BaseDictServiceImpl implements BaseDictService {
	private BaseDictDao baseDictDao;

	public void setBaseDictDao(BaseDictDao baseDictDao) {
		this.baseDictDao = baseDictDao;
	}

	@Override
	public List<BaseDict> findByTypeCode(String dict_type_code) throws Exception {
		List<BaseDict> list = baseDictDao.findByTypeCode(dict_type_code);
		return list;
	}

}
