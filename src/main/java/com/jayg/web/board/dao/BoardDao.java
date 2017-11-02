package com.jayg.web.board.dao;

import java.util.List;

import com.jayg.web.board.vo.BoardVO;


public interface BoardDao {
	List<BoardVO> getList();

	BoardVO get(int seq);

	void insert(BoardVO vo);

	void update(BoardVO vo);
	
	int getListCount();
}
