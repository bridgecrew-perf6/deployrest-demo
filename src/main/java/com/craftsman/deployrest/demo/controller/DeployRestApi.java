package com.craftsman.deployrest.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.craftsman.deployrest.demo.domain.dto.BeanDto;
import com.craftsman.deployrest.demo.domain.dto.BeanDtoList;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

public interface DeployRestApi {

	/**
	 * PUT REST Service
	 */
	@Operation(method = "update", summary = "Create a new record", tags = { "DeployRest" })
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "record created"),
			@ApiResponse(responseCode = "400", description = "invalid user operation"),
			@ApiResponse(responseCode = "404", description = "url not found") })
	@PutMapping(value = "/restservice", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Boolean> putOperation(@RequestBody BeanDto in);

	/**
	 * POST REST Service
	 */
	@Operation(method = "add", summary = "Update a record", tags = { "DeployRest" })
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "record created"),
			@ApiResponse(responseCode = "400", description = "invalid user operation"),
			@ApiResponse(responseCode = "404", description = "url not found") })
	@PostMapping(value = "/restservice", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Boolean> postOperation(@RequestBody BeanDto in);

	/**
	 * DELETE REST Service
	 */
	@Operation(method = "delete", summary = "Delete a record", tags = { "DeployRest" })
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "record created"),
			@ApiResponse(responseCode = "400", description = "invalid user operation"),
			@ApiResponse(responseCode = "404", description = "url not found") })
	@DeleteMapping(value = "/restservice/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Boolean> deleteOperation(@PathVariable(value = "id") Integer id);

	/**
	 * GET REST Service
	 */
	@Operation(method = "search", summary = "Get all records", tags = { "DeployRest" })
	@ApiResponses(value = { 
			@ApiResponse(responseCode = "200", description = "record created"),
			@ApiResponse(responseCode = "400", description = "invalid user operation"),
			@ApiResponse(responseCode = "404", description = "url not found") })
	@GetMapping(value = "/restservice/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<BeanDtoList> getOperation(@Parameter(description = "search operation by Id") @PathVariable(value = "id") Integer id);

	//@Operation(summary = "Finds Pets by status", description = "Multiple status values can be provided with comma separated strings", security = {
	//		@SecurityRequirement(name = "petstore_auth", scopes = { "write:pets", "read:pets" }) }, tags = { "pet" })
	//@ApiResponses(value = {
	//		@ApiResponse(responseCode = "200", description = "successful operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Pet.class)))),
	//		@ApiResponse(responseCode = "400", description = "Invalid status value") })
	//@GetMapping(value = "/pet/findByStatus", produces = { "application/xml", "application/json" })
	//default ResponseEntity<List<Object>> findPetsByStatus(@Parameter(explode = Explode.TRUE, name = "status", in = ParameterIn.QUERY, description = "Status values that need to be considered for filter", style = ParameterStyle.FORM, schema = @Schema(type = "string", defaultValue = "available", allowableValues = { "available", "pending", "sold" })) @Valid @RequestParam(value = "status", required = false) List<String> status) {
	//	return null;
	//}
	
}
