package com.spring.web.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class CartVO {
	private int id;
	private int user_id;
	private int menu_id;
	private int count;
}
