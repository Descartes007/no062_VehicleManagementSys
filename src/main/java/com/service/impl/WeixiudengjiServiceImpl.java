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


import com.dao.WeixiudengjiDao;
import com.entity.WeixiudengjiEntity;
import com.service.WeixiudengjiService;
import com.entity.vo.WeixiudengjiVO;
import com.entity.view.WeixiudengjiView;

@Service("weixiudengjiService")
public class WeixiudengjiServiceImpl extends ServiceImpl<WeixiudengjiDao, WeixiudengjiEntity> implements WeixiudengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeixiudengjiEntity> page = this.selectPage(
                new Query<WeixiudengjiEntity>(params).getPage(),
                new EntityWrapper<WeixiudengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeixiudengjiEntity> wrapper) {
		  Page<WeixiudengjiView> page =new Query<WeixiudengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeixiudengjiVO> selectListVO(Wrapper<WeixiudengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeixiudengjiVO selectVO(Wrapper<WeixiudengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeixiudengjiView> selectListView(Wrapper<WeixiudengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeixiudengjiView selectView(Wrapper<WeixiudengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
