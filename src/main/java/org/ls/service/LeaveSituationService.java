package org.ls.service;

import java.util.List;

import org.ls.entity.LeaveSituation;

public interface LeaveSituationService {
	List<LeaveSituation> queryLeaveList(String username);

	LeaveSituation insertLeave(LeaveSituation leave,String username);
}
