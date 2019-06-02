package org.ls.mapper;

import org.apache.ibatis.annotations.Select;
import org.ls.entity.User;

public interface UserMapper {
	@Select("select * from user where username = #{username} and password = #{password}")
	User queryWithUsernameAndPassword(User user);
}
