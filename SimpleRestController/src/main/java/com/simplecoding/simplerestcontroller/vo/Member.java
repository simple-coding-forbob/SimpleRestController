package com.simplecoding.simplerestcontroller.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class Member {
    String id;      // 회원 id
    String name;    // 회원명
}
