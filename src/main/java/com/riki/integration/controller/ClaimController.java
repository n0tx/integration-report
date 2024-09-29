package com.riki.integration.controller;

import com.riki.integration.model.Claim;
import com.riki.integration.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/claims")
public class ClaimController {

    @Autowired
    private ClaimService claimService;

    @GetMapping
    public ResponseEntity<List<Claim>> getAllClaims() {
        return new ResponseEntity<>(claimService.findClaimAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Claim> createClaim(@RequestBody Claim claim) {
        return new ResponseEntity<>(claimService.saveClaim(claim), HttpStatus.CREATED);
    }

}
