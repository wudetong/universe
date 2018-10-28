package com.zcf.universe.entity;

import com.zcf.universe.common.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Table;


@Setter
@Getter
@Table(name = "user")
public class User extends BaseEntity {

    @Column(name = "user_name")
    private String userName;
    private String password;
    @Column(name = "nick_name")
    private String nickName;
}
