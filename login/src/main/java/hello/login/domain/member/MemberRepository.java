package hello.login.domain.member;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.*;

@Slf4j
@Repository
public class MemberRepository {
    // static
    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;


    public Member save(Member member) {
        member.setId(++sequence);
        log.info("save: member={}", member);
        store.put(member.getId(), member);

        return member;
    }

    public Member findById(Long id) {
        return store.get(id);
    }
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

//    -----------------버전1------------------------
//    옵셔널 사용 X
//    public Member findByLoginId1(String loginId) {
//        List<Member> all = findAll();
//        for (Member member : all) {
//            if (member.getLoginId().equals(loginId)) {
//                return member;
//            }
//        }
//        return null;
//    }

//    -----------------버전2------------------------
//    Optional 이라는 것은 Optional 이라는 통이있고 T 객체가 있을 수이도 있고 없을 수 도 있는 것
//    public Optional<Member> findByLoginId(String loginId) {
//        List<Member> all = findAll();
//        for (Member member : all) {
//            if (member.getLoginId().equals(loginId)) {
//                return Optional.of(member);
//            }
//        }
//        return Optional.empty();
//    }

//    -----------------버전3------------------------
//    list 를 stream으로 바꾸면, 마치 루프를 도는 것 처럼
    public Optional<Member> findByLoginId(String loginId) {
        return findAll().stream()
                .filter(member -> member.getLoginId().equals(loginId))
                .findFirst();
    }
    public void clearStore(){
        store.clear();
    }

}
