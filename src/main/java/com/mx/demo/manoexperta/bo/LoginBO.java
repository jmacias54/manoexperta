package com.mx.demo.manoexperta.bo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mx.demo.manoexperta.model.Token;
import com.mx.demo.manoexperta.repository.TokenRepository;
import com.mx.demo.manoexperta.repository.UserRepository;
import com.mx.demo.manoexperta.response.ResponseLogin;

@Component
public class LoginBO {
	@Autowired
	private TokenRepository tokenRepository;
	@Autowired
	private UserRepository userRepository;

	public ResponseLogin login(String pass, String user) {
		ResponseLogin response = new ResponseLogin();
		Integer userId = 0;

		try {

			userId = userRepository.getIdByUserAndPassword(user, pass);

			if (userId != 0) {

				tokenRepository.deleteByUserId(userId);

				String token = UUID.randomUUID().toString();
				Date currentDate = new Date();
				Calendar c = Calendar.getInstance();
				c.setTime(currentDate);
				c.add(Calendar.HOUR, 1);
				Date currentDatePlusOneHour = c.getTime();

				Date expiry = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(currentDatePlusOneHour.toString());

				Token tokenObj = new Token();
				tokenObj.setExpiry(expiry);
				tokenObj.setUserid(userId);
				tokenObj.setToken(token);

				tokenRepository.save(tokenObj);

				response.setErrorcode("OK");
				response.setErrormsg("OK");
				response.setSuccess(true);
				response.setToken(token);

			} else {

				response.setErrorcode("INVALID");
				response.setErrormsg("OK");
				response.setSuccess(false);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.setErrorcode("TOKEN");
			response.setErrormsg(e.getMessage());
			response.setSuccess(false);
			return response;
		}

		return response;

	}

}
