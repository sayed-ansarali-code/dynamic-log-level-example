package dynamic.log.level.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/log")
public class LoggingController {
	Logger logger = LoggerFactory.getLogger(LoggingController.class);

	@GetMapping
	public String log() {
		logger.trace("This is a TRACE level message");
		logger.debug("This is a DEBUG level message");
		logger.info("This is an INFO level message");
		logger.warn("This is a WARN level message");
		logger.error("This is an ERROR level message");
		return "See the log for details";
	}
}