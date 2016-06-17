package com.study.springrest.persistence;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.study.springrest.domain.ReplyVO;



@Repository
public class ReplyDAOImpl implements ReplyDAO{

	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.study.springrest.mappers.restMapper";
	
	@Override
	public void insert(ReplyVO vo) {
		sqlSession.insert(namespace+".insert",vo);	
	}

	@Override
	public ReplyVO get(int board_no) {
		
		return sqlSession.selectOne(namespace+".get",board_no);
	}

	@Override
	public List<ReplyVO> getList() {
		
		return sqlSession.selectList(namespace+".getList");
	}

	@Override
	public void update(ReplyVO vo) {		
		 sqlSession.update(namespace+".update",vo);
	}
	@Override
	public void delete(int board_no) {		
		 sqlSession.update(namespace+".delete",board_no);
	}
	
}
