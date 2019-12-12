package com.student.demo.model.beans;

import com.student.demo.model.User;
import org.springframework.web.context.annotation.ApplicationScope;

import java.io.Serializable;
@ApplicationScope
public class UserBean implements Serializable {
    public User user;
    public boolean isActive;

}
