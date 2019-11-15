package com.tobacco.mapper;

import com.tobacco.entities.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

@Mapper
public interface TestMapper extends JpaRepository<Test,Long> {
}
