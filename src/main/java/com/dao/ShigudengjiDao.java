package com.dao;

import com.entity.ShigudengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShigudengjiVO;
import com.entity.view.ShigudengjiView;


/**
 * 事故登记
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:19:40
 */
public interface ShigudengjiDao extends BaseMapper<ShigudengjiEntity> {
	
	List<ShigudengjiVO> selectListVO(@Param("ew") Wrapper<ShigudengjiEntity> wrapper);
	
	ShigudengjiVO selectVO(@Param("ew") Wrapper<ShigudengjiEntity> wrapper);
	
	List<ShigudengjiView> selectListView(@Param("ew") Wrapper<ShigudengjiEntity> wrapper);

	List<ShigudengjiView> selectListView(Pagination page,@Param("ew") Wrapper<ShigudengjiEntity> wrapper);
	
	ShigudengjiView selectView(@Param("ew") Wrapper<ShigudengjiEntity> wrapper);
	
}
