package com.dao;

import com.entity.ZhengjianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhengjianxinxiVO;
import com.entity.view.ZhengjianxinxiView;


/**
 * 证件信息
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:19:40
 */
public interface ZhengjianxinxiDao extends BaseMapper<ZhengjianxinxiEntity> {
	
	List<ZhengjianxinxiVO> selectListVO(@Param("ew") Wrapper<ZhengjianxinxiEntity> wrapper);
	
	ZhengjianxinxiVO selectVO(@Param("ew") Wrapper<ZhengjianxinxiEntity> wrapper);
	
	List<ZhengjianxinxiView> selectListView(@Param("ew") Wrapper<ZhengjianxinxiEntity> wrapper);

	List<ZhengjianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhengjianxinxiEntity> wrapper);
	
	ZhengjianxinxiView selectView(@Param("ew") Wrapper<ZhengjianxinxiEntity> wrapper);
	
}
