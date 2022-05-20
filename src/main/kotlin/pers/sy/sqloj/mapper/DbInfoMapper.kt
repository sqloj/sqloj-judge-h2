package pers.sy.sqloj.mapper

import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select
import pers.sy.sqloj.entity.VersionDO

@Mapper
interface DbInfoMapper {

    @Select("SELECT H2VERSION();")
    fun version(): VersionDO
}