package com.lx.miaosha.vo;

import com.lx.miaosha.validator.IsMobile;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotNull;

@Setter
@Getter
public class LoginVo {
	
	@NotNull
	@IsMobile
	private String mobile;
	
	@NotNull
	@Length(min=32)
	private String password;

	@Override
	public String toString() {
		return "LoginVo [mobile=" + mobile + ", password=" + password + "]";
	}
}
