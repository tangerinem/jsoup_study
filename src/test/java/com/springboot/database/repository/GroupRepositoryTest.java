package com.springboot.database.repository;

import com.springboot.database.data.entity.BabyLion;
import com.springboot.database.data.entity.Group;
import com.springboot.database.data.repository.BabyLionRepository;
import com.springboot.database.data.repository.GroupRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GroupRepositoryTest {

    @Autowired
    BabyLionRepository babyLionRepository;

    @Autowired
    GroupRepository groupRepository;

    @Test
    void relationshipTest(){
        // 테스트 데이터 생성
        BabyLion babyLion = new BabyLion();
        babyLion.setName("유멋사");
        babyLion.setEmail("kangnam@likelion.org");
        babyLion.setNumber("011-1234-5678");
        babyLion.setPassword("0000");
        babyLion.setProfile("none");


        babyLionRepository.save(babyLion);

        Group group = new Group();
        group.setName("멋쟁이사자처럼");
        group.getMembers().add(babyLion);

        groupRepository.save(group);

        List<BabyLion> members = groupRepository.findById(1L).get().getMembers();

        for(BabyLion foundBabyLion : members){
            System.out.println(babyLion);
        }
    }
}
