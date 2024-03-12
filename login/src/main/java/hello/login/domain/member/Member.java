package hello.login.domain.member;


import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Member {

    private Long id; // db 에서 저장 및 관리될 id

    @NotEmpty(message = "절대로! 비어 있을 수 없습니다.")
    private String loginId; // 로그인 id
    @NotEmpty(message = "진짜때! 비어 있을 수 없습니다.")
    private String password; // 로그인 pass
    @NotEmpty(message = "제발!! 비어 있을 수 없습니다.")
    private String name;   // 사용자 이름



}
