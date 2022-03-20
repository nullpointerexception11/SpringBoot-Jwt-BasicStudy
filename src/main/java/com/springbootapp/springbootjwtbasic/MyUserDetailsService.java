package com.springbootapp.springbootjwtbasic;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {
    // JWT icin UsertDetailsService mutlaka create edilmeli. Override method ile App'e user upload edilmeli

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //bu method App'a username, password ve authorizes tanimladi--->cubuk adam tum vasiflariyla create edildi
        return new User("admin", "nimda", new ArrayList<>());
        // new ArrayList --> collection type authorize birden fazla ve sabit oldugu icin
        //depolayacak bit bos array create edildi
    }
}
