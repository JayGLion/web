package com.jayg.web.board.dao;

import java.util.List;

import com.jayg.web.board.vo.BoardVO;
import com.jayg.web.board.vo.PageVO;


public interface BoardDao {
	List<BoardVO> getList(PageVO vo);
	
	List<BoardVO> getListAll();

	BoardVO get(int seq);

	void insert(BoardVO vo);

	void update(BoardVO vo);
	
	int getListCount();
}
