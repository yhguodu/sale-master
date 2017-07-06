package com.yhguodu.sale.service.user.mapper;

import com.yhguodu.sale.common.dao.SaleUser;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    @Select("select * from sale_user where id = #{id}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "password", property = "password"),
            @Result(column = "mail", property = "email"),
            @Result(column = "address",property = "address"),
    })
    SaleUser getUserById(@Param("id") int id);

    @Select("select * from sale_user where name = #{name}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "password", property = "password"),
            @Result(column = "mail", property = "email"),
            @Result(column = "address",property = "address"),
    })
    SaleUser getUserByName(@Param("name") String name);

    @Insert("insert into sale_user(name, password, email,address)" +
            "values(#{name}, #{password}, #{email},#{address})"
    )
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    int insertUser(SaleUser user);

    @Select("delete from sale_user where id = #{id}")
    int deleteUser(@Param("id") int id);
}
