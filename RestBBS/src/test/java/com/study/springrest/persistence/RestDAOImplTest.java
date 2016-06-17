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

import com.study.springrest.domain.RestVO;
import com.study.springrest.persistence.RestDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class RestDAOImplTest {
	
	@Inject
	private RestDAO dao;
	
	@Test
	public void test() throws Exception{
		System.out.println("dao:"+dao);
	}
	
	@Test
	public void testNow() throws Exception{
		System.out.println("dao now:"+dao.getNow());
	}
	
//	@Test
//	public void insertMemberTest() throws Exception{
//		RestVO vo = new RestVO();
//		vo.setTitle("제목");
//		vo.setContent("내용");
//		vo.setUser_name("유저네임");
//		dao.insert(vo);
//	}
//	
//	@Test
//	public void getTest() throws Exception{
//		RestVO vo = dao.get(2);
//		System.out.println("이름:"+vo.getUser_name());
//	}
//	
//	@Test
//	public void getListTest() throws Exception{
//		List<RestVO> list = dao.getList();
//		Iterator<RestVO> It = list.iterator();
//		while(It.hasNext()){
//			RestVO vo = It.next();
//			System.out.println("이름:"+vo.getUser_name());
//		}	
//	}	
//	
//	@Test
//	public void updateTest() throws Exception{
//		RestVO vo = new RestVO();
//		vo.setTitle("제목");
//		vo.setContent("내용");
//		vo.setUser_name("유저네임");
//		vo.setBoard_no(2);
//		
//		dao.update(vo);
//	}
//
//	@Test
//	public void deleteTest() throws Exception{
//	
//		dao.delete(3);
//	}
}
