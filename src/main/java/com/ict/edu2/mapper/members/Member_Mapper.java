package com.ict.edu2.mapper.members ;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.ict.edu2.model.members.MemberVO;

@Mapper

public interface Member_Mapper {
    List<MemberVO> getList() ;
    int getIDCnt(String id) ;
    MemberVO getMemberOne(String id);
    int getMemberAdd(MemberVO vo);
}