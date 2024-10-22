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


import com.dao.BaoyangdengjiDao;
import com.entity.BaoyangdengjiEntity;
import com.service.BaoyangdengjiService;
import com.entity.vo.BaoyangdengjiVO;
import com.entity.view.BaoyangdengjiView;

@Service("baoyangdengjiService")
public class BaoyangdengjiServiceImpl extends ServiceImpl<BaoyangdengjiDao, BaoyangdengjiEntity> implements BaoyangdengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaoyangdengjiEntity> page = this.selectPage(
                new Query<BaoyangdengjiEntity>(params).getPage(),
                new EntityWrapper<BaoyangdengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaoyangdengjiEntity> wrapper) {
		  Page<BaoyangdengjiView> page =new Query<BaoyangdengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaoyangdengjiVO> selectListVO(Wrapper<BaoyangdengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaoyangdengjiVO selectVO(Wrapper<BaoyangdengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaoyangdengjiView> selectListView(Wrapper<BaoyangdengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaoyangdengjiView selectView(Wrapper<BaoyangdengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
