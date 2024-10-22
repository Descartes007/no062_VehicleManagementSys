package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShigudengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShigudengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShigudengjiView;


/**
 * 事故登记
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:19:40
 */
public interface ShigudengjiService extends IService<ShigudengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShigudengjiVO> selectListVO(Wrapper<ShigudengjiEntity> wrapper);
   	
   	ShigudengjiVO selectVO(@Param("ew") Wrapper<ShigudengjiEntity> wrapper);
   	
   	List<ShigudengjiView> selectListView(Wrapper<ShigudengjiEntity> wrapper);
   	
   	ShigudengjiView selectView(@Param("ew") Wrapper<ShigudengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShigudengjiEntity> wrapper);
   	
}

