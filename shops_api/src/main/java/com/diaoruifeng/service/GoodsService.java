package com.diaoruifeng.service;

import com.diaoruifeng.entity.Goods;
import com.github.pagehelper.PageInfo;
/** 
 * @ClassName: GoodsService 
 * @Description: TODO
 * @author: 刁瑞峰
 * @date: 2019年9月5日 下午3:45:09  
 */
public interface GoodsService {
	int create(Goods goods);
	
	int deleteById(Integer id);
	int deleteBatch(Integer[] ids);
	
	int update(Goods goods);
	
	Goods findById(Integer id);
	
	PageInfo<Goods> list(int pageNum,int pageSize);
}
