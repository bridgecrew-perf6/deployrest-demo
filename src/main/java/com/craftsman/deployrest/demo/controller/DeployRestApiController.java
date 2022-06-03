package com.craftsman.deployrest.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.craftsman.deployrest.demo.domain.dto.BeanDto;
import com.craftsman.deployrest.demo.domain.dto.BeanDtoList;

@RestController
public class DeployRestApiController implements DeployRestApi {

	@Override
	public ResponseEntity<Boolean> putOperation(BeanDto in) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Boolean> postOperation(BeanDto in) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Boolean> deleteOperation(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<BeanDtoList> getOperation(Integer id) {
		return ResponseEntity.ok().body(new BeanDtoList());
	}

}
