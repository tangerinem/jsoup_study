package com.springboot.database.repository;

import com.springboot.database.data.entity.BabyLion;
import com.springboot.database.data.entity.Hobby;
import com.springboot.database.data.repository.BabyLionRepository;
import com.springboot.database.data.repository.HobbyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class HobbyRepositoryTest {

    @Autowired
    BabyLionRepository babyLionRepository;

    @Autowired
    HobbyRepository hobbyRepository;

    @Test
    void relationshipTest1() {

        Hobby hobby = new Hobby();
        hobby.setHobby("알고리즘 문제풀이");

        hobbyRepository.save(hobby);

        BabyLion babyLion = new BabyLion();
        babyLion.setName("최멋사");
        babyLion.setEmail("babylion@likelion.org");
        babyLion.setNumber("010-1234-5678");
        babyLion.setPassword("1234");
        babyLion.setProfile("pic");
        babyLion.setHobby(hobby);

        babyLionRepository.save(babyLion);

        System.out.println(
                "babylion : " + babyLionRepository.findById(1L).orElseThrow(RuntimeException::new));

        System.out.println("hobby : " + babyLionRepository.findById(1L).orElseThrow(RuntimeException::new).getHobby());
    }
    @Test
    void relationshipTest() {
        // 테스트 데이터 생성
        Hobby hobby = new Hobby();
        hobby.setHobby("운동");

        hobbyRepository.save(hobby);

        BabyLion babyLion1 = new BabyLion();
        babyLion1.setName("김멋사");
        babyLion1.setEmail("babylions@likelion.org");
        babyLion1.setNumber("010-1234-5670");
        babyLion1.setPassword("1111");
        babyLion1.setProfile("pic0");
        babyLion1.setHobby(hobby);


        BabyLion babyLion2 = new BabyLion();
        babyLion2.setName("이멋사");
        babyLion2.setEmail("lion@likelion.org");
        babyLion2.setNumber("010-1111-1111");
        babyLion2.setPassword("0987");
        babyLion2.setProfile("pic1");
        babyLion2.setHobby(hobby);

        BabyLion babyLion3 = new BabyLion();
        babyLion3.setName("장멋사");
        babyLion3.setEmail("babylion12@likelion.org");
        babyLion3.setNumber("010-0987-6543");
        babyLion3.setPassword("4567");
        babyLion3.setProfile("pic2");
        babyLion3.setHobby(hobby);

        babyLionRepository.save(babyLion1);
        babyLionRepository.save(babyLion2);
        babyLionRepository.save(babyLion3);

        System.out.println("check 1");

        List<BabyLion> babyLions = hobbyRepository.findById(hobby.getId()).get()
                .getBabyLionList();

        for (BabyLion babyLion : babyLions) {
            System.out.println(babyLion);
        }

    }
}
