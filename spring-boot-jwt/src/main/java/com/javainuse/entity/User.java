package com.javainuse.entity;

import java.util.Collection; 
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority; 
import org.springframework.security.core.userdetails.UserDetails; 

@Entity 
@Table(name = "user_tbl") 
public class User implements UserDetails { 

   /** 
   * 
   */ 
   private static final long serialVersionUID = 1L;

   @Id 
   private String username; 
   private String password; 
   private String email;

   public String getEmail() {
	return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User() { 
	   } 
   public User(String username, String password, String email) { 
      this.username = username; 
      this.password = password; 
      this.email = email;
   } 
   @Override 
   public Collection<? extends GrantedAuthority> getAuthorities() { 
      return List.of(() -> "read"); 
   }
   @Override
   public String getPassword() {    
      return password; 
   } 
   public void setPassword(String password) { 
      this.password = password; 
   } 
   @Override 
   public String getUsername() { 
      return username; 
   } 
   public void setUsername(String username) { 
      this.username = username; 
   } 
   @Override 
   public boolean isAccountNonExpired() { 
      return true; 
   } 
   
   @Override public boolean isCredentialsNonExpired() { 
      return true; 
   } 
   @Override public boolean isEnabled() { 
   return true; 
   }
@Override
public boolean isAccountNonLocked() {
	// TODO Auto-generated method stub
	return false;
} 
   
   
	/*
	 * @Override public Collection<? extends GrantedAuthority> getAuthorities() { //
	 * TODO Auto-generated method stub return null; }
	 */
}