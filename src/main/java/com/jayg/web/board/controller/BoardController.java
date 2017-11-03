package com.jayg.web.board.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.jayg.web.board.service.BoardService;
import com.jayg.web.board.vo.BoardVO;
import com.jayg.web.board.vo.PageVO;

@RestController
@RequestMapping("/board")
public class BoardController {
	protected Logger logger = Logger.getLogger(BoardController.class);
	
	@Autowired
	BoardService boardService;

	@RequestMapping(value = "/list",method = RequestMethod.GET, produces="application/json;charset=UTF-8")
	public PageVO selectRowList(
			@RequestParam(value = "page", required=false) Integer page, 
			@RequestParam(value = "rows", required=false) Integer rows,
			@RequestParam(value = "sort", required=false) Integer sort) {
		PageVO pageVO = new PageVO();
		
		page = page == null ? 0 : page;
		rows = rows == null ? 0 : rows;
		sort = sort == null ? 0 : sort;
		
		pageVO.setCurrentPageNo(page);
		pageVO.setRowCount(rows);
		pageVO.setSort(sort);

		pageVO.setTotalCount(boardService.getListCount());
		pageVO.setList(boardService.getList(pageVO));
		
		return pageVO;
	}

	@RequestMapping(value = "/{seq}", method = RequestMethod.GET, produces="application/json;charset=UTF-8")
	public BoardVO selectRow(@PathVariable("seq") String seq){
		return boardService.get(Integer.parseInt(seq));
	}

	@RequestMapping(method = RequestMethod.POST, produces="application/json;charset=UTF-8")
	public int insertRow(BoardVO vo) {
		logger.info(vo);
		boardService.insert(vo);
		return 0;
	}

	@RequestMapping(method = RequestMethod.PUT, produces="application/json;charset=UTF-8")
	public int updateRow(BoardVO vo){
		logger.info("PUT : " + vo);
		boardService.update(vo);
		return 0;
	}
	
	@RequestMapping(value = "/{seq}", method = RequestMethod.DELETE, produces="application/json;charset=UTF-8")
	public int deleteRow(@PathVariable("seq") String seq){
		logger.info("Delete : " + seq);
		return 0;
	}
	
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public String uploadFile(@RequestParam("file") MultipartFile file) {
		
		try {
	        /**
	         * Set the path where to save the file.
	         * ex. "C:\\images\\" + file.getOriginalFilename() //win
	         * ex. "/images/" + file.getOriginalFilename() //nix
	         */
	        file.transferTo(new File(file.getOriginalFilename()));
	        
	    } catch (IllegalStateException e) {
	        
	    } catch (IOException e) {
	        
	    }
	    return null;
	}
	
}
