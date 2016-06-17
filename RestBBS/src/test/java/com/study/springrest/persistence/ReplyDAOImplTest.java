package com.study.springrest.persistence;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.springrest.domain.ReplyVO;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class ReplyDAOImplTest {
	
	@Inject
	private ReplyDAO dao;
	
	@Test
	public void insert() throws Exception{
		ReplyVO vo = new ReplyVO();
	
		vo.setContent("내용");
		vo.setUser_name("유저네임");
		dao.insert(vo);
	}
	
	@Test
	public void getTest() throws Exception{
		ReplyVO vo = dao.get(2);
		System.out.println("이름:"+vo.getUser_name());
	}
	
	@Test
	public void getListTest() throws Exception{
		List<ReplyVO> list = dao.getList();
		Iterator<ReplyVO> It = list.iterator();
		while(It.hasNext()){
			ReplyVO vo = It.next();
			System.out.println("이름:"+vo.getUser_name());
		}	
	}	
	
	@Test
	public void updateTest() throws Exception{
		ReplyVO vo = new ReplyVO();
		
		vo.setContent("내용");
		vo.setUser_name("유저네임");
		vo.setBoard_no(2);
		
		dao.update(vo);
	}

	@Test
	public void deleteTest() throws Exception{
	
		dao.delete(3);
	}
}
