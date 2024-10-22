package com.dao;

import com.entity.WeixiudengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeixiudengjiVO;
import com.entity.view.WeixiudengjiView;


/**
 * 维修登记
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:19:40
 */
public interface WeixiudengjiDao extends BaseMapper<WeixiudengjiEntity> {
	
	List<WeixiudengjiVO> selectListVO(@Param("ew") Wrapper<WeixiudengjiEntity> wrapper);
	
	WeixiudengjiVO selectVO(@Param("ew") Wrapper<WeixiudengjiEntity> wrapper);
	
	List<WeixiudengjiView> selectListView(@Param("ew") Wrapper<WeixiudengjiEntity> wrapper);

	List<WeixiudengjiView> selectListView(Pagination page,@Param("ew") Wrapper<WeixiudengjiEntity> wrapper);
	
	WeixiudengjiView selectView(@Param("ew") Wrapper<WeixiudengjiEntity> wrapper);
	
}
