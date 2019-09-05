package com.diaoruifeng.service;

import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.diaoruifeng.entity.Goods;
import com.github.pagehelper.PageInfo;


@Service(interfaceClass=GoodsService.class)
@Transactional
public class GoodsServiceImpl implements GoodsService {

	@Override
	public int create(Goods goods) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBatch(Integer[] ids) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Goods goods) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Goods findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<Goods> list(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
