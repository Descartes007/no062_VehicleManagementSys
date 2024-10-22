package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YewudanjuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YewudanjuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YewudanjuView;


/**
 * 业务单据
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:19:40
 */
public interface YewudanjuService extends IService<YewudanjuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YewudanjuVO> selectListVO(Wrapper<YewudanjuEntity> wrapper);
   	
   	YewudanjuVO selectVO(@Param("ew") Wrapper<YewudanjuEntity> wrapper);
   	
   	List<YewudanjuView> selectListView(Wrapper<YewudanjuEntity> wrapper);
   	
   	YewudanjuView selectView(@Param("ew") Wrapper<YewudanjuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YewudanjuEntity> wrapper);
   	
}

