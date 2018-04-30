package com.beatus.goodbyeq.users.service.api;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;

import com.beatus.goodbyeq.users.exception.ResponseEntityException;
import com.beatus.goodbyeq.users.model.ItemDetailsDTO;
import com.beatus.goodbyeq.users.service.exception.GoodByeQCompanyServiceException;
import com.beatus.goodbyeq.users.validation.exception.GoodByeQValidationException;


public interface ItemsService {
	
	public ItemDetailsDTO fetchItemDetails(String addUserStr) throws GoodByeQValidationException, ClassNotFoundException, SQLException ;
	public String createBill(String scannedItemsStr) throws GoodByeQCompanyServiceException, 
	ResponseEntityException, ClassNotFoundException, JSONException, IOException, SQLException, com.beatus.goodbyeq.email.validation.exception.GoodByeQValidationException;
}
