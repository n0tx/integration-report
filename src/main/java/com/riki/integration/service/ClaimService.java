package com.riki.integration.service;


import com.riki.integration.model.Claim;

import java.util.List;

public interface ClaimService {

	List<Claim> findClaimAll();

	Claim saveClaim(Claim claim);
	
}
