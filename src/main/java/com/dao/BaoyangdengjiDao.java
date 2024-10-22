package com.dao;

import com.entity.BaoyangdengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaoyangdengjiVO;
import com.entity.view.BaoyangdengjiView;


/**
 * 保养登记
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:19:40
 */
public interface BaoyangdengjiDao extends BaseMapper<BaoyangdengjiEntity> {
	
	List<BaoyangdengjiVO> selectListVO(@Param("ew") Wrapper<BaoyangdengjiEntity> wrapper);
	
	BaoyangdengjiVO selectVO(@Param("ew") Wrapper<BaoyangdengjiEntity> wrapper);
	
	List<BaoyangdengjiView> selectListView(@Param("ew") Wrapper<BaoyangdengjiEntity> wrapper);

	List<BaoyangdengjiView> selectListView(Pagination page,@Param("ew") Wrapper<BaoyangdengjiEntity> wrapper);
	
	BaoyangdengjiView selectView(@Param("ew") Wrapper<BaoyangdengjiEntity> wrapper);
	
}
