package com.study.spring.persistance;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.spring.domain.MemberVO;
import com.study.spring.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDAOImplTest {
	@Inject
	private MemberDAO dao;
	@Test
	public void test() {System.out.println("Test DAO = "+dao); }
	@Test
	public void getNowTest(){System.out.println("Test DAO now = "+dao.getNow()); }
	@Test
	public void insertMemberTest() throws Exception{
		MemberVO vo = new MemberVO();
		vo.setUser_id("id"+System.currentTimeMillis());
		vo.setUser_name("나임");
		vo.setPw("비번임");
		vo.setEmail("이메일이당");
		
		dao.insertMember(vo);
	}
	
	@Test
	public void getTest() throws Exception{
		MemberVO vo = dao.get("id");
		System.out.println("이름:"+vo.user_name);
	}
	
	@Test
	public void getListTest() throws Exception{
		List<MemberVO> list = dao.getList();
		Iterator<MemberVO> It = list.iterator();
		while(It.hasNext()){
			MemberVO vo = It.next();
			System.out.println("이름:"+vo.user_name);
		}	
	}	
	
	@Test
	public void updateTest() throws Exception{
		MemberVO vo = new MemberVO();
		vo.setUser_id("id");
		vo.setUser_name("나임2342");
		vo.setPw("비번임234");
		vo.setEmail("이메일이당");
		
		dao.update(vo);
	}

	@Test
	public void deleteTest() throws Exception{
	
		dao.delete("id");
	}
}
