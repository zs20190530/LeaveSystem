package org.ls.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.ls.entity.LeaveSituation;

public interface LeaveSituationMapper {
	@Select("select * from leave_situation where username = #{username}")
	List<LeaveSituation> queryLeaveSituationByUsername(@Param("username") String username);

	@Insert("insert into leave_situation(apply_date,leave_type,begin_time,end_time,days,status,username) "
			+ "values (#{leave.apply_date},#{leave.leave_type},#{leave.begin_time},#{leave.end_time},#{leave.days},'未审批', #{username})")
	int insertLeaveSituation(@Param("leave") LeaveSituation leave, @Param("username") String username);
	
	
}
