package com.lx.miaosha.rabbitmq;
import com.lx.miaosha.domain.MiaoshaUser;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MiaoshaMessage {
	private MiaoshaUser user;
	private long goodsId;
}
