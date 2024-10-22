package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaoyangdengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaoyangdengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaoyangdengjiView;


/**
 * 保养登记
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:19:40
 */
public interface BaoyangdengjiService extends IService<BaoyangdengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaoyangdengjiVO> selectListVO(Wrapper<BaoyangdengjiEntity> wrapper);
   	
   	BaoyangdengjiVO selectVO(@Param("ew") Wrapper<BaoyangdengjiEntity> wrapper);
   	
   	List<BaoyangdengjiView> selectListView(Wrapper<BaoyangdengjiEntity> wrapper);
   	
   	BaoyangdengjiView selectView(@Param("ew") Wrapper<BaoyangdengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaoyangdengjiEntity> wrapper);
   	
}

