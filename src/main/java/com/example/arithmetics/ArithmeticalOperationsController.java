package com.example.arithmetics;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArithmeticalOperationsController {

	@RequestMapping(value = "/sum", method = RequestMethod.GET)
	public ResponseEntity<String> sum(@RequestParam Integer number1, @RequestParam Integer number2, @RequestParam Integer number3) {
		return ResponseEntity.ok(number1 + " + " + number2 + " + " + number3 + " = " + (number1 + number2 + number3));
	}

	@RequestMapping(value = "/subtract", method = RequestMethod.GET)
	public ResponseEntity<String> subtract(@RequestParam Integer number1, @RequestParam Integer number2) {
		return ResponseEntity.ok(number1 + " - " + number2 + " = " + (number1 - number2));
	}

	@RequestMapping(value = "/multiply/{multiplicand}/{multiplier}", method = RequestMethod.GET)
	public ResponseEntity<String> multiply(@PathVariable(value = "multiplicand") Integer number1, @PathVariable(value = "multiplier") Integer number2) {
		return ResponseEntity.ok(number1 + " * " + number2 + " = " + (number1 * number2));
	}

	@RequestMapping(value = "/divide/{dividend}/{divisor}", method = RequestMethod.GET)
	public ResponseEntity<String> divide(@PathVariable(value = "dividend") Integer number1, @PathVariable(value = "divisor") Integer number2) {
		float quotient = (float) number1 / number2;
		return ResponseEntity.ok(number1 + " / " + number2 + " = " + quotient);
	}
}
