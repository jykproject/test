package com.study.spring.service;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.study.spring.domain.MemberVO;
import com.study.spring.persistence.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService{

		@Inject
		private MemberDAO dao;
		
		@Override
		public String getNow() {
			return dao.getNow();
		}

		@Override
		public void insertMember(MemberVO vo) {
			dao.insertMember(vo);	
		}

		@Override
		public MemberVO get(String user_id) {
			
			return dao.get(user_id);
		}

		@Override
		public List<MemberVO> getList() {
			
			return dao.getList();
		}

		@Override
		public void update(MemberVO vo) {		
			dao.update(vo);
		}
		@Override
		public void delete(String id) {		
			dao.delete(id);
		}
}
