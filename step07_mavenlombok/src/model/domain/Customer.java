package model.domain;

import lombok.Data;
import lombok.ToString;

@Data // -- DTOŬ�������� ���°�
@ToString



public class Customer {
	@ToString.Exclude private String name;
	 private int age;

}
