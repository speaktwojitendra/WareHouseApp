package com.spring_jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;
@Transactional
public interface MyInterface extends JpaRepository<User_Detail,Integer> {
	public List<User_Detail> findByUserName(String username) ;
	@Query(value="select * from user_details",nativeQuery = true)
public  List<User_Detail> getAllUsers();
@Modifying
@Query(value="insert into user_details values(?1,?2,?3)",nativeQuery = true)
public int insertByPositionalParamIndex(int id,String pass,String name);
@Modifying
@Query(value = "insert into user_details (u_id,u_pass,U_name) values(:id,:pass,:name)",nativeQuery = true)
public int insertByPositionalParamname(@Param("id") int id , @Param("pass")String pass,@Param("name")String name);
}

