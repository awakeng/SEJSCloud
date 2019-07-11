package model.domain;

import lombok.Data;
import lombok.ToString;

@Data // -- DTO클래스에만 쓰는것
@ToString



public class Customer {
	@ToString.Exclude private String name;
	 private int age;

}
