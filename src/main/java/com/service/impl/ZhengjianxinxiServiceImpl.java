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


import com.dao.ZhengjianxinxiDao;
import com.entity.ZhengjianxinxiEntity;
import com.service.ZhengjianxinxiService;
import com.entity.vo.ZhengjianxinxiVO;
import com.entity.view.ZhengjianxinxiView;

@Service("zhengjianxinxiService")
public class ZhengjianxinxiServiceImpl extends ServiceImpl<ZhengjianxinxiDao, ZhengjianxinxiEntity> implements ZhengjianxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhengjianxinxiEntity> page = this.selectPage(
                new Query<ZhengjianxinxiEntity>(params).getPage(),
                new EntityWrapper<ZhengjianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhengjianxinxiEntity> wrapper) {
		  Page<ZhengjianxinxiView> page =new Query<ZhengjianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhengjianxinxiVO> selectListVO(Wrapper<ZhengjianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhengjianxinxiVO selectVO(Wrapper<ZhengjianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhengjianxinxiView> selectListView(Wrapper<ZhengjianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhengjianxinxiView selectView(Wrapper<ZhengjianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
