package app.core.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import app.core.exception.CouponSystemException;
import app.core.repositories.CouponRepository;

@Component
public class CouponExpirationDailyJob {
	@Autowired
	private CouponRepository couponRepository;

	@Transactional
	@Scheduled(cron = "0 00 00 ? * *")
//	@Scheduled(timeUnit = TimeUnit.SECONDS, fixedRate = 3)
	public void doAllDay() {
		try {
			couponRepository.deleteExpiredPurchasedCoupons();
			couponRepository.deleteExpiredCoupons();
		} catch (CouponSystemException e) {
			System.out.println(e);
		}
	}

}
