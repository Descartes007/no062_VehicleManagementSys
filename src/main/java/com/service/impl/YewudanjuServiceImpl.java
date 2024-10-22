package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YewudanjuDao;
import com.entity.YewudanjuEntity;
import com.service.YewudanjuService;
import com.entity.vo.YewudanjuVO;
import com.entity.view.YewudanjuView;

@Service("yewudanjuService")
public class YewudanjuServiceImpl extends ServiceImpl<YewudanjuDao, YewudanjuEntity> implements YewudanjuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YewudanjuEntity> page = this.selectPage(
                new Query<YewudanjuEntity>(params).getPage(),
                new EntityWrapper<YewudanjuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YewudanjuEntity> wrapper) {
		  Page<YewudanjuView> page =new Query<YewudanjuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YewudanjuVO> selectListVO(Wrapper<YewudanjuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YewudanjuVO selectVO(Wrapper<YewudanjuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YewudanjuView> selectListView(Wrapper<YewudanjuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YewudanjuView selectView(Wrapper<YewudanjuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
