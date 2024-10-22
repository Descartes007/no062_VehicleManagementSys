package com.dao;

import com.entity.YewudanjuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YewudanjuVO;
import com.entity.view.YewudanjuView;


/**
 * 业务单据
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:19:40
 */
public interface YewudanjuDao extends BaseMapper<YewudanjuEntity> {
	
	List<YewudanjuVO> selectListVO(@Param("ew") Wrapper<YewudanjuEntity> wrapper);
	
	YewudanjuVO selectVO(@Param("ew") Wrapper<YewudanjuEntity> wrapper);
	
	List<YewudanjuView> selectListView(@Param("ew") Wrapper<YewudanjuEntity> wrapper);

	List<YewudanjuView> selectListView(Pagination page,@Param("ew") Wrapper<YewudanjuEntity> wrapper);
	
	YewudanjuView selectView(@Param("ew") Wrapper<YewudanjuEntity> wrapper);
	
}
