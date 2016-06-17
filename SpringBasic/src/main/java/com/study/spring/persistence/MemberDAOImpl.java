package com.study.spring.persistence;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.study.spring.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.study.spring.mapper.memberMapper";
	
	@Override
	public String getNow() {
		return sqlSession.selectOne(namespace+".getNow");
	}

	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert(namespace+".insert",vo);	
	}

	@Override
	public MemberVO get(String user_id) {
		
		return sqlSession.selectOne(namespace+".get",user_id);
	}

	@Override
	public List<MemberVO> getList() {
		
		return sqlSession.selectList(namespace+".getList");
	}

	@Override
	public void update(MemberVO vo) {		
		 sqlSession.update(namespace+".update",vo);
	}
	@Override
	public void delete(String id) {		
		 sqlSession.update(namespace+".delete",id);
	}
	
}
