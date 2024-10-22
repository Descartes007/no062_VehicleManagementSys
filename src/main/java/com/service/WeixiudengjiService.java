package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeixiudengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeixiudengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeixiudengjiView;


/**
 * 维修登记
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:19:40
 */
public interface WeixiudengjiService extends IService<WeixiudengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeixiudengjiVO> selectListVO(Wrapper<WeixiudengjiEntity> wrapper);
   	
   	WeixiudengjiVO selectVO(@Param("ew") Wrapper<WeixiudengjiEntity> wrapper);
   	
   	List<WeixiudengjiView> selectListView(Wrapper<WeixiudengjiEntity> wrapper);
   	
   	WeixiudengjiView selectView(@Param("ew") Wrapper<WeixiudengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeixiudengjiEntity> wrapper);
   	
}

