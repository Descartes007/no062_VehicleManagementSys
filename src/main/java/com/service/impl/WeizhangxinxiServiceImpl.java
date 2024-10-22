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


import com.dao.WeizhangxinxiDao;
import com.entity.WeizhangxinxiEntity;
import com.service.WeizhangxinxiService;
import com.entity.vo.WeizhangxinxiVO;
import com.entity.view.WeizhangxinxiView;

@Service("weizhangxinxiService")
public class WeizhangxinxiServiceImpl extends ServiceImpl<WeizhangxinxiDao, WeizhangxinxiEntity> implements WeizhangxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeizhangxinxiEntity> page = this.selectPage(
                new Query<WeizhangxinxiEntity>(params).getPage(),
                new EntityWrapper<WeizhangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeizhangxinxiEntity> wrapper) {
		  Page<WeizhangxinxiView> page =new Query<WeizhangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeizhangxinxiVO> selectListVO(Wrapper<WeizhangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeizhangxinxiVO selectVO(Wrapper<WeizhangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeizhangxinxiView> selectListView(Wrapper<WeizhangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeizhangxinxiView selectView(Wrapper<WeizhangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
