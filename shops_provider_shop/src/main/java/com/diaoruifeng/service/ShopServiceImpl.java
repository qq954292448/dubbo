package com.diaoruifeng.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.diaoruifeng.dao.ShopMapper;
import com.diaoruifeng.entity.Shop;
@Service(interfaceClass=ShopService.class)
public class ShopServiceImpl implements ShopService {
	@Autowired
	ShopMapper shopMapper;
	@Override
	public List<Shop> getShopList() {
		// TODO Auto-generated method stub
		return shopMapper.getAllShops();
	}

}
