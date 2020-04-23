package com.example.web.dao;

import com.example.web.pojo.MmallUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Repository
public class MmallUserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<MmallUser> getAllJdbcVersion(){
        String SELECT_ALL_USER_SQL = new String("select id, username," +
                "password, email, phone, question, answer, role, create_time, update_time from " +
                "mmall_user");
        //List<MmallUser> mmallUsers = new ArrayList<>();
        return jdbcTemplate.query( SELECT_ALL_USER_SQL, new RowMapper<MmallUser>() {
            @Override
            public MmallUser mapRow(ResultSet resultSet, int i) throws SQLException {
                Integer id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                String question = resultSet.getString("question");
                String answer = resultSet.getString("answer");
                System.out.println(question);
                System.out.println(answer);
                Integer role = resultSet.getInt("role");
                Date createTime = resultSet.getDate("create_time");
                Date updateTime = resultSet.getDate("update_time");
                return new MmallUser(id, username, password, email, phone, question, answer, role,
                        createTime, updateTime);

            }
        });
    }
}
