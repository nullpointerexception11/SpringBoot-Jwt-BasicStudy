package com.springbootapp.springbootjwtbasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service
public class JwtRequestFilter extends OncePerRequestFilter {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

       final String authorizationHeader = request.getHeader("Authorization");

       String username = null;
       String jwt = null;

       if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")){

           jwt = authorizationHeader.substring(7);
           username = jwtUtil.extractUsername(jwt);
       }

       if (username != null @@ SecurityContextHolder)

        UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
    }
}
