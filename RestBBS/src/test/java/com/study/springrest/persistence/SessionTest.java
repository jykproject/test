package com.study.springrest.persistence;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class SessionTest {
	
	@Inject
	private SqlSession sqlSession;
	
	@Test
	public void test() throws Exception{
		System.out.println("sqlSession:"+sqlSession);
	}
	
//	@Test
//	public void insertMemberTest() throws Exception{
//		RestVO vo = new RestVO();
//		vo.setTitle("����");
//		vo.setContent("����");
//		vo.setUser_name("��������");
//		dao.insert(vo);
//	}
//	
//	@Test
//	public void getTest() throws Exception{
//		RestVO vo = dao.get(2);
//		System.out.println("�̸�:"+vo.getUser_name());
//	}
//	
//	@Test
//	public void getListTest() throws Exception{
//		List<RestVO> list = dao.getList();
//		Iterator<RestVO> It = list.iterator();
//		while(It.hasNext()){
//			RestVO vo = It.next();
//			System.out.println("�̸�:"+vo.getUser_name());
//		}	
//	}	
//	
//	@Test
//	public void updateTest() throws Exception{
//		RestVO vo = new RestVO();
//		vo.setTitle("����");
//		vo.setContent("����");
//		vo.setUser_name("��������");
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
