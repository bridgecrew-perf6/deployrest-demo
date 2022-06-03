package com.craftsman.deployrest.demo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeanModel {

	private Integer id;
	private String name;
	private String description;

}
