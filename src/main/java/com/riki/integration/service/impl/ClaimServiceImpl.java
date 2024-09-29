package com.riki.integration.service.impl;


import com.riki.integration.model.Claim;
import com.riki.integration.repository.ClaimRepository;
import com.riki.integration.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimServiceImpl implements ClaimService {

	@Autowired
	private ClaimRepository claimRepository;


	@Override
	public List<Claim> findClaimAll() {
		return claimRepository.findAll();
	}

	@Override
	public Claim saveClaim(Claim claim) {
		return claimRepository.save(claim);
	}
}
