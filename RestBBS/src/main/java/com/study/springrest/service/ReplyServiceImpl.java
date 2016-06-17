package com.study.springrest.service;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.study.springrest.domain.ReplyVO;
import com.study.springrest.persistence.ReplyDAO;



@Service
public class ReplyServiceImpl implements ReplyService{

		@Inject
		private ReplyDAO dao;
		
	
		@Override
		public void insert(ReplyVO vo) {
			dao.insert(vo);	
		}

		@Override
		public ReplyVO get(int reply_no) {
			
			return dao.get(reply_no);
		}

		@Override
		public List<ReplyVO> getList() {
			
			return dao.getList();
		}

		@Override
		public void update(ReplyVO vo) {		
			dao.update(vo);
		}
		@Override
		public void delete(int reply_no) {		
			dao.delete(reply_no);
		}
}
