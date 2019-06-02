package org.ls.service.impl;

import java.util.List;

import org.ls.entity.LeaveSituation;
import org.ls.mapper.LeaveSituationMapper;
import org.ls.service.LeaveSituationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeaveSituationServiceImpl implements LeaveSituationService{

	@Autowired
	private LeaveSituationMapper leaveSituationMapper;
	
	@Override
	public List<LeaveSituation> queryLeaveList(String username) {
		return leaveSituationMapper.queryLeaveSituationByUsername(username);
	}

	@Override
	public LeaveSituation insertLeave(LeaveSituation leave,String username) {
		int count =  leaveSituationMapper.insertLeaveSituation(leave, username);
		if(count == 1) {
			return leave;
		}
		return null;
	}

}
