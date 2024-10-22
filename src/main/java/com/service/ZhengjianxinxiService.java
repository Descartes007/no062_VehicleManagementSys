package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhengjianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhengjianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhengjianxinxiView;


/**
 * 证件信息
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:19:40
 */
public interface ZhengjianxinxiService extends IService<ZhengjianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhengjianxinxiVO> selectListVO(Wrapper<ZhengjianxinxiEntity> wrapper);
   	
   	ZhengjianxinxiVO selectVO(@Param("ew") Wrapper<ZhengjianxinxiEntity> wrapper);
   	
   	List<ZhengjianxinxiView> selectListView(Wrapper<ZhengjianxinxiEntity> wrapper);
   	
   	ZhengjianxinxiView selectView(@Param("ew") Wrapper<ZhengjianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhengjianxinxiEntity> wrapper);
   	
}

