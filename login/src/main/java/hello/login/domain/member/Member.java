package hello.login.domain.member;


import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Member {

    private Long id; // db 에서 저장 및 관리될 id

    @NotEmpty
    private String loginId; // 로그인 id
    @NotEmpty
    private String password; // 로그인 pass
    @NotEmpty
    private String name;   // 사용자 이름



}
