package org.example.com

import org.quartz.JobExecutionContext
import org.quartz.JobExecutionException

class ScheduleEmail2Job {

	def mailingListEmailService

	static triggers = {}

	def execute(JobExecutionContext context) throws JobExecutionException {
		try {
			log.info("Job has been called, sending mail from ScheduleEmail2Job")
			//Call the sendEmail method in the email service
			mailingListEmailService.sendEmail(context.mergedJobDataMap)
		}
		catch (Throwable e) {
			throw new JobExecutionException(e.message, e)
		}
	}
}
