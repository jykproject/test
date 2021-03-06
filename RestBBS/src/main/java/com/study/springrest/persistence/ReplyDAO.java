package com.study.springrest.persistence;

import java.util.List;

import com.study.springrest.domain.ReplyVO;

public interface ReplyDAO {
	public ReplyVO get(int reply_no);
	public List<ReplyVO> getList();
	public void insert(ReplyVO vo);
	public void update(ReplyVO vo);
	public void delete(int reply_no);
}
