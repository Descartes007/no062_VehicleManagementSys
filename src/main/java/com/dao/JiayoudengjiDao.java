package com.dao;

import com.entity.JiayoudengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiayoudengjiVO;
import com.entity.view.JiayoudengjiView;


/**
 * 加油登记
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:19:40
 */
public interface JiayoudengjiDao extends BaseMapper<JiayoudengjiEntity> {
	
	List<JiayoudengjiVO> selectListVO(@Param("ew") Wrapper<JiayoudengjiEntity> wrapper);
	
	JiayoudengjiVO selectVO(@Param("ew") Wrapper<JiayoudengjiEntity> wrapper);
	
	List<JiayoudengjiView> selectListView(@Param("ew") Wrapper<JiayoudengjiEntity> wrapper);

	List<JiayoudengjiView> selectListView(Pagination page,@Param("ew") Wrapper<JiayoudengjiEntity> wrapper);
	
	JiayoudengjiView selectView(@Param("ew") Wrapper<JiayoudengjiEntity> wrapper);
	
}
