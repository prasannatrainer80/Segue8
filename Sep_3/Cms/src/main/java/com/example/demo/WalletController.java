package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {

	@Autowired
	private WalletService walletService;
	
	@GetMapping(value="/customerWallet/{cid}")
	public List<Wallet> showCustomerWallet(@PathVariable int cid) {
		return walletService.showWalletByCustomerId(cid);
	}
	
	@GetMapping(value="/showCustomerWalletInfo/{cid}/{walType}")
	public Wallet showCustomerWalInfo(@PathVariable int cid, @PathVariable String walType) {
		return walletService.searchByWallet(cid, walType);
	}
}
