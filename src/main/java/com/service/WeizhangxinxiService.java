package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeizhangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeizhangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeizhangxinxiView;


/**
 * 违章信息
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:19:40
 */
public interface WeizhangxinxiService extends IService<WeizhangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeizhangxinxiVO> selectListVO(Wrapper<WeizhangxinxiEntity> wrapper);
   	
   	WeizhangxinxiVO selectVO(@Param("ew") Wrapper<WeizhangxinxiEntity> wrapper);
   	
   	List<WeizhangxinxiView> selectListView(Wrapper<WeizhangxinxiEntity> wrapper);
   	
   	WeizhangxinxiView selectView(@Param("ew") Wrapper<WeizhangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeizhangxinxiEntity> wrapper);
   	
}

