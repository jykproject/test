package com.study.springrest.service;
import java.util.List;

import com.study.springrest.domain.RestVO;


public interface RestService {
		
		public void insert(RestVO vo);
		public RestVO get(int reply_no);
		public List<RestVO> getList();
		
		public void update(RestVO vo);
		public void delete(int reply_no);
	
}
