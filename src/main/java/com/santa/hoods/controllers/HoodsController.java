package com.santa.hoods.controllers;

import com.santa.hoods.model.Hood;
import com.santa.hoods.service.HoodsService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This @{@link HoodsController} has end points two expose to outside for getting result about hoods/
 */
@RestController
@RequestMapping("/hoodfiller")
public class HoodsController {

	private final HoodsService hoodsService;
	public HoodsController(HoodsService hoodsService){
		this.hoodsService=hoodsService;
	}

	/**
	 * This method will return the list of combination weights for hood
	 * @param hood  it contains capacity weights
	 * @return a List of weights combination
	 */
	@PostMapping
	public ResponseEntity doHoodCapacity( @Validated  @RequestBody Hood hood){
   return ResponseEntity.ok(hoodsService.doCapacityHood(hood));
	}

}
